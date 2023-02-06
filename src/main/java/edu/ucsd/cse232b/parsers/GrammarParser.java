// Generated from java-escape by ANTLR 4.11.1

package edu.ucsd.cse232b.parsers;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, ID=22, WS=23;
	public static final int
		RULE_ap = 0, RULE_doc = 1, RULE_fileName = 2, RULE_rp = 3, RULE_filter = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"ap", "doc", "fileName", "rp", "filter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", "'//'", "'doc(\"'", "'\")'", "'.'", "'*'", "'..'", "'text()'", 
			"'@'", "'('", "')'", "'['", "']'", "','", "'='", "'eq'", "'=='", "'is'", 
			"'and'", "'or'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ApContext extends ParserRuleContext {
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
	 
		public ApContext() { }
		public void copyFrom(ApContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ApChildrenContext extends ApContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ApChildrenContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterApChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitApChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitApChildren(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ApDescendantContext extends ApContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ApDescendantContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterApDescendant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitApDescendant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitApDescendant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ap);
		try {
			setState(18);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new ApChildrenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				doc();
				setState(11);
				match(T__0);
				setState(12);
				rp(0);
				}
				break;
			case 2:
				_localctx = new ApDescendantContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(14);
				doc();
				setState(15);
				match(T__1);
				setState(16);
				rp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DocContext extends ParserRuleContext {
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
	 
		public DocContext() { }
		public void copyFrom(DocContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DocFileContext extends DocContext {
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public DocFileContext(DocContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDocFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDocFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDocFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_doc);
		try {
			_localctx = new DocFileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__2);
			setState(21);
			fileName();
			setState(22);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileNameContext extends ParserRuleContext {
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
	 
		public FileNameContext() { }
		public void copyFrom(FileNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends FileNameContext {
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public FileContext(FileNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fileName);
		int _la;
		try {
			_localctx = new FileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(ID);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(25);
				match(T__4);
				setState(26);
				match(ID);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CurContext extends RpContext {
		public CurContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCur(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCur(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagNameContext extends RpContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TagNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentContext extends RpContext {
		public ParentContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChildenContext extends RpContext {
		public ChildenContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterChilden(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitChilden(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitChilden(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtrributeNameContext extends RpContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public AtrributeNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAtrributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAtrributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAtrributeName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RpChildrenContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RpChildrenContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRpChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRpChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRpChildren(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RpDescendantContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RpDescendantContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRpDescendant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRpDescendant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRpDescendant(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RpParenthesesContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public RpParenthesesContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRpParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRpParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRpParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends RpContext {
		public TextContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RpAppendContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RpAppendContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRpAppend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRpAppend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRpAppend(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RpFilterContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public RpFilterContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRpFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRpFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRpFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new TagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(33);
				match(ID);
				}
				break;
			case T__5:
				{
				_localctx = new ChildenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				match(T__5);
				}
				break;
			case T__4:
				{
				_localctx = new CurContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				match(T__4);
				}
				break;
			case T__6:
				{
				_localctx = new ParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(T__6);
				}
				break;
			case T__7:
				{
				_localctx = new TextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				match(T__7);
				}
				break;
			case T__8:
				{
				_localctx = new AtrributeNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				match(T__8);
				setState(39);
				match(ID);
				}
				break;
			case T__9:
				{
				_localctx = new RpParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(T__9);
				setState(41);
				rp(0);
				setState(42);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(60);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new RpChildrenContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(46);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(47);
						match(T__0);
						setState(48);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new RpDescendantContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(49);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(50);
						match(T__1);
						setState(51);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new RpAppendContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(52);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(53);
						match(T__13);
						setState(54);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new RpFilterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(55);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(56);
						match(T__11);
						setState(57);
						filter(0);
						setState(58);
						match(T__12);
						}
						break;
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FilterContext extends ParserRuleContext {
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
	 
		public FilterContext() { }
		public void copyFrom(FilterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterSameContext extends FilterContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FilterSameContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFilterSame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFilterSame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFilterSame(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterEqualContext extends FilterContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FilterEqualContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFilterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFilterEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFilterEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterNotContext extends FilterContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public FilterNotContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFilterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFilterNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFilterNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterOrContext extends FilterContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public FilterOrContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFilterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFilterOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFilterOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterAndContext extends FilterContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public FilterAndContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFilterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFilterAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFilterAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterRpContext extends FilterContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FilterRpContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFilterRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFilterRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFilterRp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterParenthesesContext extends FilterContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public FilterParenthesesContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFilterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFilterParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFilterParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterStringContext extends FilterContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public FilterStringContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFilterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFilterString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFilterString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		return filter(0);
	}

	private FilterContext filter(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FilterContext _localctx = new FilterContext(_ctx, _parentState);
		FilterContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_filter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new FilterRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(66);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new FilterEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				rp(0);
				setState(68);
				match(T__14);
				setState(69);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new FilterEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				rp(0);
				setState(72);
				match(T__15);
				setState(73);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new FilterSameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				rp(0);
				setState(76);
				match(T__16);
				setState(77);
				rp(0);
				}
				break;
			case 5:
				{
				_localctx = new FilterSameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				rp(0);
				setState(80);
				match(T__17);
				setState(81);
				rp(0);
				}
				break;
			case 6:
				{
				_localctx = new FilterStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				rp(0);
				setState(84);
				match(T__14);
				setState(85);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new FilterParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(T__9);
				setState(88);
				filter(0);
				setState(89);
				match(T__10);
				}
				break;
			case 8:
				{
				_localctx = new FilterNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(T__20);
				setState(92);
				filter(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(101);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new FilterAndContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(95);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(96);
						match(T__18);
						setState(97);
						filter(4);
						}
						break;
					case 2:
						{
						_localctx = new FilterOrContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(98);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(99);
						match(T__19);
						setState(100);
						filter(3);
						}
						break;
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 4:
			return filter_sempred((FilterContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 1);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean filter_sempred(FilterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0017k\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u0013\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u001c"+
		"\b\u0002\n\u0002\f\u0002\u001f\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003-\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003=\b\u0003\n\u0003\f\u0003@\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004^\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"f\b\u0004\n\u0004\f\u0004i\t\u0004\u0001\u0004\u0000\u0002\u0006\b\u0005"+
		"\u0000\u0002\u0004\u0006\b\u0000\u0000z\u0000\u0012\u0001\u0000\u0000"+
		"\u0000\u0002\u0014\u0001\u0000\u0000\u0000\u0004\u0018\u0001\u0000\u0000"+
		"\u0000\u0006,\u0001\u0000\u0000\u0000\b]\u0001\u0000\u0000\u0000\n\u000b"+
		"\u0003\u0002\u0001\u0000\u000b\f\u0005\u0001\u0000\u0000\f\r\u0003\u0006"+
		"\u0003\u0000\r\u0013\u0001\u0000\u0000\u0000\u000e\u000f\u0003\u0002\u0001"+
		"\u0000\u000f\u0010\u0005\u0002\u0000\u0000\u0010\u0011\u0003\u0006\u0003"+
		"\u0000\u0011\u0013\u0001\u0000\u0000\u0000\u0012\n\u0001\u0000\u0000\u0000"+
		"\u0012\u000e\u0001\u0000\u0000\u0000\u0013\u0001\u0001\u0000\u0000\u0000"+
		"\u0014\u0015\u0005\u0003\u0000\u0000\u0015\u0016\u0003\u0004\u0002\u0000"+
		"\u0016\u0017\u0005\u0004\u0000\u0000\u0017\u0003\u0001\u0000\u0000\u0000"+
		"\u0018\u001d\u0005\u0016\u0000\u0000\u0019\u001a\u0005\u0005\u0000\u0000"+
		"\u001a\u001c\u0005\u0016\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000"+
		"\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u0005\u0001\u0000\u0000\u0000"+
		"\u001f\u001d\u0001\u0000\u0000\u0000 !\u0006\u0003\uffff\uffff\u0000!"+
		"-\u0005\u0016\u0000\u0000\"-\u0005\u0006\u0000\u0000#-\u0005\u0005\u0000"+
		"\u0000$-\u0005\u0007\u0000\u0000%-\u0005\b\u0000\u0000&\'\u0005\t\u0000"+
		"\u0000\'-\u0005\u0016\u0000\u0000()\u0005\n\u0000\u0000)*\u0003\u0006"+
		"\u0003\u0000*+\u0005\u000b\u0000\u0000+-\u0001\u0000\u0000\u0000, \u0001"+
		"\u0000\u0000\u0000,\"\u0001\u0000\u0000\u0000,#\u0001\u0000\u0000\u0000"+
		",$\u0001\u0000\u0000\u0000,%\u0001\u0000\u0000\u0000,&\u0001\u0000\u0000"+
		"\u0000,(\u0001\u0000\u0000\u0000->\u0001\u0000\u0000\u0000./\n\u0004\u0000"+
		"\u0000/0\u0005\u0001\u0000\u00000=\u0003\u0006\u0003\u000512\n\u0003\u0000"+
		"\u000023\u0005\u0002\u0000\u00003=\u0003\u0006\u0003\u000445\n\u0001\u0000"+
		"\u000056\u0005\u000e\u0000\u00006=\u0003\u0006\u0003\u000278\n\u0002\u0000"+
		"\u000089\u0005\f\u0000\u00009:\u0003\b\u0004\u0000:;\u0005\r\u0000\u0000"+
		";=\u0001\u0000\u0000\u0000<.\u0001\u0000\u0000\u0000<1\u0001\u0000\u0000"+
		"\u0000<4\u0001\u0000\u0000\u0000<7\u0001\u0000\u0000\u0000=@\u0001\u0000"+
		"\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?\u0007"+
		"\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000AB\u0006\u0004\uffff"+
		"\uffff\u0000B^\u0003\u0006\u0003\u0000CD\u0003\u0006\u0003\u0000DE\u0005"+
		"\u000f\u0000\u0000EF\u0003\u0006\u0003\u0000F^\u0001\u0000\u0000\u0000"+
		"GH\u0003\u0006\u0003\u0000HI\u0005\u0010\u0000\u0000IJ\u0003\u0006\u0003"+
		"\u0000J^\u0001\u0000\u0000\u0000KL\u0003\u0006\u0003\u0000LM\u0005\u0011"+
		"\u0000\u0000MN\u0003\u0006\u0003\u0000N^\u0001\u0000\u0000\u0000OP\u0003"+
		"\u0006\u0003\u0000PQ\u0005\u0012\u0000\u0000QR\u0003\u0006\u0003\u0000"+
		"R^\u0001\u0000\u0000\u0000ST\u0003\u0006\u0003\u0000TU\u0005\u000f\u0000"+
		"\u0000UV\u0005\u0016\u0000\u0000V^\u0001\u0000\u0000\u0000WX\u0005\n\u0000"+
		"\u0000XY\u0003\b\u0004\u0000YZ\u0005\u000b\u0000\u0000Z^\u0001\u0000\u0000"+
		"\u0000[\\\u0005\u0015\u0000\u0000\\^\u0003\b\u0004\u0001]A\u0001\u0000"+
		"\u0000\u0000]C\u0001\u0000\u0000\u0000]G\u0001\u0000\u0000\u0000]K\u0001"+
		"\u0000\u0000\u0000]O\u0001\u0000\u0000\u0000]S\u0001\u0000\u0000\u0000"+
		"]W\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^g\u0001\u0000\u0000"+
		"\u0000_`\n\u0003\u0000\u0000`a\u0005\u0013\u0000\u0000af\u0003\b\u0004"+
		"\u0004bc\n\u0002\u0000\u0000cd\u0005\u0014\u0000\u0000df\u0003\b\u0004"+
		"\u0003e_\u0001\u0000\u0000\u0000eb\u0001\u0000\u0000\u0000fi\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h\t\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000\b\u0012\u001d,<>]eg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}