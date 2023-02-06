// Generated from java-escape by ANTLR 4.11.1

package edu.ucsd.cse232b.parsers;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
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