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
		FuncDictionaryEntry entry = m_dico.get(_key);
		if(entry == null) {
			Log.appendnl("La procédure ou fonction " + _key + " n'existe pas.");
		}
		return entry;
	}
}
