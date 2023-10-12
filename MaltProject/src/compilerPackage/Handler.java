package compilerPackage;

import java.util.Hashtable;

import org.antlr.runtime.Token;

import compilerPackage.util.VarDescriptor;

public class Handler {
	
	Hashtable<String, VarDescriptor> symbolTable;
	
	public Handler() {
		symbolTable = new Hashtable<>();
	}
	
	public void declareVar(Token type, Token name) {
		String t = type.getText();
		String n = name.getText();
		VarDescriptor vd = new VarDescriptor(n, t);
		
		if(symbolTable.containsKey(n)) {
			System.err.println("La variabile " + n + " è già stata dichiarata --> riga (" + type.getLine() + ")");
		} else {
			symbolTable.put(n, vd);
			System.out.println("è stata dichiarata una variabile " + n + " --> riga (" + type.getLine() + ")");
		}
	}
	
	void hello() {
		System.out.println("Hello world");
	}
}