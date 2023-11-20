package com.malt.grammar.compiler.util;

import java.util.Arrays;
import java.util.Vector;

public class VarDescriptor {
	public String varName;
	public String varType;
	public String value;
	public String[] listValue;
	public String returnType;

	private Vector<String> params;

	public VarDescriptor(String n, String t) {
		varName = n;
		varType = t;
		value = "";
		listValue = new String[0];
		params = new Vector<String>();
		returnType = "";
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

	public int getListLength() {
		return this.listValue.length;
	}

	@Override
	public String toString() {
		String str;
		if (this.varType.contains("list")) {
			str = this.varType + " | " + this.varName + " | " + Arrays.toString(this.listValue);
		} else {
			str = this.varType + " | " + this.varName + " | " + this.value;
		}

		return str;
	}
}
