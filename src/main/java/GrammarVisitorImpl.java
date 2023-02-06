import edu.ucsd.cse232b.parsers.GrammarBaseVisitor;
import edu.ucsd.cse232b.parsers.GrammarParser;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;

public class GrammarVisitorImpl extends GrammarBaseVisitor<List<Node>> {
    private List<Node> curNodeList = new ArrayList<>();

    @Override
    public List<Node> visitApChildren(final GrammarParser.ApChildrenContext ctx) {
        visit(ctx.doc());   // visit the doc the get the absolute path
        return visit(ctx.rp());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitApDescendant(final GrammarParser.ApDescendantContext ctx) {
        visit(ctx.doc());
        curNodeList.addAll(getAllDescendantFromCurNode());

        return visit(ctx.rp());
    }

    private List<Node> getAllDescendantFromCurNode() {
        final List<Node> ans = new ArrayList<>();
        final Queue<Node> queue = new LinkedList<>(curNodeList);
        while (!queue.isEmpty()) {
            final int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                final Node node = queue.remove();
                // find children for the node
                final NodeList childNodes = node.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    final Node childNode = childNodes.item(j);
                    ans.add(childNode);
                    queue.add(childNode);
                }
            }
        }

        return unique(ans);
    }


    private List<Node> unique(final List<Node> nodeList) {
        return new ArrayList<>(new HashSet<>(nodeList));
    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitDocFile(final GrammarParser.DocFileContext ctx) {
        final List<Node> ans = new ArrayList<>();
        final File file = Paths.get("src/main/resources", ctx.fileName().getText()).toAbsolutePath().toFile();

        final DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        docFactory.setIgnoringElementContentWhitespace(true);
        final DocumentBuilder docBuilder;
        try {
            docBuilder = docFactory.newDocumentBuilder();
        } catch (final ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
        final Document doc;
        try {
            doc = docBuilder.parse(file);
        } catch (final SAXException | IOException e) {
            throw new RuntimeException(e);
        }
        ans.add(doc);
        curNodeList = ans;


        return ans;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitFile(final GrammarParser.FileContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitCur(final GrammarParser.CurContext ctx) {
        return new ArrayList<>(curNodeList);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitTagName(final GrammarParser.TagNameContext ctx) {
        final String tagName = ctx.ID().getText();
        final List<Node> ans = new ArrayList<>();

        // find the text node with name tagName
        curNodeList.stream().map(Node::getChildNodes)
                .forEach(nodeList -> IntStream.range(0, nodeList.getLength())
                        .mapToObj(nodeList::item)
                        .filter(childNode -> (childNode.getNodeType() == Node.ELEMENT_NODE) && tagName.equals(childNode.getNodeName()))
                        .forEach(ans::add));
        curNodeList = ans;

        return ans;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitParent(final GrammarParser.ParentContext ctx) {
        final List<Node> result = getParentsFromCurNode();
        curNodeList = result;

        return result;
    }

    private List<Node> getParentsFromCurNode() {
        final List<Node> ans = new ArrayList<>();
        for (final Node node : curNodeList) {
            ans.add(node.getParentNode());
        }

        return unique(ans);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitChilden(final GrammarParser.ChildenContext ctx) {
        final List<Node> ans = new ArrayList<>();
        for (final Node node : curNodeList) {
            IntStream.range(0, node.getChildNodes().getLength())
                    .mapToObj(i -> node.getChildNodes().item(i))
                    .forEach(ans::add);
        }
        curNodeList = ans;

        return ans;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitAtrributeName(final GrammarParser.AtrributeNameContext ctx) {
        final List<Node> result = new ArrayList<>();
        for (final Node node : curNodeList) {
            final NamedNodeMap namedNodeMap = node.getAttributes();

            if (namedNodeMap != null && namedNodeMap.getNamedItem(ctx.ID().getText()) != null) {
                result.add(node);
            }
        }
        curNodeList = result;
        return result;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitRpChildren(final GrammarParser.RpChildrenContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitRpDescendant(final GrammarParser.RpDescendantContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitRpParentheses(final GrammarParser.RpParenthesesContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitText(final GrammarParser.TextContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitRpAppend(final GrammarParser.RpAppendContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitRpFilter(final GrammarParser.RpFilterContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitFilterSame(final GrammarParser.FilterSameContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitFilterEqual(final GrammarParser.FilterEqualContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitFilterNot(final GrammarParser.FilterNotContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitFilterOr(final GrammarParser.FilterOrContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitFilterAnd(final GrammarParser.FilterAndContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitFilterRp(final GrammarParser.FilterRpContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitFilterParentheses(final GrammarParser.FilterParenthesesContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitFilterString(final GrammarParser.FilterStringContext ctx) {
        return visitChildren(ctx);
    }

}
