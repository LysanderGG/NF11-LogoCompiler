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

	public FuncDictionaryEntry(ParserRuleContext _ctx, int _nbArgs) {
		m_ctx 		   = _ctx;
		m_iNbArgsMax   = _nbArgs;
		m_iNbArgs 	   = 0;
		
		if(_nbArgs > 0) {
			m_contextStack 	= new Stack<Integer[]>();
			m_argsNames  	= new String[_nbArgs];
			m_argsValues 	= new Integer[_nbArgs];
		} else {
			m_contextStack	= null;
			m_argsValues 	= null;
			m_argsNames  	= null;
		}
	}
	
	public ParserRuleContext getParserRuleContext() {
		return m_ctx;
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
	
	/**
	 * Sets a temporary argument value in the list of arguments during a function call
	 * These values will NOT be used to get the value back
	 * You have to save the context for this.
	 * 
	 * @param _indice	: indice in the list of arguments
	 * @param _value 	: value of the argument
	 * @throws IllegalArgumentException
	 */
	public void setTemporaryArgValue(int _indice, int _value) throws IllegalArgumentException {
		if(_indice >= m_iNbArgsMax) {
			throw new IllegalArgumentException();
		}
		m_argsValues[_indice] = _value;
	}

	/**
	 * Returns the current value of an argument depending on the context.
	 * 
	 * @param _name : name of the argument
	 * @return value of the argument
	 * @throws IllegalArgumentException
	 */
	public Integer getCurrentArgValue(String _name) throws IllegalArgumentException {
		for(int i = 0; i < m_iNbArgsMax; ++i) {
			if(_name.equals(m_argsNames[i])) {
				return m_contextStack.peek()[i];
			}
		}
		Log.appendnl("L'argument " + _name + " n'existe pas.");
		throw new IllegalArgumentException();
	}
	
	public void saveContext() {
		if(m_argsValues != null && m_contextStack != null) {
			m_contextStack.push(m_argsValues.clone());
		}
	}
	public void restoreContext() {
		if(m_argsValues != null && m_contextStack != null) {
		    m_contextStack.pop();
		}
	}
}
