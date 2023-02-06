import edu.ucsd.cse232b.parsers.GrammarParser;
import edu.ucsd.cse232b.parsers.GrammarVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.w3c.dom.Node;

import java.util.List;

public class GrammarVisitorImpl implements GrammarVisitor<List<Node>> {

    @Override
    public List<Node> visitApChildren(GrammarParser.ApChildrenContext ctx) {
        return null;
    }

    @Override
    public List<Node> visitApDescendant(GrammarParser.ApDescendantContext ctx) {
        return null;
    }

    @Override
    public List<Node> visitDocFile(GrammarParser.DocFileContext ctx) {
        return null;
    }

    @Override
    public List<Node> visitFile(GrammarParser.FileContext ctx) {
        return null;
    }

    @Override
    public List<Node> visitCur(GrammarParser.CurContext ctx) {
        return null;
    }

    @Override
    public List<Node> visitTagName(GrammarParser.TagNameContext ctx) {
        return null;
    }

    @Override
    public List<Node> visitParent(GrammarParser.ParentContext ctx) {
        return null;
    }

    @Override
    public List<Node> visitChilden(GrammarParser.ChildenContext ctx) {
        return null;
    }

    @Override
    public List<Node> visitAtrributeName(GrammarParser.AtrributeNameContext ctx) {
        return null;
    }

    @Override
    public List<Node> visitRpChildren(GrammarParser.RpChildrenContext ctx) {
        return null;
    }

    @Override
    public List<Node> visitRpDescendant(GrammarParser.RpDescendantContext ctx) {
        return null;
    }

    @Override
    public List<Node> visitRpParentheses(GrammarParser.RpParenthesesContext ctx) {
        return null;
    }

    @Override
    public List<Node> visitText(GrammarParser.TextContext ctx) {
        return null;
    }

    @Override
    public List<Node> visitRpAppend(GrammarParser.RpAppendContext ctx) {
        return null;
    }

    @Override
    public List<Node> visitRpFilter(GrammarParser.RpFilterContext ctx) {
        return null;
    }

    @Override
    public List<Node> visitFilterSame(GrammarParser.FilterSameContext ctx) {
        return null;
    }

    @Override
    public List<Node> visitFilterEqual(GrammarParser.FilterEqualContext ctx) {
        return null;
    }

    @Override
    public List<Node> visitFilterNot(GrammarParser.FilterNotContext ctx) {
        return null;
    }

    @Override
    public List<Node> visitFilterOr(GrammarParser.FilterOrContext ctx) {
        return null;
    }

    @Override
    public List<Node> visitFilterAnd(GrammarParser.FilterAndContext ctx) {
        return null;
    }

    @Override
    public List<Node> visitFilterRp(GrammarParser.FilterRpContext ctx) {
        return null;
    }

    @Override
    public List<Node> visitFilterParentheses(GrammarParser.FilterParenthesesContext ctx) {
        return null;
    }

    @Override
    public List<Node> visitFilterString(GrammarParser.FilterStringContext ctx) {
        return null;
    }

    @Override
    public List<Node> visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public List<Node> visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public List<Node> visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public List<Node> visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
