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
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		INT=17, WS=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "'+'", "'*'", "'-'", "'fpos'", "'tg'", "'bc'", "'('", "'lc'", "'av'", 
		"'fcc'", "'ve'", "'/'", "'re'", "'hasard'", "'td'", "INT", "WS"
	};
	public static final String[] ruleNames = {
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "INT", 
		"WS"
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
		case 17: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\1\2\22g\6\uffff\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2\6\7"+
		"\6\2\7\7\7\2\b\7\b\2\t\7\t\2\n\7\n\2\13\7\13\2\f\7\f\2\r\7\r\2\16\7\16"+
		"\2\17\7\17\2\20\7\20\2\21\7\21\1\0\1\0\1\1\1\1\1\2\1\2\1\3\1\3\1\4\1\4"+
		"\1\4\1\4\1\4\1\5\1\5\1\5\1\6\1\6\1\6\1\7\1\7\1\b\1\b\1\b\1\t\1\t\1\t\1"+
		"\n\1\n\1\n\1\n\1\13\1\13\1\13\1\f\1\f\1\r\1\r\1\r\1\16\1\16\1\16\1\16"+
		"\1\16\1\16\1\16\1\17\1\17\1\17\1\20\1\20\1\20\5\20Z\b\20\n\20\f\20]\t"+
		"\20\3\20_\b\20\1\21\4\21b\b\21\13\21\f\21c\1\21\1\21\0\22\1\1\uffff\3"+
		"\2\uffff\5\3\uffff\7\4\uffff\t\5\uffff\13\6\uffff\r\7\uffff\17\b\uffff"+
		"\21\t\uffff\23\n\uffff\25\13\uffff\27\f\uffff\31\r\uffff\33\16\uffff\35"+
		"\17\uffff\37\20\uffff!\21\uffff#\22\0\1\0\3\1\619\1\609\3\t\n\r\r  i\0"+
		"\1\1\0\0\0\0\3\1\0\0\0\0\5\1\0\0\0\0\7\1\0\0\0\0\t\1\0\0\0\0\13\1\0\0"+
		"\0\0\r\1\0\0\0\0\17\1\0\0\0\0\21\1\0\0\0\0\23\1\0\0\0\0\25\1\0\0\0\0\27"+
		"\1\0\0\0\0\31\1\0\0\0\0\33\1\0\0\0\0\35\1\0\0\0\0\37\1\0\0\0\0!\1\0\0"+
		"\0\0#\1\0\0\0\1%\1\0\0\0\3\'\1\0\0\0\5)\1\0\0\0\7+\1\0\0\0\t-\1\0\0\0"+
		"\13\62\1\0\0\0\r\65\1\0\0\0\178\1\0\0\0\21:\1\0\0\0\23=\1\0\0\0\25@\1"+
		"\0\0\0\27D\1\0\0\0\31G\1\0\0\0\33I\1\0\0\0\35L\1\0\0\0\37S\1\0\0\0!^\1"+
		"\0\0\0#a\1\0\0\0%&\5)\0\0&\2\1\0\0\0\'(\5+\0\0(\4\1\0\0\0)*\5*\0\0*\6"+
		"\1\0\0\0+,\5-\0\0,\b\1\0\0\0-.\5f\0\0./\5p\0\0/\60\5o\0\0\60\61\5s\0\0"+
		"\61\n\1\0\0\0\62\63\5t\0\0\63\64\5g\0\0\64\f\1\0\0\0\65\66\5b\0\0\66\67"+
		"\5c\0\0\67\16\1\0\0\089\5(\0\09\20\1\0\0\0:;\5l\0\0;<\5c\0\0<\22\1\0\0"+
		"\0=>\5a\0\0>?\5v\0\0?\24\1\0\0\0@A\5f\0\0AB\5c\0\0BC\5c\0\0C\26\1\0\0"+
		"\0DE\5v\0\0EF\5e\0\0F\30\1\0\0\0GH\5/\0\0H\32\1\0\0\0IJ\5r\0\0JK\5e\0"+
		"\0K\34\1\0\0\0LM\5h\0\0MN\5a\0\0NO\5s\0\0OP\5a\0\0PQ\5r\0\0QR\5d\0\0R"+
		"\36\1\0\0\0ST\5t\0\0TU\5d\0\0U \1\0\0\0V_\5\60\0\0W[\7\0\0\0XZ\7\1\0\0"+
		"YX\1\0\0\0Z]\1\0\0\0[Y\1\0\0\0[\\\1\0\0\0\\_\1\0\0\0][\1\0\0\0^V\1\0\0"+
		"\0^W\1\0\0\0_\"\1\0\0\0`b\7\2\0\0a`\1\0\0\0bc\1\0\0\0ca\1\0\0\0cd\1\0"+
		"\0\0de\1\0\0\0ef\6\21\0\0f$\1\0\0\0\4\0[^c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}