package compilerPackage.util;

public class VarDescriptor {
	public String varName;
	public String varType;
	public float value;
	
	public VarDescriptor (String n, String t) {
		varName = n;
		varType = t;
		value = 0;
	}
}
