package logoparsing;

import java.util.HashMap;
import java.util.Map;

import logogui.Log;

public class VarDictionary {
	Map<String, Integer> m_dico = new HashMap<String, Integer>();
	
	public Integer put(String _key, Integer _value) {
		m_dico.put("test", 2);
		m_dico.put("testeuh", 2);
		m_dico.put(_key, _value);
		return _value;
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
}
