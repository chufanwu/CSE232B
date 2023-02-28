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

    //following belong to xq
    private Map<String, List<Node>> variableMap = new HashMap<>();
    public Document doc = null;

    public GrammarVisitorImpl() {
        try {
            doc = DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder()
                    .newDocument();
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitXqChildren(final GrammarParser.XqChildrenContext ctx) {
        final List<Node> res = new ArrayList<>();
        for (final Node node : curNodeList) {
            final NodeList children = node.getChildNodes();
            for (int i = 0; i < children.getLength(); i++) {
                res.add(children.item(i));
            }
        }
        return res;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitXqAp(final GrammarParser.XqApContext ctx) {
        return visit(ctx.ap());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitXqAppend(final GrammarParser.XqAppendContext ctx) {
        List<Node> tmp = new ArrayList<>();
        final List<Node> storedList = new ArrayList<>(curNodeList);
        visit(ctx.xq(0));
        tmp.addAll(curNodeList);
        curNodeList = storedList;
        visit(ctx.xq(1));
        tmp.addAll(curNodeList);
        tmp = unique(tmp);
        return tmp;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitXqVariable(final GrammarParser.XqVariableContext ctx) {
        final String varText = ctx.var().getText();
        final List<Node> res = variableMap.getOrDefault(varText, new ArrayList<>());
        return res;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitXqParentheses(final GrammarParser.XqParenthesesContext ctx) {
        final List<Node> res = visit(ctx.xq());
        return res;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitXqDescendant(final GrammarParser.XqDescendantContext ctx) {
        curNodeList = visit(ctx.xq());
        final Queue<Node> queue = new ArrayDeque<>(curNodeList);
        final List<Node> res = new ArrayList<>(curNodeList);
        while (!queue.isEmpty()) {
            final Node node = queue.poll();
            if (node.hasChildNodes()) {
                final NodeList children = node.getChildNodes();
                for (int i = 0; i < children.getLength(); i++) {
                    final Node child = children.item(i);
                    res.add(child);
                    queue.add(child);
                }
            }
        }
        curNodeList = unique(curNodeList);
        visit(ctx.rp());
        return unique(curNodeList);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitXqString(final GrammarParser.XqStringContext ctx) {
        String text = ctx.StringConstant().getText();
        final int len = text.length();
        if (len < 2) {
            throw new IllegalArgumentException("Text must have at least two characters");
        }
        text = text.substring(1, len - 1);
        final List<Node> res = new ArrayList<>(Collections.singletonList(doc.createTextNode(text)));
        return res;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    //todo
    @Override
    public List<Node> visitXqQuery(final GrammarParser.XqQueryContext ctx) {
        final HashMap<String, List<Node>> storedMap = new HashMap<>(variableMap);

        final List<Node> result = new ArrayList<>();
        visitFLWR(ctx, 0, result);


        variableMap = storedMap;
        return result;
    }

    private void visitFLWR(final GrammarParser.XqQueryContext ctx, final int k, final List<Node> result) {
        if (k == ctx.forClause().var().size()) {
            if (ctx.letClause() != null) {
                visit(ctx.letClause());
            }
            if (ctx.whereClause() != null && visit(ctx.whereClause()) == null) {
                return;
            }

            result.addAll(visit(ctx.returnClause()));
            return;
        }

        final String var = ctx.forClause().var(k).getText();
        final List<Node> bind = visit(ctx.forClause().xq(k));

        for (final Node node : bind) {
            final Map<String, List<Node>> backup = new HashMap<>(variableMap);
            final List<Node> single = new ArrayList<>();

            single.add(node);
            variableMap.put(var, single);
            visitFLWR(ctx, k + 1, result);
            variableMap = backup;
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitXqtag(final GrammarParser.XqtagContext ctx) {
        String startTag = ((GrammarParser.XqBeginTagContext) ctx.beginTag()).ID().getText();
        String endTag = ((GrammarParser.XqEndTagContext) ctx.endTag()).ID().getText();

        if (!startTag.equals(endTag)) {
            throw new RuntimeException("Start tag does not match end tag");
        }

        Node resultNode = doc.createElement(startTag);
        for (Node node : visit(ctx.xq())) {
            Node child = doc.importNode(node, true);
            resultNode.appendChild(child);
        }

        List<Node> result = new ArrayList<>();
        result.add(resultNode);

        return result;
    }
    //todo

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitXqLet(final GrammarParser.XqLetContext ctx) {
        List<Node> ans = new ArrayList<>();
        final HashMap<String, List<Node>> storedMap = new HashMap<>(variableMap);
        visit(ctx.letClause());
        ans = visit(ctx.xq());
        variableMap = storedMap;
        return ans;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitVar(final GrammarParser.VarContext ctx) {
        return Collections.emptyList();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitXqBeginTag(final GrammarParser.XqBeginTagContext ctx) {
        return visit(ctx.ID());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitXqEndTag(final GrammarParser.XqEndTagContext ctx) {
        return visit(ctx.ID());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    //todo
    @Override
    public List<Node> visitForClause(final GrammarParser.ForClauseContext ctx) {
        return Collections.emptyList();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    //todo
    @Override
    public List<Node> visitLetClause(final GrammarParser.LetClauseContext ctx) {
        final int varSize = ctx.var().size();

        for (int i = 0; i < varSize; i++) {
            variableMap.put(ctx.var().get(i).getText(), visit(ctx.xq(i)));
        }

        return Collections.emptyList();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    //todo
    @Override
    public List<Node> visitWhereClause(final GrammarParser.WhereClauseContext ctx) {
        return visit(ctx.cond());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    //todo
    @Override
    public List<Node> visitReturnClause(final GrammarParser.ReturnClauseContext ctx) {
        return visit(ctx.xq());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitCondOr(final GrammarParser.CondOrContext ctx) {
        final List<Node> initialCurNodeList = new ArrayList<>(curNodeList);
        final List<Node> node0List = visit(ctx.cond(0));
        curNodeList = initialCurNodeList;
        final List<Node> node1List = visit(ctx.cond(1));
        if (node0List.isEmpty() || node1List.isEmpty()) {
            final Node n = doc.createTextNode("true");
            return new ArrayList<>(Collections.singletonList(n));
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
    public List<Node> visitCondAnd(final GrammarParser.CondAndContext ctx) {
        final List<Node> initialCurNodeList = new ArrayList<>(curNodeList);
        final List<Node> node0List = visit(ctx.cond(0));
        curNodeList = initialCurNodeList;
        final List<Node> node1List = visit(ctx.cond(1));
        final List<Node> res = new ArrayList<>();

        if (!node0List.isEmpty() && !node1List.isEmpty()) {
            // both not empty then true
            final Node n = doc.createTextNode("true");
            return new ArrayList<>(Collections.singletonList(n));
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
    public List<Node> visitCondParentheses(final GrammarParser.CondParenthesesContext ctx) {
        return visit(ctx.cond());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    //unsure about version
    @Override
    public List<Node> visitCondEmpty(final GrammarParser.CondEmptyContext ctx) {
        final List<Node> res = visit(ctx.xq());
        if (res.isEmpty()) {
            final Node n = doc.createTextNode("true");
            return new ArrayList<Node>(Collections.singletonList(n));
        }
        return Collections.emptyList();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
//    @Override public List<Node> visitCondSome(GrammarParser.CondSomeContext ctx) {
//        HashMap<String, List<Node>> map = new HashMap<>(variableMap);
//        List<Node> nodes = this.curNodeList;
//        for (int i = 0; i < ctx.var().size(); ++i) {
//            String varName = ctx.var(i).getText();
//            List<Node> xq = visit(ctx.xq(i));
//            this.variableMap.put(varName, xq);
//        }
//        List<Node> cond = visit(ctx.cond());
//        this.variableMap = map;
//        this.curNodeList = nodes;
//        return cond;
//    }

    // unsure
    @Override
    public List<Node> visitCondSome(final GrammarParser.CondSomeContext ctx) {
        final HashMap<String, List<Node>> storedMap = new HashMap<>(variableMap);
        final List<Node> nodes = curNodeList;
        for (int i = 0; i < ctx.var().size(); ++i) {
            final String varName = ctx.var(i).getText();
            variableMap.put(varName, visit(ctx.xq(i)));
        }
        final List<Node> cond = visit(ctx.cond());
        variableMap = storedMap;
        curNodeList = nodes;
        return cond;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Node> visitCondSame(final GrammarParser.CondSameContext ctx) {
        final List<Node> initialCurNodeList = new ArrayList<>(curNodeList);
        final List<Node> node0List = visit(ctx.xq(0));
        curNodeList = initialCurNodeList;
        final List<Node> node1List = visit(ctx.xq(1));


        for (final Node node0 : node0List) {
            for (final Node node1 : node1List) {
                if (node0.isSameNode(node1)) {
                    final Node n = doc.createTextNode("true");
                    return new ArrayList<Node>(Collections.singletonList(n));
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
    public List<Node> visitCondNot(final GrammarParser.CondNotContext ctx) {
        //System.out.println("running revised visitFilterNot");

        final List<Node> nodeList = visit(ctx.cond());
        if (nodeList.isEmpty()) {
            final Node n = doc.createTextNode("true");
            return new ArrayList<Node>(Collections.singletonList(n));
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
    public List<Node> visitCondEqual(final GrammarParser.CondEqualContext ctx) {
        final List<Node> initialCurNodeList = new ArrayList<>(curNodeList);
        final List<Node> node0List = visit(ctx.xq(0));
        curNodeList = initialCurNodeList;
        final List<Node> node1List = visit(ctx.xq(1));


        for (final Node node0 : node0List) {
            for (final Node node1 : node1List) {
                if (node0.isEqualNode(node1)) {
                    final Node n = doc.createTextNode("true");
                    return new ArrayList<Node>(Collections.singletonList(n));
                }
            }
        }
        return Collections.emptyList();
    }


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
        for (final Node node : nodeList) {
            if (!ans.contains(node)) {
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
        //System.out.println("running revised visitFilterNot");

        final List<Node> storedList = new ArrayList<>(curNodeList);
        final List<Node> nodeList = visit(ctx.filter());
        curNodeList = storedList;
        if (nodeList.isEmpty()) {
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

        if (node0List.isEmpty() || node1List.isEmpty()) {
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

        if (!node0List.isEmpty() && !node1List.isEmpty()) {
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
        if (curNodeList.isEmpty()) {
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