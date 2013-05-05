package logoparsing;

import org.antlr.v4.runtime.ParserRuleContext;

public class FuncDictionaryEntry {
	private ParserRuleContext 	m_ctx;
	private Integer[]			m_argsValues;
	private String[]			m_argsNames;
	private int					m_nbArgs;
	private int 				m_nbArgsMax;

	public FuncDictionaryEntry(ParserRuleContext _ctx, int _nbArgs) {
		m_ctx 		= _ctx;
		m_nbArgsMax	= _nbArgs;
		m_nbArgs 	= 0;
		
		if(_nbArgs > 0) {
			m_argsNames  = new String[_nbArgs];
			m_argsValues = new Integer[_nbArgs];
		} else {
			m_argsValues = null;
			m_argsNames  = null;
		}
	}
	
	public ParserRuleContext getParserRuleContext() {
		return m_ctx;
	}
	
	public String[] getArgsNames() {
		return m_argsNames;
	}
	
	public Integer[] getArgsValues() {
		return m_argsValues;
	}
	
	public int getArgsNumber() {
		return m_nbArgsMax;
	}
	
	public Integer addArgument(String _name, Integer _value) throws Exception {
		// Find if the variable is already in the array
		for(int i = 0; i < m_nbArgsMax; ++i) {
			if(_name.equals(m_argsNames[i])) {
				m_argsValues[i] = _value;
				return _value;
			}
		}
		
		if(m_nbArgs == m_nbArgsMax) {
			throw new Exception("Too much args.");
		}
		
		m_argsNames [m_nbArgs] = _name;
		m_argsValues[m_nbArgs] = _value;
		++m_nbArgs;
		
		return null;
	}
}
