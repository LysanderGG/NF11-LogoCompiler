package logoparsing;

import java.util.HashMap;
import java.util.Map;

import logogui.Log;

public class FuncDictionary {
	Map<String, FuncDictionaryEntry> m_dico = new HashMap<String, FuncDictionaryEntry>();
	
	public FuncDictionaryEntry put(String _key, FuncDictionaryEntry _value) {
		m_dico.put(_key, _value);
		return _value;
	}
	
	public FuncDictionaryEntry get(String _key) throws Exception {
		try {
			return m_dico.get(_key);
		} catch(NullPointerException e) {
			Log.appendnl("La fonction ou la procédure " + _key + " n'existe pas.");
			throw e;
		}
	}
}
