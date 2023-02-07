import edu.ucsd.cse232b.parsers.GrammarBaseVisitor;
import edu.ucsd.cse232b.parsers.GrammarParser;
import org.w3c.dom.*;
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
    private static final List<Node> trueNode = Collections.singletonList(new Node() {
        @Override
        public String getNodeName() {
            return null;
        }

        @Override
        public String getNodeValue() throws DOMException {
            return null;
        }

        @Override
        public void setNodeValue(final String nodeValue) throws DOMException {

        }

        @Override
        public short getNodeType() {
            return 0;
        }

        @Override
        public Node getParentNode() {
            return null;
        }

        @Override
        public NodeList getChildNodes() {
            return null;
        }

        @Override
        public Node getFirstChild() {
            return null;
        }

        @Override
        public Node getLastChild() {
            return null;
        }

        @Override
        public Node getPreviousSibling() {
            return null;
        }

        @Override
        public Node getNextSibling() {
            return null;
        }

        @Override
        public NamedNodeMap getAttributes() {
            return null;
        }

        @Override
        public Document getOwnerDocument() {
            return null;
        }

        @Override
        public Node insertBefore(final Node newChild, final Node refChild) throws DOMException {
            return null;
        }

        @Override
        public Node replaceChild(final Node newChild, final Node oldChild) throws DOMException {
            return null;
        }

        @Override
        public Node removeChild(final Node oldChild) throws DOMException {
            return null;
        }

        @Override
        public Node appendChild(final Node newChild) throws DOMException {
            return null;
        }

        @Override
        public boolean hasChildNodes() {
            return false;
        }

        @Override
        public Node cloneNode(final boolean deep) {
            return null;
        }

        @Override
        public void normalize() {

        }

        @Override
        public boolean isSupported(final String feature, final String version) {
            return false;
        }

        @Override
        public String getNamespaceURI() {
            return null;
        }

        @Override
        public String getPrefix() {
            return null;
        }

        @Override
        public void setPrefix(final String prefix) throws DOMException {

        }

        @Override
        public String getLocalName() {
            return null;
        }

        @Override
        public boolean hasAttributes() {
            return false;
        }

        @Override
        public String getBaseURI() {
            return null;
        }

        @Override
        public short compareDocumentPosition(final Node other) throws DOMException {
            return 0;
        }

        @Override
        public String getTextContent() throws DOMException {
            return null;
        }

        @Override
        public void setTextContent(final String textContent) throws DOMException {

        }

        @Override
        public boolean isSameNode(final Node other) {
            return false;
        }

        @Override
        public String lookupPrefix(final String namespaceURI) {
            return null;
        }

        @Override
        public boolean isDefaultNamespace(final String namespaceURI) {
            return false;
        }

        @Override
        public String lookupNamespaceURI(final String prefix) {
            return null;
        }

        @Override
        public boolean isEqualNode(final Node arg) {
            return false;
        }

        @Override
        public Object getFeature(final String feature, final String version) {
            return null;
        }

        @Override
        public Object setUserData(final String key, final Object data, final UserDataHandler handler) {
            return null;
        }

        @Override
        public Object getUserData(final String key) {
            return null;
        }
    });
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
        final List<Node> ans = new ArrayList<>();
        for(final Node node: nodeList) {
            if(!ans.contains(node)) {
                ans.add(node);
            }
        }
        return ans;
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


        return curNodeList;
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

        return curNodeList;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitParent(final GrammarParser.ParentContext ctx) {
        curNodeList = getParentsFromCurNode();

        return curNodeList;
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

        return curNodeList;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitAtrributeName(final GrammarParser.AtrributeNameContext ctx) {
        final List<Node> ans = new ArrayList<>();
        for (final Node node : curNodeList) {
            final NamedNodeMap namedNodeMap = node.getAttributes();

            if (namedNodeMap != null && namedNodeMap.getNamedItem(ctx.ID().getText()) != null) {
                ans.add(node);
            }
        }
        curNodeList = ans;
        return curNodeList;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitRpChildren(final GrammarParser.RpChildrenContext ctx) {
        visit(ctx.rp(0));
        curNodeList = visit(ctx.rp(1));

        return curNodeList;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitRpDescendant(final GrammarParser.RpDescendantContext ctx) {
        visit(ctx.rp(0));
        final List<Node> nodeList = getAllDescendantFromCurNode();
        curNodeList.addAll(nodeList);
        curNodeList = visit(ctx.rp(1));

        return curNodeList;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitRpParentheses(final GrammarParser.RpParenthesesContext ctx) {
        return visit(ctx.rp());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitText(final GrammarParser.TextContext ctx) {
        final List<Node> ans = new ArrayList<>();
        for (final Node node : curNodeList) {
            final NodeList childNodeList = node.getChildNodes();

            for (int i = 0; i < childNodeList.getLength(); i++) {
                if (childNodeList.item(i).getNodeType() == Node.TEXT_NODE)
                    ans.add(childNodeList.item(i));
            }
        }
        curNodeList = ans;

        return curNodeList;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitRpAppend(final GrammarParser.RpAppendContext ctx) {
        final List<Node> initialCurNodeList = new ArrayList<>(curNodeList);
        List<Node> ans0 = visit(ctx.rp(0));
        curNodeList = initialCurNodeList;
        final List<Node> ans1 = visit(ctx.rp(1));
        ans0.addAll(ans1);
        ans0 = unique(ans0);
        curNodeList = ans0;
        return curNodeList;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitRpFilter(final GrammarParser.RpFilterContext ctx) {
        final List<Node> ans = new ArrayList<>();
        final List<Node> nodeList = visit(ctx.rp());

        for (final Node node : nodeList) {

            curNodeList = new ArrayList<>();
            curNodeList.add(node);

            if (visit(ctx.filter()).size() != 0)
                ans.add(node);
        }
        curNodeList = ans;

        return curNodeList;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitFilterSame(final GrammarParser.FilterSameContext ctx) {
        final List<Node> initialCurNodeList = new ArrayList<>(curNodeList);
        final List<Node> node0List = visit(ctx.rp(0));
        curNodeList = initialCurNodeList;
        final List<Node> node1List = visit(ctx.rp(1));


        for (final Node node0 : node0List) {
            for (final Node node1 : node1List) {
                if (node0.isSameNode(node1)) {
                    return trueNode;
                }
            }
        }
        return Collections.emptyList();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitFilterEqual(final GrammarParser.FilterEqualContext ctx) {
        final List<Node> initialCurNodeList = new ArrayList<>(curNodeList);
        final List<Node> node0List = visit(ctx.rp(0));
        curNodeList = initialCurNodeList;
        final List<Node> node1List = visit(ctx.rp(1));


        for (final Node node0 : node0List) {
            for (final Node node1 : node1List) {
                if (node0.isEqualNode(node1)) {
                    return trueNode;
                }
            }
        }
        return Collections.emptyList();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitFilterNot(final GrammarParser.FilterNotContext ctx) {
        final List<Node> nodeList = visit(ctx.filter());
        if(nodeList.isEmpty()) {
            // true
            return curNodeList;
        } else {
            return Collections.emptyList();
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitFilterOr(final GrammarParser.FilterOrContext ctx) {
        final List<Node> initialCurNodeList = new ArrayList<>(curNodeList);
        final List<Node> node0List = visit(ctx.filter(0));
        curNodeList = initialCurNodeList;
        final List<Node> node1List = visit(ctx.filter(1));

        if(node0List.isEmpty() || node1List.isEmpty()) {
            // any empty then false
            return Collections.emptyList();
        } else {
            return trueNode;
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitFilterAnd(final GrammarParser.FilterAndContext ctx) {
        final List<Node> initialCurNodeList = new ArrayList<>(curNodeList);
        final List<Node> node0List = visit(ctx.filter(0));
        curNodeList = initialCurNodeList;
        final List<Node> node1List = visit(ctx.filter(1));

        if(!node0List.isEmpty() && !node1List.isEmpty()) {
            // both not empty then true
            return trueNode;
        } else {
            return Collections.emptyList();
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitFilterRp(final GrammarParser.FilterRpContext ctx) {
        curNodeList = visit(ctx.rp());
        if(curNodeList.isEmpty()) {
            return Collections.emptyList();
        } else {
            return trueNode;
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitFilterParentheses(final GrammarParser.FilterParenthesesContext ctx) {
        return visit(ctx.filter());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitFilterString(final GrammarParser.FilterStringContext ctx) {
        curNodeList = visit(ctx.rp());
        final String constantString = ctx.StringConstant().getText();
        final String strNew = constantString.substring(1, constantString.length() - 1);
        for (final Node node : curNodeList) {
            final NamedNodeMap namedNodeMap = node.getAttributes();
            if (namedNodeMap != null && namedNodeMap.getNamedItem(strNew) != null) {
                return trueNode;
            }

            if (node.getNodeType() == Node.TEXT_NODE && node.getTextContent().equals(strNew))
                return trueNode;
        }

        return Collections.emptyList();
    }

}
