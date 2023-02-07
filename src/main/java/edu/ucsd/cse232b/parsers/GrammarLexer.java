// Generated from java-escape by ANTLR 4.11.1

package edu.ucsd.cse232b.parsers;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, ID=22, WS=23, StringConstant=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "ID", "WS", "StringConstant"
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
			null, null, null, null, null, null, null, null, null, null, "ID", "WS", 
			"StringConstant"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0018\u0085\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0005\u0015r\b\u0015\n\u0015\f\u0015u\t\u0015\u0001\u0016"+
		"\u0004\u0016x\b\u0016\u000b\u0016\f\u0016y\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0004\u0017\u0080\b\u0017\u000b\u0017\f\u0017\u0081"+
		"\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018\u0001\u0000\u0004\u0002"+
		"\u0000AZaz\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \t\u0000 \"\'\',."+
		"09;;??AZ__az\u0087\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00011\u0001\u0000\u0000\u0000\u0003"+
		"3\u0001\u0000\u0000\u0000\u00056\u0001\u0000\u0000\u0000\u0007<\u0001"+
		"\u0000\u0000\u0000\t?\u0001\u0000\u0000\u0000\u000bA\u0001\u0000\u0000"+
		"\u0000\rC\u0001\u0000\u0000\u0000\u000fF\u0001\u0000\u0000\u0000\u0011"+
		"M\u0001\u0000\u0000\u0000\u0013O\u0001\u0000\u0000\u0000\u0015Q\u0001"+
		"\u0000\u0000\u0000\u0017S\u0001\u0000\u0000\u0000\u0019U\u0001\u0000\u0000"+
		"\u0000\u001bW\u0001\u0000\u0000\u0000\u001dY\u0001\u0000\u0000\u0000\u001f"+
		"[\u0001\u0000\u0000\u0000!^\u0001\u0000\u0000\u0000#a\u0001\u0000\u0000"+
		"\u0000%d\u0001\u0000\u0000\u0000\'h\u0001\u0000\u0000\u0000)k\u0001\u0000"+
		"\u0000\u0000+o\u0001\u0000\u0000\u0000-w\u0001\u0000\u0000\u0000/}\u0001"+
		"\u0000\u0000\u000012\u0005/\u0000\u00002\u0002\u0001\u0000\u0000\u0000"+
		"34\u0005/\u0000\u000045\u0005/\u0000\u00005\u0004\u0001\u0000\u0000\u0000"+
		"67\u0005d\u0000\u000078\u0005o\u0000\u000089\u0005c\u0000\u00009:\u0005"+
		"(\u0000\u0000:;\u0005\"\u0000\u0000;\u0006\u0001\u0000\u0000\u0000<=\u0005"+
		"\"\u0000\u0000=>\u0005)\u0000\u0000>\b\u0001\u0000\u0000\u0000?@\u0005"+
		".\u0000\u0000@\n\u0001\u0000\u0000\u0000AB\u0005*\u0000\u0000B\f\u0001"+
		"\u0000\u0000\u0000CD\u0005.\u0000\u0000DE\u0005.\u0000\u0000E\u000e\u0001"+
		"\u0000\u0000\u0000FG\u0005t\u0000\u0000GH\u0005e\u0000\u0000HI\u0005x"+
		"\u0000\u0000IJ\u0005t\u0000\u0000JK\u0005(\u0000\u0000KL\u0005)\u0000"+
		"\u0000L\u0010\u0001\u0000\u0000\u0000MN\u0005@\u0000\u0000N\u0012\u0001"+
		"\u0000\u0000\u0000OP\u0005(\u0000\u0000P\u0014\u0001\u0000\u0000\u0000"+
		"QR\u0005)\u0000\u0000R\u0016\u0001\u0000\u0000\u0000ST\u0005[\u0000\u0000"+
		"T\u0018\u0001\u0000\u0000\u0000UV\u0005]\u0000\u0000V\u001a\u0001\u0000"+
		"\u0000\u0000WX\u0005,\u0000\u0000X\u001c\u0001\u0000\u0000\u0000YZ\u0005"+
		"=\u0000\u0000Z\u001e\u0001\u0000\u0000\u0000[\\\u0005e\u0000\u0000\\]"+
		"\u0005q\u0000\u0000] \u0001\u0000\u0000\u0000^_\u0005=\u0000\u0000_`\u0005"+
		"=\u0000\u0000`\"\u0001\u0000\u0000\u0000ab\u0005i\u0000\u0000bc\u0005"+
		"s\u0000\u0000c$\u0001\u0000\u0000\u0000de\u0005a\u0000\u0000ef\u0005n"+
		"\u0000\u0000fg\u0005d\u0000\u0000g&\u0001\u0000\u0000\u0000hi\u0005o\u0000"+
		"\u0000ij\u0005r\u0000\u0000j(\u0001\u0000\u0000\u0000kl\u0005n\u0000\u0000"+
		"lm\u0005o\u0000\u0000mn\u0005t\u0000\u0000n*\u0001\u0000\u0000\u0000o"+
		"s\u0007\u0000\u0000\u0000pr\u0007\u0001\u0000\u0000qp\u0001\u0000\u0000"+
		"\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000t,\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vx\u0007"+
		"\u0002\u0000\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{|\u0006\u0016\u0000\u0000|.\u0001\u0000\u0000\u0000}\u007f\u0005"+
		"\"\u0000\u0000~\u0080\u0007\u0003\u0000\u0000\u007f~\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005\"\u0000\u0000\u00840\u0001\u0000\u0000\u0000"+
		"\u0004\u0000sy\u0081\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}