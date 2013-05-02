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
		T__22=1, T__21=2, T__20=3, T__19=4, T__18=5, T__17=6, T__16=7, T__15=8, 
		T__14=9, T__13=10, T__12=11, T__11=12, T__10=13, T__9=14, T__8=15, T__7=16, 
		T__6=17, T__5=18, T__4=19, T__3=20, T__2=21, T__1=22, T__0=23, BOOL=24, 
		INT=25, WS=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "'+'", "'*'", "'fpos'", "'-'", "'tg'", "'bc'", "'('", "'<'", "'lc'", 
		"'='", "'av'", "'<='", "'&&'", "'||'", "'>'", "'fcc'", "'ve'", "'/'", 
		"'re'", "'>='", "'hasard'", "'td'", "BOOL", "INT", "WS"
	};
	public static final String[] ruleNames = {
		"T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", 
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "BOOL", "INT", "WS"
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
		case 25: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\1\2\32\u0094\6\uffff\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5"+
		"\2\6\7\6\2\7\7\7\2\b\7\b\2\t\7\t\2\n\7\n\2\13\7\13\2\f\7\f\2\r\7\r\2\16"+
		"\7\16\2\17\7\17\2\20\7\20\2\21\7\21\2\22\7\22\2\23\7\23\2\24\7\24\2\25"+
		"\7\25\2\26\7\26\2\27\7\27\2\30\7\30\2\31\7\31\1\0\1\0\1\1\1\1\1\2\1\2"+
		"\1\3\1\3\1\3\1\3\1\3\1\4\1\4\1\5\1\5\1\5\1\6\1\6\1\6\1\7\1\7\1\b\1\b\1"+
		"\t\1\t\1\t\1\n\1\n\1\13\1\13\1\13\1\f\1\f\1\f\1\r\1\r\1\r\1\16\1\16\1"+
		"\16\1\17\1\17\1\20\1\20\1\20\1\20\1\21\1\21\1\21\1\22\1\22\1\23\1\23\1"+
		"\23\1\24\1\24\1\24\1\25\1\25\1\25\1\25\1\25\1\25\1\25\1\26\1\26\1\26\1"+
		"\27\1\27\1\27\1\27\1\27\1\27\1\27\1\27\1\27\3\27\u0082\b\27\1\30\1\30"+
		"\1\30\5\30\u0087\b\30\n\30\f\30\u008a\t\30\3\30\u008c\b\30\1\31\4\31\u008f"+
		"\b\31\13\31\f\31\u0090\1\31\1\31\0\32\1\1\uffff\3\2\uffff\5\3\uffff\7"+
		"\4\uffff\t\5\uffff\13\6\uffff\r\7\uffff\17\b\uffff\21\t\uffff\23\n\uffff"+
		"\25\13\uffff\27\f\uffff\31\r\uffff\33\16\uffff\35\17\uffff\37\20\uffff"+
		"!\21\uffff#\22\uffff%\23\uffff\'\24\uffff)\25\uffff+\26\uffff-\27\uffff"+
		"/\30\uffff\61\31\uffff\63\32\0\1\0\3\1\619\1\609\3\t\n\r\r  \u0097\0\1"+
		"\1\0\0\0\0\3\1\0\0\0\0\5\1\0\0\0\0\7\1\0\0\0\0\t\1\0\0\0\0\13\1\0\0\0"+
		"\0\r\1\0\0\0\0\17\1\0\0\0\0\21\1\0\0\0\0\23\1\0\0\0\0\25\1\0\0\0\0\27"+
		"\1\0\0\0\0\31\1\0\0\0\0\33\1\0\0\0\0\35\1\0\0\0\0\37\1\0\0\0\0!\1\0\0"+
		"\0\0#\1\0\0\0\0%\1\0\0\0\0\'\1\0\0\0\0)\1\0\0\0\0+\1\0\0\0\0-\1\0\0\0"+
		"\0/\1\0\0\0\0\61\1\0\0\0\0\63\1\0\0\0\1\65\1\0\0\0\3\67\1\0\0\0\59\1\0"+
		"\0\0\7;\1\0\0\0\t@\1\0\0\0\13B\1\0\0\0\rE\1\0\0\0\17H\1\0\0\0\21J\1\0"+
		"\0\0\23L\1\0\0\0\25O\1\0\0\0\27Q\1\0\0\0\31T\1\0\0\0\33W\1\0\0\0\35Z\1"+
		"\0\0\0\37]\1\0\0\0!_\1\0\0\0#c\1\0\0\0%f\1\0\0\0\'h\1\0\0\0)k\1\0\0\0"+
		"+n\1\0\0\0-u\1\0\0\0/\u0081\1\0\0\0\61\u008b\1\0\0\0\63\u008e\1\0\0\0"+
		"\65\66\5)\0\0\66\2\1\0\0\0\678\5+\0\08\4\1\0\0\09:\5*\0\0:\6\1\0\0\0;"+
		"<\5f\0\0<=\5p\0\0=>\5o\0\0>?\5s\0\0?\b\1\0\0\0@A\5-\0\0A\n\1\0\0\0BC\5"+
		"t\0\0CD\5g\0\0D\f\1\0\0\0EF\5b\0\0FG\5c\0\0G\16\1\0\0\0HI\5(\0\0I\20\1"+
		"\0\0\0JK\5<\0\0K\22\1\0\0\0LM\5l\0\0MN\5c\0\0N\24\1\0\0\0OP\5=\0\0P\26"+
		"\1\0\0\0QR\5a\0\0RS\5v\0\0S\30\1\0\0\0TU\5<\0\0UV\5=\0\0V\32\1\0\0\0W"+
		"X\5&\0\0XY\5&\0\0Y\34\1\0\0\0Z[\5|\0\0[\\\5|\0\0\\\36\1\0\0\0]^\5>\0\0"+
		"^ \1\0\0\0_`\5f\0\0`a\5c\0\0ab\5c\0\0b\"\1\0\0\0cd\5v\0\0de\5e\0\0e$\1"+
		"\0\0\0fg\5/\0\0g&\1\0\0\0hi\5r\0\0ij\5e\0\0j(\1\0\0\0kl\5>\0\0lm\5=\0"+
		"\0m*\1\0\0\0no\5h\0\0op\5a\0\0pq\5s\0\0qr\5a\0\0rs\5r\0\0st\5d\0\0t,\1"+
		"\0\0\0uv\5t\0\0vw\5d\0\0w.\1\0\0\0xy\5t\0\0yz\5r\0\0z{\5u\0\0{\u0082\5"+
		"e\0\0|}\5f\0\0}~\5a\0\0~\177\5l\0\0\177\u0080\5s\0\0\u0080\u0082\5e\0"+
		"\0\u0081x\1\0\0\0\u0081|\1\0\0\0\u0082\60\1\0\0\0\u0083\u008c\5\60\0\0"+
		"\u0084\u0088\7\0\0\0\u0085\u0087\7\1\0\0\u0086\u0085\1\0\0\0\u0087\u008a"+
		"\1\0\0\0\u0088\u0086\1\0\0\0\u0088\u0089\1\0\0\0\u0089\u008c\1\0\0\0\u008a"+
		"\u0088\1\0\0\0\u008b\u0083\1\0\0\0\u008b\u0084\1\0\0\0\u008c\62\1\0\0"+
		"\0\u008d\u008f\7\2\0\0\u008e\u008d\1\0\0\0\u008f\u0090\1\0\0\0\u0090\u008e"+
		"\1\0\0\0\u0090\u0091\1\0\0\0\u0091\u0092\1\0\0\0\u0092\u0093\6\31\0\0"+
		"\u0093\64\1\0\0\0\5\0\u0081\u0088\u008b\u0090";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}