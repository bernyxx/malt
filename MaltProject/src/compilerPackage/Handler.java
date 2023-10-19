package compilerPackage;

import java.util.Hashtable;
import java.util.Set;
import java.util.Vector;

import org.antlr.runtime.Token;

import compilerPackage.util.VarDescriptor;

public class Handler {

	Hashtable<String, VarDescriptor> symbolTable;
	Hashtable<String, Hashtable<String, VarDescriptor>> functionTables;

	public Handler() {
		symbolTable = new Hashtable<String, VarDescriptor>();
		functionTables = new Hashtable<String, Hashtable<String, VarDescriptor>>();
	}

	public void declareFunCl(Token id, Token name) {
		String i = "";
		if (id != null)
			i = id.getText();
		String n = name.getText();
		VarDescriptor vd = new VarDescriptor(n, "fun");

		String str = "";

		if (i.equals("fun")) {
			str = "La funzione ";
		}
		if (i.equals("class")) {
			str = "La classe ";
		}

		if (!i.equals("") && !i.equals("fun") && !i.equals("class")) {
			Hashtable<String, VarDescriptor> localTable = functionTables.get(i);

			if (localTable.containsKey(i)) {

				System.err.println("Il metodo " + n + " della classe " + i + " è già stato dichiarato --> riga ("
						+ name.getLine() + ")");

			} else {
				localTable.put(n, vd);

				System.out.println("è stato dichiarato un metodo " + n + " della classe " + i + " --> riga ("
						+ name.getLine() + ")");
				functionTables.put(i + "." + n, new Hashtable<String, VarDescriptor>());
			}
		} else {

			if (symbolTable.containsKey(n)) {
				System.err.println(str + n + " è già stata dichiarata --> riga (" + name.getLine() + ")");

			} else {
				symbolTable.put(n, vd);

				System.out.println("è stata dichiarata " + str + n + " --> riga (" + name.getLine() + ")");

				functionTables.put(n, new Hashtable<String, VarDescriptor>());
			}
		}
	}

	public void declareVar(Token type, Token name) {
		String t = type.getText();
		String n = name.getText();
		VarDescriptor vd = new VarDescriptor(n, t);

		if (symbolTable.containsKey(n)) {
			System.err.println("La variabile " + n + " è già stata dichiarata --> riga (" + type.getLine() + ")");
		} else {
			symbolTable.put(n, vd);
			System.out.println("è stata dichiarata una variabile " + n + " --> riga (" + type.getLine() + ")");
		}
	}

	public void declareVarInFunCl(Token id, String nameFunCl, Token type, Token name) {
		String i = "";
		if (id != null)
			i = id.getText();
		String t = type.getText();
		String n = name.getText();
		VarDescriptor vd = new VarDescriptor(n, t);

		String str = "";

		if (i.equals("fun") || i.equals("")) {
			str = " della funzione ";
		} 
		if (i.equals("class")) {
			str = " della classe ";
		}
		
		System.out.println("ID bello: " + i);
		System.out.println("Stringa bella: " + str);
		
		if (!i.equals("") && !i.equals("fun") && !i.equals("class")) {
			Hashtable<String, VarDescriptor> localTable = functionTables.get(i + "." + nameFunCl);
			
			if (localTable.containsKey(n)) {

				System.err.println("La variabile " + n + " nel metodo " + nameFunCl + " della classe " + i + " è già stata dichiarata --> riga ("
						+ type.getLine() + ")");

			} else {
				localTable.put(n, vd);

				System.out.println(
						"è stata dichiarata una variabile " + n + " nel metodo " + nameFunCl + " della classe " + i + " --> riga (" + type.getLine() + ")");
			}
			return;
		}
		
		Hashtable<String, VarDescriptor> localTable = functionTables.get(nameFunCl);
		
		if (localTable.containsKey(n)) {

			System.err.println("La variabile " + n + str + nameFunCl + " è già stata dichiarata --> riga ("
					+ type.getLine() + ")");

		} else {
			localTable.put(n, vd);

			System.out.println(
					"è stata dichiarata una variabile " + n + str + nameFunCl + " --> riga (" + type.getLine() + ")");
		}
	}

	public void declareNew(Token id, String nameFunCl, Token type, Token name) {
		if (nameFunCl.equals("")) {
			declareVar(type, name);
		} else {
			declareVarInFunCl(id, nameFunCl, type, name);
		}

	}

	public void printTable() {
		System.out.println("\n\n--------BEGIN GLOBAL TABLE--------");
		Set<String> keysG = symbolTable.keySet();
		for (String varG : keysG) {
			System.out.println(symbolTable.get(varG));
		}
		System.out.println("--------END GLOBAL TABLE--------\n\n");
		
		
		System.out.println("--------BEGIN FUNCTION TABLE--------");
		Set<String> keysL = functionTables.keySet();
		for (String varL : keysL) {
			System.out.println(varL);
			System.out.println(functionTables.get(varL));
		}
		System.out.println("--------END FUNCTION TABLE--------");
	}

	public void prova(Token name, Token type) {
		if (name != null && type != null)
			System.out.println("PROVA: " + name.getText() + " " + type.getText());
	}

	void hello() {
		System.out.println("Hello world");
	}
}