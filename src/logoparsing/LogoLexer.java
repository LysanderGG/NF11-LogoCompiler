// $ANTLR ANTLRVersion> LogoLexer.java generatedTimestamp>

  package logoparsing;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__25=1, T__24=2, T__23=3, T__22=4, T__21=5, T__20=6, T__19=7, T__18=8, 
		T__17=9, T__16=10, T__15=11, T__14=12, T__13=13, T__12=14, T__11=15, T__10=16, 
		T__9=17, T__8=18, T__7=19, T__6=20, T__5=21, T__4=22, T__3=23, T__2=24, 
		T__1=25, T__0=26, BOOL=27, INT=28, WS=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'-'", "'fpos'", "'*'", "'['", "'('", "'tg'", "'<'", "'si'", "'<='", 
		"'ve'", "'fcc'", "'re'", "')'", "'+'", "'bc'", "'='", "'lc'", "'av'", 
		"'&&'", "'||'", "'>'", "'/'", "'>='", "'hasard'", "'td'", "BOOL", "INT", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", 
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "BOOL", "INT", "WS"
	};


	public LogoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Logo.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 28: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\1\2\35\u00a1\6\uffff\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5"+
		"\2\6\7\6\2\7\7\7\2\b\7\b\2\t\7\t\2\n\7\n\2\13\7\13\2\f\7\f\2\r\7\r\2\16"+
		"\7\16\2\17\7\17\2\20\7\20\2\21\7\21\2\22\7\22\2\23\7\23\2\24\7\24\2\25"+
		"\7\25\2\26\7\26\2\27\7\27\2\30\7\30\2\31\7\31\2\32\7\32\2\33\7\33\2\34"+
		"\7\34\1\0\1\0\1\1\1\1\1\2\1\2\1\2\1\2\1\2\1\3\1\3\1\4\1\4\1\5\1\5\1\6"+
		"\1\6\1\6\1\7\1\7\1\b\1\b\1\b\1\t\1\t\1\t\1\n\1\n\1\n\1\13\1\13\1\13\1"+
		"\13\1\f\1\f\1\f\1\r\1\r\1\16\1\16\1\17\1\17\1\17\1\20\1\20\1\21\1\21\1"+
		"\21\1\22\1\22\1\22\1\23\1\23\1\23\1\24\1\24\1\24\1\25\1\25\1\26\1\26\1"+
		"\27\1\27\1\27\1\30\1\30\1\30\1\30\1\30\1\30\1\30\1\31\1\31\1\31\1\32\1"+
		"\32\1\32\1\32\1\32\1\32\1\32\1\32\1\32\3\32\u008f\b\32\1\33\1\33\1\33"+
		"\5\33\u0094\b\33\n\33\f\33\u0097\t\33\3\33\u0099\b\33\1\34\4\34\u009c"+
		"\b\34\13\34\f\34\u009d\1\34\1\34\0\35\1\1\uffff\3\2\uffff\5\3\uffff\7"+
		"\4\uffff\t\5\uffff\13\6\uffff\r\7\uffff\17\b\uffff\21\t\uffff\23\n\uffff"+
		"\25\13\uffff\27\f\uffff\31\r\uffff\33\16\uffff\35\17\uffff\37\20\uffff"+
		"!\21\uffff#\22\uffff%\23\uffff\'\24\uffff)\25\uffff+\26\uffff-\27\uffff"+
		"/\30\uffff\61\31\uffff\63\32\uffff\65\33\uffff\67\34\uffff9\35\0\1\0\3"+
		"\1\619\1\609\3\t\n\r\r  \u00a4\0\1\1\0\0\0\0\3\1\0\0\0\0\5\1\0\0\0\0\7"+
		"\1\0\0\0\0\t\1\0\0\0\0\13\1\0\0\0\0\r\1\0\0\0\0\17\1\0\0\0\0\21\1\0\0"+
		"\0\0\23\1\0\0\0\0\25\1\0\0\0\0\27\1\0\0\0\0\31\1\0\0\0\0\33\1\0\0\0\0"+
		"\35\1\0\0\0\0\37\1\0\0\0\0!\1\0\0\0\0#\1\0\0\0\0%\1\0\0\0\0\'\1\0\0\0"+
		"\0)\1\0\0\0\0+\1\0\0\0\0-\1\0\0\0\0/\1\0\0\0\0\61\1\0\0\0\0\63\1\0\0\0"+
		"\0\65\1\0\0\0\0\67\1\0\0\0\09\1\0\0\0\1;\1\0\0\0\3=\1\0\0\0\5?\1\0\0\0"+
		"\7D\1\0\0\0\tF\1\0\0\0\13H\1\0\0\0\rJ\1\0\0\0\17M\1\0\0\0\21O\1\0\0\0"+
		"\23R\1\0\0\0\25U\1\0\0\0\27X\1\0\0\0\31\\\1\0\0\0\33_\1\0\0\0\35a\1\0"+
		"\0\0\37c\1\0\0\0!f\1\0\0\0#h\1\0\0\0%k\1\0\0\0\'n\1\0\0\0)q\1\0\0\0+t"+
		"\1\0\0\0-v\1\0\0\0/x\1\0\0\0\61{\1\0\0\0\63\u0082\1\0\0\0\65\u008e\1\0"+
		"\0\0\67\u0098\1\0\0\09\u009b\1\0\0\0;<\5]\0\0<\2\1\0\0\0=>\5-\0\0>\4\1"+
		"\0\0\0?@\5f\0\0@A\5p\0\0AB\5o\0\0BC\5s\0\0C\6\1\0\0\0DE\5*\0\0E\b\1\0"+
		"\0\0FG\5[\0\0G\n\1\0\0\0HI\5(\0\0I\f\1\0\0\0JK\5t\0\0KL\5g\0\0L\16\1\0"+
		"\0\0MN\5<\0\0N\20\1\0\0\0OP\5s\0\0PQ\5i\0\0Q\22\1\0\0\0RS\5<\0\0ST\5="+
		"\0\0T\24\1\0\0\0UV\5v\0\0VW\5e\0\0W\26\1\0\0\0XY\5f\0\0YZ\5c\0\0Z[\5c"+
		"\0\0[\30\1\0\0\0\\]\5r\0\0]^\5e\0\0^\32\1\0\0\0_`\5)\0\0`\34\1\0\0\0a"+
		"b\5+\0\0b\36\1\0\0\0cd\5b\0\0de\5c\0\0e \1\0\0\0fg\5=\0\0g\"\1\0\0\0h"+
		"i\5l\0\0ij\5c\0\0j$\1\0\0\0kl\5a\0\0lm\5v\0\0m&\1\0\0\0no\5&\0\0op\5&"+
		"\0\0p(\1\0\0\0qr\5|\0\0rs\5|\0\0s*\1\0\0\0tu\5>\0\0u,\1\0\0\0vw\5/\0\0"+
		"w.\1\0\0\0xy\5>\0\0yz\5=\0\0z\60\1\0\0\0{|\5h\0\0|}\5a\0\0}~\5s\0\0~\177"+
		"\5a\0\0\177\u0080\5r\0\0\u0080\u0081\5d\0\0\u0081\62\1\0\0\0\u0082\u0083"+
		"\5t\0\0\u0083\u0084\5d\0\0\u0084\64\1\0\0\0\u0085\u0086\5t\0\0\u0086\u0087"+
		"\5r\0\0\u0087\u0088\5u\0\0\u0088\u008f\5e\0\0\u0089\u008a\5f\0\0\u008a"+
		"\u008b\5a\0\0\u008b\u008c\5l\0\0\u008c\u008d\5s\0\0\u008d\u008f\5e\0\0"+
		"\u008e\u0085\1\0\0\0\u008e\u0089\1\0\0\0\u008f\66\1\0\0\0\u0090\u0099"+
		"\5\60\0\0\u0091\u0095\7\0\0\0\u0092\u0094\7\1\0\0\u0093\u0092\1\0\0\0"+
		"\u0094\u0097\1\0\0\0\u0095\u0093\1\0\0\0\u0095\u0096\1\0\0\0\u0096\u0099"+
		"\1\0\0\0\u0097\u0095\1\0\0\0\u0098\u0090\1\0\0\0\u0098\u0091\1\0\0\0\u0099"+
		"8\1\0\0\0\u009a\u009c\7\2\0\0\u009b\u009a\1\0\0\0\u009c\u009d\1\0\0\0"+
		"\u009d\u009b\1\0\0\0\u009d\u009e\1\0\0\0\u009e\u009f\1\0\0\0\u009f\u00a0"+
		"\6\34\0\0\u00a0:\1\0\0\0\5\0\u008e\u0095\u0098\u009d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}