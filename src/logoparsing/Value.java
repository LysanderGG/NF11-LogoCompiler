package logoparsing;

public class Value {
	
	private boolean b;
	private int i;
	
	public Value() {
		b = false;
		i = 0;
	}
	
	public Value(int _i) {
		b = false;
		i = _i;
	}
	
	public Value(boolean _b) {
		b = _b;
		i = 0;
	}
	
	public Value(String _s) {
		setValue(_s);
	}
	
	public void setValue(String _s) {
		if(_s.equals("true")) {
			b = true;
		} else if(_s.equals("false")) {
			b = false;
		} else {
			i = Integer.valueOf(_s);
		}
	}
	
	public void setValue(boolean _b) {
		b = _b;
	}
	
	public void setValue(int _i) {
		i = _i;
	}
	
	public boolean getBool() {
		return b;
	}
	
	public int getInt() {
		return i;
	}
	
}
