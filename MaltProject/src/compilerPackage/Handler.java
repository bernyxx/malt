package compilerPackage;

import java.util.Hashtable;
import java.util.Set;

import org.antlr.runtime.Token;

import compilerPackage.util.VarDescriptor;

public class Handler {

	Hashtable<String, VarDescriptor> symbolTable;
	Hashtable<String, Hashtable<String, VarDescriptor>> functionTables;

	public Handler() {
		symbolTable = new Hashtable<String, VarDescriptor>();
		functionTables = new Hashtable<String, Hashtable<String, VarDescriptor>>();
	}

	/***
	 * 
	 * @param id   class/fun/""/ nome della classe (per i metodi)
	 * @param name Nome della funzione / classe / metodo della classe
	 */
	public void declareFunCl(Token id, Token name) {
		String i = "";
		if (id != null)
			i = id.getText();
		String n = name.getText();
		VarDescriptor vd = new VarDescriptor(n, "fun");

		String str = "";

		if (i.equals("fun") || i.equals("")) {
			str = "La funzione ";
		}
		if (i.equals("class")) {
			str = "La classe ";
		}

		// metodo di una classe
		if (!i.equals("") && !i.equals("fun") && !i.equals("class")) {
			Hashtable<String, VarDescriptor> localTable = functionTables.get("cl_" + i);

			if (localTable.containsKey(n) && localTable.get(n).varType.equals("fun")) {

				System.err.println("Il metodo " + n + " della classe " + i + " è già stato dichiarato --> riga ("
						+ name.getLine() + ")");

			} else {
				localTable.put("fun_" + n, vd);

				System.out.println("è stato dichiarato un metodo " + n + " della classe " + i + " --> riga ("
						+ name.getLine() + ")");
				functionTables.put(i + "." + n, new Hashtable<String, VarDescriptor>());
			}
		} else {

			if (symbolTable.containsKey(n) && symbolTable.get(n).varType.equals("fun")) {
				System.err.println(str + n + " è già stata dichiarata --> riga (" + name.getLine() + ")");

			} else {

				String key;

				if (i.equals("fun") || i.equals("")) {
					key = "fun_" + n;
				} else {
					key = "cl_" + n;
					vd = new VarDescriptor(n, "class");
				}

				symbolTable.put(key, vd);
				functionTables.put(key, new Hashtable<String, VarDescriptor>());

				System.out.println("è stata dichiarata " + str + n + " --> riga (" + name.getLine() + ")");

			}
		}
	}

	/**
	 * 
	 * @param type Tipo della variabile
	 * @param name Nome della variabile
	 */

	public void declareVar(Token type, Token name) {
		String t = type.getText();
		String n = name.getText();
		VarDescriptor vd = new VarDescriptor(n, t);

		if (symbolTable.containsKey(n) && symbolTable.get(n).varType != "fun") {
			System.err.println("La variabile " + n + " è già stata dichiarata --> riga (" + type.getLine() + ")");
		} else {
			symbolTable.put(n, vd);
			System.out.println("è stata dichiarata una variabile " + n + " --> riga (" + type.getLine() + ")");
		}
	}

	/**
	 * 
	 * @param id        class/fun/""/ nome della classe (per i metodi)
	 * @param nameFunCl nome della funzione/classe/metodo della classe
	 * @param type      tipo della variabile
	 * @param name      nome della variabile
	 */
	public void declareVarInFunCl(Token id, Token nameFunCl, Token type, Token name) {
		String i = "";
		if (id != null)
			i = id.getText();
		String t = type.getText();
		String n = name.getText();
		String nf = nameFunCl.getText();
		VarDescriptor vd = new VarDescriptor(n, t);

		// dichiarazione di variabile all'interno di metodi di una classe
		if (!i.equals("") && !i.equals("fun") && !i.equals("class")) {
			Hashtable<String, VarDescriptor> localTable = functionTables.get(i + "." + nf);

			if (localTable.containsKey(n)) {

				System.err.println("La variabile " + n + " nel metodo " + nf + " della classe " + i
						+ " è già stata dichiarata --> riga ("
						+ type.getLine() + ")");

			} else {

				localTable.put(n, vd);

				System.out.println(
						"è stata dichiarata una variabile " + n + " nel metodo " + nf + " della classe " + i
								+ " --> riga (" + type.getLine() + ")");
			}
		} else {
			// dichiarazione di variabili nelle funzioni e come campi nelle classi

			String str = "";
			String keyLocalTable = "";

			if (i.equals("fun") || i.equals("")) {
				str = " della funzione ";
				keyLocalTable = "fun_" + nf;
			}
			if (i.equals("class")) {
				str = " della classe ";
				keyLocalTable = "cl_" + nf;
			}

			Hashtable<String, VarDescriptor> localTable = functionTables.get(keyLocalTable);

			if (localTable.containsKey(n)) {

				System.err.println("La variabile " + n + str + nf + " è già stata dichiarata --> riga ("
						+ type.getLine() + ")");

			} else {
				localTable.put(n, vd);

				System.out.println(
						"è stata dichiarata una variabile " + n + str + nf + " --> riga (" +
								type.getLine() + ")");
			}
		}
	}

	/**
	 * 
	 * @param id        class/fun/""/ nome della classe (per i metodi)
	 * @param nameFunCl nome della funzione/classe/metodo della classe
	 * @param type      tipo della variabile
	 * @param name      nome della variabile
	 */
	public void declareNew(Token id, Token nameFunCl, Token type, Token name) {

		if (nameFunCl == null) {
			// dichiarazione di variabili top-level
			declareVar(type, name);
		} else {
			// dichiarazione di variabili in funzioni/classi/metodi
			declareVarInFunCl(id, nameFunCl, type, name);
		}

	}

	public void declareArg(Token className, Token funcName, Token type, Token name) {

		String fn = funcName.getText();
		String t = type.getText();
		String n = name.getText();

		// caso delle funzioni
		if (className == null) {

			Hashtable<String, VarDescriptor> localTable = functionTables.get("fun_" + fn);

			if (localTable.containsKey(n)) {
				System.err.println("L'argomento " + n + " nella funzione " + fn + " è già stato dichiarato --> riga ("
						+ type.getLine() + ")");
			} else {
				localTable.put(n, new VarDescriptor(n, t));
				System.out.println(
						"è stato dichiarato un argomento " + n + " nella funzione " + fn + " --> riga (" +
								type.getLine() + ")");
			}

		} else {
			String cn = className.getText();

			Hashtable<String, VarDescriptor> localTable = functionTables.get(cn + "." + fn);

			if (localTable.containsKey(n)) {
				System.err.println("L'argomento " + n + " nel metodo " + fn + " della classe " + cn
						+ " è già stato dichiarato --> riga ("
						+ type.getLine() + ")");
			} else {
				localTable.put(n, new VarDescriptor(n, t));
				System.out.println(
						"è stato dichiarato un argomento " + n + " nel metodo " + fn + " della classe " + cn
								+ " --> riga (" +
								type.getLine() + ")");
			}

		}
	}

	public void assignVarValue(Token id, Token className, Token name, Token value) {
		String i = id.getText();
		String n = name.getText();
		String v = value.getText();

		// caso della funzione
		if (className == null && id != null) {

			// localTable della funzione dove viene assegnata la variabile
			Hashtable<String, VarDescriptor> localTable = functionTables.get("fun_" + i);

			if (localTable.containsKey(n)) {
				VarDescriptor vd = localTable.get(n);
				vd.value = v;
				System.out
						.println("Alla variabile " + n + " nella funzione " + i + " è stato assegnato il valore " + v);
			} else {
				System.out.println("Errore assegnamento! La variabile " + n + " nella funzione " + i + " non esiste!");
			}

		}

		// TODO: caso metodo
		// TODO: caso top-level

	}

	// stampa le symbol tables
	public void printTable() {
		System.out.println("\n\n--------BEGIN GLOBAL TABLE--------");
		Set<String> keysG = symbolTable.keySet();
		for (String varG : keysG) {
			System.out.println(varG + "-> " + symbolTable.get(varG));
		}
		System.out.println("--------END GLOBAL TABLE--------\n\n");

		System.out.println("--------BEGIN FUNCTION TABLE--------");
		Set<String> keysL = functionTables.keySet();
		for (String varL : keysL) {

			System.out.println(varL + "-> " + functionTables.get(varL));
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