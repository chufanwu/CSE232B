// Generated from java-escape by ANTLR 4.11.1

package edu.ucsd.cse232b.parsers;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code XqChildren}
	 * labeled alternative in {@link GrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqChildren(GrammarParser.XqChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqChildren}
	 * labeled alternative in {@link GrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqChildren(GrammarParser.XqChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqAp}
	 * labeled alternative in {@link GrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqAp(GrammarParser.XqApContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqAp}
	 * labeled alternative in {@link GrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqAp(GrammarParser.XqApContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqAppend}
	 * labeled alternative in {@link GrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqAppend(GrammarParser.XqAppendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqAppend}
	 * labeled alternative in {@link GrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqAppend(GrammarParser.XqAppendContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqVariable}
	 * labeled alternative in {@link GrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqVariable(GrammarParser.XqVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqVariable}
	 * labeled alternative in {@link GrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqVariable(GrammarParser.XqVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqParentheses}
	 * labeled alternative in {@link GrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqParentheses(GrammarParser.XqParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqParentheses}
	 * labeled alternative in {@link GrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqParentheses(GrammarParser.XqParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqDescendant}
	 * labeled alternative in {@link GrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqDescendant(GrammarParser.XqDescendantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqDescendant}
	 * labeled alternative in {@link GrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqDescendant(GrammarParser.XqDescendantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqString}
	 * labeled alternative in {@link GrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqString(GrammarParser.XqStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqString}
	 * labeled alternative in {@link GrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqString(GrammarParser.XqStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqQuery}
	 * labeled alternative in {@link GrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqQuery(GrammarParser.XqQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqQuery}
	 * labeled alternative in {@link GrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqQuery(GrammarParser.XqQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xqtag}
	 * labeled alternative in {@link GrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqtag(GrammarParser.XqtagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xqtag}
	 * labeled alternative in {@link GrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqtag(GrammarParser.XqtagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqLet}
	 * labeled alternative in {@link GrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqLet(GrammarParser.XqLetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqLet}
	 * labeled alternative in {@link GrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqLet(GrammarParser.XqLetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(GrammarParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(GrammarParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqBeginTag}
	 * labeled alternative in {@link GrammarParser#beginTag}.
	 * @param ctx the parse tree
	 */
	void enterXqBeginTag(GrammarParser.XqBeginTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqBeginTag}
	 * labeled alternative in {@link GrammarParser#beginTag}.
	 * @param ctx the parse tree
	 */
	void exitXqBeginTag(GrammarParser.XqBeginTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqEndTag}
	 * labeled alternative in {@link GrammarParser#endTag}.
	 * @param ctx the parse tree
	 */
	void enterXqEndTag(GrammarParser.XqEndTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqEndTag}
	 * labeled alternative in {@link GrammarParser#endTag}.
	 * @param ctx the parse tree
	 */
	void exitXqEndTag(GrammarParser.XqEndTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(GrammarParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(GrammarParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(GrammarParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(GrammarParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(GrammarParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(GrammarParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(GrammarParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(GrammarParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondOr}
	 * labeled alternative in {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondOr(GrammarParser.CondOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondOr}
	 * labeled alternative in {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondOr(GrammarParser.CondOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondAnd}
	 * labeled alternative in {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondAnd(GrammarParser.CondAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondAnd}
	 * labeled alternative in {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondAnd(GrammarParser.CondAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondParentheses}
	 * labeled alternative in {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondParentheses(GrammarParser.CondParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondParentheses}
	 * labeled alternative in {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondParentheses(GrammarParser.CondParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondEmpty}
	 * labeled alternative in {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondEmpty(GrammarParser.CondEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondEmpty}
	 * labeled alternative in {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondEmpty(GrammarParser.CondEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondSome}
	 * labeled alternative in {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondSome(GrammarParser.CondSomeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondSome}
	 * labeled alternative in {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondSome(GrammarParser.CondSomeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondSame}
	 * labeled alternative in {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondSame(GrammarParser.CondSameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondSame}
	 * labeled alternative in {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondSame(GrammarParser.CondSameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondNot}
	 * labeled alternative in {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondNot(GrammarParser.CondNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondNot}
	 * labeled alternative in {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondNot(GrammarParser.CondNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondEqual}
	 * labeled alternative in {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondEqual(GrammarParser.CondEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondEqual}
	 * labeled alternative in {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondEqual(GrammarParser.CondEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ApChildren}
	 * labeled alternative in {@link GrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApChildren(GrammarParser.ApChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ApChildren}
	 * labeled alternative in {@link GrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApChildren(GrammarParser.ApChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ApDescendant}
	 * labeled alternative in {@link GrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApDescendant(GrammarParser.ApDescendantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ApDescendant}
	 * labeled alternative in {@link GrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApDescendant(GrammarParser.ApDescendantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DocFile}
	 * labeled alternative in {@link GrammarParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDocFile(GrammarParser.DocFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DocFile}
	 * labeled alternative in {@link GrammarParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDocFile(GrammarParser.DocFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code File}
	 * labeled alternative in {@link GrammarParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFile(GrammarParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code File}
	 * labeled alternative in {@link GrammarParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFile(GrammarParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cur}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterCur(GrammarParser.CurContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cur}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitCur(GrammarParser.CurContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTagName(GrammarParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTagName(GrammarParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParent(GrammarParser.ParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParent(GrammarParser.ParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Childen}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterChilden(GrammarParser.ChildenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Childen}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitChilden(GrammarParser.ChildenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtrributeName}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAtrributeName(GrammarParser.AtrributeNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtrributeName}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAtrributeName(GrammarParser.AtrributeNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpChildren}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpChildren(GrammarParser.RpChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpChildren}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpChildren(GrammarParser.RpChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpDescendant}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpDescendant(GrammarParser.RpDescendantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpDescendant}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpDescendant(GrammarParser.RpDescendantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpParentheses}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpParentheses(GrammarParser.RpParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpParentheses}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpParentheses(GrammarParser.RpParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Text}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterText(GrammarParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitText(GrammarParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpAppend}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpAppend(GrammarParser.RpAppendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpAppend}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpAppend(GrammarParser.RpAppendContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpFilter}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpFilter(GrammarParser.RpFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpFilter}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpFilter(GrammarParser.RpFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterSame}
	 * labeled alternative in {@link GrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterSame(GrammarParser.FilterSameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterSame}
	 * labeled alternative in {@link GrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterSame(GrammarParser.FilterSameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterEqual}
	 * labeled alternative in {@link GrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterEqual(GrammarParser.FilterEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterEqual}
	 * labeled alternative in {@link GrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterEqual(GrammarParser.FilterEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterNot}
	 * labeled alternative in {@link GrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterNot(GrammarParser.FilterNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterNot}
	 * labeled alternative in {@link GrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterNot(GrammarParser.FilterNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterOr}
	 * labeled alternative in {@link GrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterOr(GrammarParser.FilterOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterOr}
	 * labeled alternative in {@link GrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterOr(GrammarParser.FilterOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterAnd}
	 * labeled alternative in {@link GrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterAnd(GrammarParser.FilterAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterAnd}
	 * labeled alternative in {@link GrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterAnd(GrammarParser.FilterAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link GrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterRp(GrammarParser.FilterRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link GrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterRp(GrammarParser.FilterRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterParentheses}
	 * labeled alternative in {@link GrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterParentheses(GrammarParser.FilterParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterParentheses}
	 * labeled alternative in {@link GrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterParentheses(GrammarParser.FilterParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterString}
	 * labeled alternative in {@link GrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterString(GrammarParser.FilterStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterString}
	 * labeled alternative in {@link GrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterString(GrammarParser.FilterStringContext ctx);
}