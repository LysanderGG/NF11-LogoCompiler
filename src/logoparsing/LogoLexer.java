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
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		INT=10, WS=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'fpos'", "'tg'", "'bc'", "'ve'", "'fcc'", "'lc'", "'re'", "'av'", "'td'", 
		"INT", "WS"
	};
	public static final String[] ruleNames = {
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"INT", "WS"
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
		case 10: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\1\2\13F\6\uffff\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2\6\7"+
		"\6\2\7\7\7\2\b\7\b\2\t\7\t\2\n\7\n\1\0\1\0\1\0\1\0\1\0\1\1\1\1\1\1\1\2"+
		"\1\2\1\2\1\3\1\3\1\3\1\4\1\4\1\4\1\4\1\5\1\5\1\5\1\6\1\6\1\6\1\7\1\7\1"+
		"\7\1\b\1\b\1\b\1\t\1\t\1\t\5\t9\b\t\n\t\f\t<\t\t\3\t>\b\t\1\n\4\nA\b\n"+
		"\13\n\f\nB\1\n\1\n\0\13\1\1\uffff\3\2\uffff\5\3\uffff\7\4\uffff\t\5\uffff"+
		"\13\6\uffff\r\7\uffff\17\b\uffff\21\t\uffff\23\n\uffff\25\13\0\1\0\3\1"+
		"\619\1\609\3\t\n\r\r  H\0\1\1\0\0\0\0\3\1\0\0\0\0\5\1\0\0\0\0\7\1\0\0"+
		"\0\0\t\1\0\0\0\0\13\1\0\0\0\0\r\1\0\0\0\0\17\1\0\0\0\0\21\1\0\0\0\0\23"+
		"\1\0\0\0\0\25\1\0\0\0\1\27\1\0\0\0\3\34\1\0\0\0\5\37\1\0\0\0\7\"\1\0\0"+
		"\0\t%\1\0\0\0\13)\1\0\0\0\r,\1\0\0\0\17/\1\0\0\0\21\62\1\0\0\0\23=\1\0"+
		"\0\0\25@\1\0\0\0\27\30\5f\0\0\30\31\5p\0\0\31\32\5o\0\0\32\33\5s\0\0\33"+
		"\2\1\0\0\0\34\35\5t\0\0\35\36\5g\0\0\36\4\1\0\0\0\37 \5b\0\0 !\5c\0\0"+
		"!\6\1\0\0\0\"#\5v\0\0#$\5e\0\0$\b\1\0\0\0%&\5f\0\0&\'\5c\0\0\'(\5c\0\0"+
		"(\n\1\0\0\0)*\5l\0\0*+\5c\0\0+\f\1\0\0\0,-\5r\0\0-.\5e\0\0.\16\1\0\0\0"+
		"/\60\5a\0\0\60\61\5v\0\0\61\20\1\0\0\0\62\63\5t\0\0\63\64\5d\0\0\64\22"+
		"\1\0\0\0\65>\5\60\0\0\66:\7\0\0\0\679\7\1\0\08\67\1\0\0\09<\1\0\0\0:8"+
		"\1\0\0\0:;\1\0\0\0;>\1\0\0\0<:\1\0\0\0=\65\1\0\0\0=\66\1\0\0\0>\24\1\0"+
		"\0\0?A\7\2\0\0@?\1\0\0\0AB\1\0\0\0B@\1\0\0\0BC\1\0\0\0CD\1\0\0\0DE\6\n"+
		"\0\0E\26\1\0\0\0\4\0:=B";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}