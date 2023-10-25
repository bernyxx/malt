package compilerPackage.util;

import java.util.Vector;

public class VarDescriptor {
	public String varName;
	public String varType;
	public String value;

	private Vector<String> params;

	public VarDescriptor(String n, String t) {
		varName = n;
		varType = t;
		value = "";
		params = new Vector<String>();
	}

	public void addParam(String argName) {
		this.params.add(argName);
	}

	public int getNumParams() {
		return this.params.size();
	}

	public Vector<String> getParams() {
		return this.params;
	}

	@Override
	public String toString() {
		String str = this.varType + " | " + this.varName + " | " + this.value;
		return str;
	}
}
