import edu.ucsd.cse232b.parsers.GrammarLexer;
import edu.ucsd.cse232b.parsers.GrammarParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

public class Main {
    public static void main(final String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Need the input query file and output location");
            System.exit(1);
        }

        final String queryFile = args[0];
        final String outputFile = args[1];
        final FileInputStream fileInputStream = new FileInputStream(queryFile);
        final ANTLRInputStream antlrInputStream = new ANTLRInputStream(fileInputStream);
        final GrammarLexer grammarLexer = new GrammarLexer(antlrInputStream);
        final CommonTokenStream commonTokenStream = new CommonTokenStream(grammarLexer);
        final GrammarParser grammarParser = new GrammarParser(commonTokenStream);
        final List<Node> ans = new GrammarVisitorImpl().visit(grammarParser.ap());

        final Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

        final Node ansNode = document.createElement("Result");
        for (final Node node : ans) {
            ansNode.appendChild(document.importNode(node, true));
        }
        document.appendChild(ansNode);

        final Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        transformer.transform(new DOMSource(document), new StreamResult(new FileOutputStream(outputFile)));
    }
}