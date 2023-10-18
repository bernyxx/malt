package compilerPackage;

import java.util.Hashtable;
import java.util.Set;
import java.util.Vector;

import org.antlr.runtime.Token;

import compilerPackage.util.VarDescriptor;

public class Handler {
	
	Hashtable<String, VarDescriptor> symbolTable;
	Hashtable<String,Hashtable<String, VarDescriptor>> functionTables;
	
	public Handler() {
		symbolTable = new Hashtable<String, VarDescriptor>();
		functionTables = new Hashtable<String,Hashtable<String, VarDescriptor>>();
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
	
	public void declareFun(Token name) {
		String n = name.getText();
		VarDescriptor vd = new VarDescriptor(n, "fun");
		
		if(symbolTable.containsKey(n)) {
			System.err.println("La funzione" + n + " è già stata dichiarata --> riga (" + name.getLine() + ")");
		} else {
			symbolTable.put(n, vd);
			System.out.println("è stata dichiarata una funzione " + n + " --> riga (" + name.getLine() + ")");
			functionTables.put(n,new Hashtable<String,VarDescriptor>());
		}
	}
	
	public void declareVarInFun(Token nameFun, Token type, Token name) {
		String nf = type.getText();
		String t = type.getText();
		String n = name.getText();
		VarDescriptor vd = new VarDescriptor(n, t);
		Hashtable<String, VarDescriptor> localTable = functionTables.get(nf);
		
		if(localTable.containsKey(n)) {
			System.err.println("La variabile " + n + " è già stata dichiarata --> riga (" + type.getLine() + ")");
		} else {
			localTable.put(n, vd);
			System.out.println("è stata dichiarata una variabile " + n + " --> riga (" + type.getLine() + ")");
		}
	}
	
	public void printTable() {
		Set<String> keys = symbolTable.keySet();
		for(String var : keys) {
			System.out.println(symbolTable.get(var));
		}
	}
	
	public void prova(Token name, Token type) {
		System.out.println(name.getText() + " " + type.getText());
	}
	
	void hello() {
		System.out.println("Hello world");
	}
}