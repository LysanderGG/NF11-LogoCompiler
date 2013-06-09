package logoparsing;

import java.util.Stack;

import logogui.Log;

import org.antlr.v4.runtime.ParserRuleContext;

public class FuncDictionaryEntry {
	private ParserRuleContext 	m_ctx;
	private Integer[]			m_argsValues;
	private String[]			m_argsNames;
	private Stack<Integer[]>    m_contextStack;
	private int					m_iNbArgs;
	private int 				m_iNbArgsMax;
	private boolean				m_bIsFunction;
	private boolean             m_bMustPopTwoContexts = false;

	public FuncDictionaryEntry(ParserRuleContext _ctx, int _nbArgs) {
		m_ctx 		   = _ctx;
		m_iNbArgsMax   = _nbArgs;
		m_iNbArgs 	   = 0;
		m_bIsFunction  = false;
		m_contextStack = new Stack<Integer[]>();
		
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
		return m_iNbArgsMax;
	}
	
	public Integer addArgument(String _name, Integer _value) throws Exception {
		// Find if the variable is already in the array
		for(int i = 0; i < m_iNbArgsMax; ++i) {
			if(_name.equals(m_argsNames[i])) {
				m_argsValues[i] = _value;
				return _value;
			}
		}
		
		if(m_iNbArgs == m_iNbArgsMax) {
			throw new Exception("Too much args.");
		}
		
		m_argsNames [m_iNbArgs] = _name;
		m_argsValues[m_iNbArgs] = _value;
		++m_iNbArgs;
		
		return null;
	}

	public Integer getArgValue(String _name) throws IllegalArgumentException {
		for(int i = 0; i < m_iNbArgsMax; ++i) {
			if(_name.equals(m_argsNames[i])) {
				return m_argsValues[i];
			}
		}
		Log.appendnl("L'argument " + _name + " n'existe pas.");
		throw new IllegalArgumentException();
	}
	
	public boolean isFunction() {
		return m_bIsFunction;
	}
	
	public void setIsFunction(boolean _b) {
		m_bIsFunction = _b;
	}
	
	public void saveContext() {
	    m_contextStack.push(m_argsValues.clone());
	    m_bMustPopTwoContexts = true;
	}
	public void restoreContext() {
	    m_argsValues = m_contextStack.pop();
	    if(m_bMustPopTwoContexts && m_contextStack.size() > 0) {
	        m_argsValues = m_contextStack.pop();
	        m_bMustPopTwoContexts = false;
	    }
	}
}
