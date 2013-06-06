package logoparsing;

import java.util.HashMap;
import java.util.Map;

import logogui.Log;

public class VarDictionary {
	Map<String, Integer> m_dico = new HashMap<String, Integer>();
	
	public Integer put(String _key, Integer _value) {
		m_dico.put(_key, _value);
		return _value;
	}
	
	public boolean containsKey(Object key) {
		return m_dico.containsKey(key);
	}
	
	public Integer get(String _key) throws Exception {
		Integer value = m_dico.get(_key);
		if(value == null) {
			Log.appendnl("" + _key + " n'a pas été déclarée auparavant.");
			throw new Exception("Variable non déclarée.");
		} else {
			return value;
		}
	}
	
	public int getSize() {
		return m_dico.size();
	}
}
