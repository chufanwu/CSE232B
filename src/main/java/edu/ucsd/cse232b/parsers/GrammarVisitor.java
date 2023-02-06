// Generated from java-escape by ANTLR 4.11.1

package edu.ucsd.cse232b.parsers;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ApChildren}
	 * labeled alternative in {@link GrammarParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApChildren(GrammarParser.ApChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ApDescendant}
	 * labeled alternative in {@link GrammarParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApDescendant(GrammarParser.ApDescendantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DocFile}
	 * labeled alternative in {@link GrammarParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocFile(GrammarParser.DocFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code File}
	 * labeled alternative in {@link GrammarParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(GrammarParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cur}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCur(GrammarParser.CurContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(GrammarParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent(GrammarParser.ParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Childen}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChilden(GrammarParser.ChildenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtrributeName}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrributeName(GrammarParser.AtrributeNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpChildren}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpChildren(GrammarParser.RpChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpDescendant}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpDescendant(GrammarParser.RpDescendantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpParentheses}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpParentheses(GrammarParser.RpParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(GrammarParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpAppend}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpAppend(GrammarParser.RpAppendContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpFilter}
	 * labeled alternative in {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpFilter(GrammarParser.RpFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterSame}
	 * labeled alternative in {@link GrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterSame(GrammarParser.FilterSameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterEqual}
	 * labeled alternative in {@link GrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterEqual(GrammarParser.FilterEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterNot}
	 * labeled alternative in {@link GrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterNot(GrammarParser.FilterNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterOr}
	 * labeled alternative in {@link GrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterOr(GrammarParser.FilterOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterAnd}
	 * labeled alternative in {@link GrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterAnd(GrammarParser.FilterAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link GrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterRp(GrammarParser.FilterRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterParentheses}
	 * labeled alternative in {@link GrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterParentheses(GrammarParser.FilterParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterString}
	 * labeled alternative in {@link GrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterString(GrammarParser.FilterStringContext ctx);
}