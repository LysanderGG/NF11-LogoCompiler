package logoparsing;

import org.antlr.v4.runtime.ParserRuleContext;

public class FuncDictionaryEntry {
	private ParserRuleContext 	m_ctx;
	private VarDictionary		m_args;

	public FuncDictionaryEntry(ParserRuleContext _ctx, int _nbArgs) {
		m_ctx = _ctx;
		if(_nbArgs > 0) {
			m_args = new VarDictionary();
		} else {
			m_args = null;
		}
	}
	
	public FuncDictionaryEntry(ParserRuleContext _ctx, VarDictionary _dico) {
		m_ctx = _ctx;
		m_args = _dico;
	}
	
	public ParserRuleContext getParserRuleContext() {
		return m_ctx;
	}
	
	public VarDictionary getArgs() {
		return m_args;
	}
	
	public int getArgsNumber() {
		return m_args.getSize();
	}
	
	public Integer addArgument(String _name, Integer _value) {
		return m_args.put(_name, _value);
	}
}
