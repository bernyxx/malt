package maltCompilerPackage.util;

import java.util.Arrays;
import java.util.Vector;

public class MaltVarDescriptor {
	public String varName;
	public String varType;
	public String value;
	public String[] listValue;

	private Vector<String> params;

	public MaltVarDescriptor(String n, String t) {
		varName = n;
		varType = t;
		value = "";
		listValue = new String[0];
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
		String str;
		if (this.varType.equals("list")) {
			str = this.varType + " | " + this.varName + " | " + Arrays.toString(this.listValue);
		} else {
			str = this.varType + " | " + this.varName + " | " + this.value;
		}

		return str;
	}
}
