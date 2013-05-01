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
		T__26=1, T__25=2, T__24=3, T__23=4, T__22=5, T__21=6, T__20=7, T__19=8, 
		T__18=9, T__17=10, T__16=11, T__15=12, T__14=13, T__13=14, T__12=15, T__11=16, 
		T__10=17, T__9=18, T__8=19, T__7=20, T__6=21, T__5=22, T__4=23, T__3=24, 
		T__2=25, T__1=26, T__0=27, BOOL=28, INT=29, WS=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'-'", "'fpos'", "'*'", "'['", "'('", "'tg'", "'<'", "'si'", "'<='", 
		"'ve'", "'fcc'", "''", "'re'", "')'", "'+'", "'bc'", "'='", "'lc'", "'av'", 
		"'&&'", "'||'", "'>'", "'/'", "'>='", "'hasard'", "'td'", "BOOL", "INT", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", 
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "BOOL", "INT", "WS"
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
		case 29: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\1\2\36\u00a4\6\uffff\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5"+
		"\2\6\7\6\2\7\7\7\2\b\7\b\2\t\7\t\2\n\7\n\2\13\7\13\2\f\7\f\2\r\7\r\2\16"+
		"\7\16\2\17\7\17\2\20\7\20\2\21\7\21\2\22\7\22\2\23\7\23\2\24\7\24\2\25"+
		"\7\25\2\26\7\26\2\27\7\27\2\30\7\30\2\31\7\31\2\32\7\32\2\33\7\33\2\34"+
		"\7\34\2\35\7\35\1\0\1\0\1\1\1\1\1\2\1\2\1\2\1\2\1\2\1\3\1\3\1\4\1\4\1"+
		"\5\1\5\1\6\1\6\1\6\1\7\1\7\1\b\1\b\1\b\1\t\1\t\1\t\1\n\1\n\1\n\1\13\1"+
		"\13\1\13\1\13\1\f\1\r\1\r\1\r\1\16\1\16\1\17\1\17\1\20\1\20\1\20\1\21"+
		"\1\21\1\22\1\22\1\22\1\23\1\23\1\23\1\24\1\24\1\24\1\25\1\25\1\25\1\26"+
		"\1\26\1\27\1\27\1\30\1\30\1\30\1\31\1\31\1\31\1\31\1\31\1\31\1\31\1\32"+
		"\1\32\1\32\1\33\1\33\1\33\1\33\1\33\1\33\1\33\1\33\1\33\3\33\u0092\b\33"+
		"\1\34\1\34\1\34\5\34\u0097\b\34\n\34\f\34\u009a\t\34\3\34\u009c\b\34\1"+
		"\35\4\35\u009f\b\35\13\35\f\35\u00a0\1\35\1\35\0\36\1\1\uffff\3\2\uffff"+
		"\5\3\uffff\7\4\uffff\t\5\uffff\13\6\uffff\r\7\uffff\17\b\uffff\21\t\uffff"+
		"\23\n\uffff\25\13\uffff\27\f\uffff\31\r\uffff\33\16\uffff\35\17\uffff"+
		"\37\20\uffff!\21\uffff#\22\uffff%\23\uffff\'\24\uffff)\25\uffff+\26\uffff"+
		"-\27\uffff/\30\uffff\61\31\uffff\63\32\uffff\65\33\uffff\67\34\uffff9"+
		"\35\uffff;\36\0\1\0\3\1\619\1\609\3\t\n\r\r  \u00a6\0\1\1\0\0\0\0\3\1"+
		"\0\0\0\0\5\1\0\0\0\0\7\1\0\0\0\0\t\1\0\0\0\0\13\1\0\0\0\0\r\1\0\0\0\0"+
		"\17\1\0\0\0\0\21\1\0\0\0\0\23\1\0\0\0\0\25\1\0\0\0\0\27\1\0\0\0\0\31\1"+
		"\0\0\0\0\33\1\0\0\0\0\35\1\0\0\0\0\37\1\0\0\0\0!\1\0\0\0\0#\1\0\0\0\0"+
		"%\1\0\0\0\0\'\1\0\0\0\0)\1\0\0\0\0+\1\0\0\0\0-\1\0\0\0\0/\1\0\0\0\0\61"+
		"\1\0\0\0\0\63\1\0\0\0\0\65\1\0\0\0\0\67\1\0\0\0\09\1\0\0\0\0;\1\0\0\0"+
		"\1=\1\0\0\0\3?\1\0\0\0\5A\1\0\0\0\7F\1\0\0\0\tH\1\0\0\0\13J\1\0\0\0\r"+
		"L\1\0\0\0\17O\1\0\0\0\21Q\1\0\0\0\23T\1\0\0\0\25W\1\0\0\0\27Z\1\0\0\0"+
		"\31^\1\0\0\0\33_\1\0\0\0\35b\1\0\0\0\37d\1\0\0\0!f\1\0\0\0#i\1\0\0\0%"+
		"k\1\0\0\0\'n\1\0\0\0)q\1\0\0\0+t\1\0\0\0-w\1\0\0\0/y\1\0\0\0\61{\1\0\0"+
		"\0\63~\1\0\0\0\65\u0085\1\0\0\0\67\u0091\1\0\0\09\u009b\1\0\0\0;\u009e"+
		"\1\0\0\0=>\5]\0\0>\2\1\0\0\0?@\5-\0\0@\4\1\0\0\0AB\5f\0\0BC\5p\0\0CD\5"+
		"o\0\0DE\5s\0\0E\6\1\0\0\0FG\5*\0\0G\b\1\0\0\0HI\5[\0\0I\n\1\0\0\0JK\5"+
		"(\0\0K\f\1\0\0\0LM\5t\0\0MN\5g\0\0N\16\1\0\0\0OP\5<\0\0P\20\1\0\0\0QR"+
		"\5s\0\0RS\5i\0\0S\22\1\0\0\0TU\5<\0\0UV\5=\0\0V\24\1\0\0\0WX\5v\0\0XY"+
		"\5e\0\0Y\26\1\0\0\0Z[\5f\0\0[\\\5c\0\0\\]\5c\0\0]\30\1\0\0\0_`\5r\0\0"+
		"`a\5e\0\0a\34\1\0\0\0bc\5)\0\0c\36\1\0\0\0de\5+\0\0e \1\0\0\0fg\5b\0\0"+
		"gh\5c\0\0h\"\1\0\0\0ij\5=\0\0j$\1\0\0\0kl\5l\0\0lm\5c\0\0m&\1\0\0\0no"+
		"\5a\0\0op\5v\0\0p(\1\0\0\0qr\5&\0\0rs\5&\0\0s*\1\0\0\0tu\5|\0\0uv\5|\0"+
		"\0v,\1\0\0\0wx\5>\0\0x.\1\0\0\0yz\5/\0\0z\60\1\0\0\0{|\5>\0\0|}\5=\0\0"+
		"}\62\1\0\0\0~\177\5h\0\0\177\u0080\5a\0\0\u0080\u0081\5s\0\0\u0081\u0082"+
		"\5a\0\0\u0082\u0083\5r\0\0\u0083\u0084\5d\0\0\u0084\64\1\0\0\0\u0085\u0086"+
		"\5t\0\0\u0086\u0087\5d\0\0\u0087\66\1\0\0\0\u0088\u0089\5t\0\0\u0089\u008a"+
		"\5r\0\0\u008a\u008b\5u\0\0\u008b\u0092\5e\0\0\u008c\u008d\5f\0\0\u008d"+
		"\u008e\5a\0\0\u008e\u008f\5l\0\0\u008f\u0090\5s\0\0\u0090\u0092\5e\0\0"+
		"\u0091\u0088\1\0\0\0\u0091\u008c\1\0\0\0\u00928\1\0\0\0\u0093\u009c\5"+
		"\60\0\0\u0094\u0098\7\0\0\0\u0095\u0097\7\1\0\0\u0096\u0095\1\0\0\0\u0097"+
		"\u009a\1\0\0\0\u0098\u0096\1\0\0\0\u0098\u0099\1\0\0\0\u0099\u009c\1\0"+
		"\0\0\u009a\u0098\1\0\0\0\u009b\u0093\1\0\0\0\u009b\u0094\1\0\0\0\u009c"+
		":\1\0\0\0\u009d\u009f\7\2\0\0\u009e\u009d\1\0\0\0\u009f\u00a0\1\0\0\0"+
		"\u00a0\u009e\1\0\0\0\u00a0\u00a1\1\0\0\0\u00a1\u00a2\1\0\0\0\u00a2\u00a3"+
		"\6\35\0\0\u00a3<\1\0\0\0\5\0\u0091\u0098\u009b\u00a0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}