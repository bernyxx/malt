package com.malt.grammar.compiler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

import com.malt.grammar.compiler.util.MaltVarDescriptor;

public class MaltHandler {
	public static int LEXICAL_ERROR = 0;
	public static int SYNTAX_ERROR = 1;
	public static int METHOD_ALREADY_DECLARED_ERROR = 2;
	public static int FUNCTION_ALREADY_DECLARED_ERROR = 3;
	public static int CLASS_ALREADY_DECLARED_ERROR = 4;
	public static int DECLARE_FUN_CL_ERROR = 5;
	public static int VARIABLE_ALREADY_DECLARED_FOR_ERROR = 6;
	public static int VARIABLE_ALREADY_DECLARED_TOP_ERROR = 7;
	public static int VARIABLE_ALREADY_DECLARED_CLASS_METHOD_ERROR = 8;
	public static int FUNCTION_VARIABLE_ALREADY_DECLARED_ERROR = 9;
	public static int FIELD_ALREADY_DECLARED_ERROR = 10;
	public static int DECLARE_VAR_IN_FUN_CL_ERROR = 11;
	public static int FUNCTION_ARG_ALREADY_DECLARED_ERROR = 12;
	public static int METHOD_ARG_ALREADY_DECLARED_ERROR = 13;
	public static int METHOD_VARIABLE_UNDECLARED_ERROR = 14;
	public static int FUNCTION_VARIABLE_UNDECLARED_ERROR = 15;
	public static int FIELD_UNDECLARED_ERROR = 16;
	public static int TOP_VARIABLE_UNDECLARED_ERROR = 17;
	public static int METHOD_UNDECLARED_ERROR = 18;
	public static int FUNCTION_UNDECLARED_ERROR = 19;
	public static int FUNCTION_PARAMETER_UNDECLARED_ERROR = 20;
	public static int FORMAT_VARIABLE_UNDECLARED_ERROR = 21;
	public static int FUNCTION_CALL_ERROR = 22;
	public static int EMPTY_LIST_ERROR = 23;
	public static int VARIABLE_UNDECLARED_ERROR = 24;
	public static int NOT_MATCH_TYPE_ARG_ERROR = 25;
	public static int NOT_MATCH_NUM_ARG_ERROR = 26;
	public static int NOT_MATCH_TYPE_ASSIGNMENT_ERROR = 27;
	public static int ILLEGAL_EXPR_ASSIGNMENT_ERROR = 28;

	Hashtable<String, MaltVarDescriptor> symbolTable;
	Hashtable<String, Hashtable<String, MaltVarDescriptor>> functionTables;

	List<String> errorList;
	TokenStream input;

	public MaltHandler(TokenStream input) {
		this.input = input;
		this.symbolTable = new Hashtable<String, MaltVarDescriptor>();
		this.functionTables = new Hashtable<String, Hashtable<String, MaltVarDescriptor>>();
		this.errorList = new ArrayList<String>();
	}

	public List<String> getErrorList() {
		return errorList;
	}

	// Gestione errori lessicali e sintattici
	public void handleError(Token tk, String hdr, String msg) {
		String errMsg;
		if (tk == null)
			tk = input.LT(-1);

		if (tk.getType() == MaltLexer.ERROR_TK)
			errMsg = "Errore Lessicale " + LEXICAL_ERROR;
		else
			errMsg = "Errore Sintattico " + SYNTAX_ERROR;

		errMsg += " al punto [" + tk.getLine() + ", " + (tk.getCharPositionInLine() + 1) + "] sul token '"
				+ tk.getText() + "'";
		errorList.add(errMsg);
	}

	// Gestione errori semantici
	void maltErrorHandler(int code, Token tk) {
		String errMsg;

		if (code == LEXICAL_ERROR)
			errMsg = "Errore Lessicale Sbagliato " + code;
		else if (code == SYNTAX_ERROR)
			errMsg = "Errore Sintattico Sbagliato " + code;
		else
			errMsg = "Errore Semantico " + code;

		if (tk == null)
			tk = input.LT(-1);
		errMsg += " al punto [" + tk.getLine() + ", " + (tk.getCharPositionInLine() + 1) + "] sul token '"
				+ tk.getText() + "': ";

		if (code == METHOD_ALREADY_DECLARED_ERROR) {
			errMsg += "Il metodo della classe è già stato dichiarato";
		} else if (code == FUNCTION_ALREADY_DECLARED_ERROR) {
			errMsg += "La funzione è già stata dichiarata";
		} else if (code == CLASS_ALREADY_DECLARED_ERROR) {
			errMsg += "La classe è già stata dichiarata";
		} else if (code == DECLARE_FUN_CL_ERROR) {
			errMsg += "In declareFunCl(), className e name sono entrambi nulli";
		} else if (code == VARIABLE_ALREADY_DECLARED_FOR_ERROR) {
			errMsg += "La variabile nel ciclo for è già stata dichiarata";
		} else if (code == VARIABLE_ALREADY_DECLARED_TOP_ERROR) {
			errMsg += "La variabile top-level è già stata dichiarata";
		} else if (code == VARIABLE_ALREADY_DECLARED_CLASS_METHOD_ERROR) {
			errMsg += "La variabile nel metodo della classe è già stata dichiarata";
		} else if (code == FUNCTION_VARIABLE_ALREADY_DECLARED_ERROR) {
			errMsg += "La variabile della funzione è già stata dichiarata";
		} else if (code == FIELD_ALREADY_DECLARED_ERROR) {
			errMsg += "Il campo della classe è già stato dichiarato";
		} else if (code == DECLARE_VAR_IN_FUN_CL_ERROR) {
			errMsg += "In declareVarInFunCl(), className e functionName sono entrambi nulli";
		} else if (code == FUNCTION_ARG_ALREADY_DECLARED_ERROR) {
			errMsg += "L'argomento della funzione è già stato dichiarato";
		} else if (code == METHOD_ARG_ALREADY_DECLARED_ERROR) {
			errMsg += "L'argomento del metodo della classe è già stato dichiarato";
		} else if (code == METHOD_VARIABLE_UNDECLARED_ERROR) {
			errMsg += "La variabile del metodo della classe non è stata dichiarata";
		} else if (code == FUNCTION_VARIABLE_UNDECLARED_ERROR) {
			errMsg += "La variabile della funzione non è stata dichiarata";
		} else if (code == FIELD_UNDECLARED_ERROR) {
			errMsg += "Il campo della classe non è stato dichiarato";
		} else if (code == TOP_VARIABLE_UNDECLARED_ERROR) {
			errMsg += "La variabile non è stata dichiarata";
		} else if (code == METHOD_UNDECLARED_ERROR) {
			errMsg += "Il metodo della classe non è stato dichiarato";
		} else if (code == FUNCTION_UNDECLARED_ERROR) {
			errMsg += "La funzione non è stata dichiarata";
		} else if (code == FUNCTION_PARAMETER_UNDECLARED_ERROR) {
			errMsg += "Il parametro passato alla funzione non è stata dichiarata";
		} else if (code == FORMAT_VARIABLE_UNDECLARED_ERROR) {
			errMsg += "La variabile passata alla format non è stata dichiarata";
		} else if (code == EMPTY_LIST_ERROR) {
			errMsg += "La lista è vuota";
		} else if (code == VARIABLE_UNDECLARED_ERROR) {
			errMsg += "Variabile non dichiarata";
		} else if (code == NOT_MATCH_TYPE_ARG_ERROR) {
			errMsg += "Tipo degli argomenti non corrispondente";
		} else if (code == NOT_MATCH_NUM_ARG_ERROR) {
			errMsg += "Numero degli argomenti non corrispondente";
		} else if (code == NOT_MATCH_TYPE_ASSIGNMENT_ERROR) {
			errMsg += "Tipo della variabile assegnata non corrispondente";
		} else if (code == ILLEGAL_EXPR_ASSIGNMENT_ERROR) {
			errMsg += "Assegnamento dell'espresione non ammesso";
		}

		errorList.add(errMsg);
	}

	/***
	 * 
	 * 
	 * @param className Nome della classe (null se si dichiara una classe o una
	 *                  funzione top-level)
	 * @param name      Nome della funzione / classe / metodo della classe
	 */
	public void declareFunCl(Token className, Token name) {

		// dichiarazione di un metodo di una classe
		if (className != null && name != null) {
			String cn = className.getText();
			String n = name.getText();
			Hashtable<String, MaltVarDescriptor> localTable = functionTables.get("cl_" + cn);

			if (localTable.containsKey("fun_" + n)) {

				// System.err.println("Il metodo " + n + " della classe " + cn + " è già stato
				// dichiarato --> riga ("
				// + name.getLine() + ")");

				maltErrorHandler(METHOD_ALREADY_DECLARED_ERROR, name);

			} else {
				MaltVarDescriptor vd = new MaltVarDescriptor(n, "function");
				localTable.put("fun_" + n, vd);

				System.out.println("è stato dichiarato un metodo " + n + " della classe " + cn + " --> riga ("
						+ name.getLine() + ")");
				functionTables.put(cn + "." + n, new Hashtable<String, MaltVarDescriptor>());
			}
		} else if (className == null && name != null) {
			// dichiarazione di una funzione top-level

			String n = name.getText();

			MaltVarDescriptor vd = new MaltVarDescriptor(n, "fun");

			if (symbolTable.containsKey("fun_" + n)) {
				// System.err.println("La funzione " + n + " è già stata dichiarata --> riga ("
				// + name.getLine() + ")");
				maltErrorHandler(FUNCTION_ALREADY_DECLARED_ERROR, name);

			} else {

				symbolTable.put("fun_" + n, vd);
				functionTables.put("fun_" + n, new Hashtable<String, MaltVarDescriptor>());

				System.out.println("è stata dichiarata la funzione " + n + " --> riga (" + name.getLine() + ")");

			}
		} else if (className != null && name == null) {
			// dichiarazione di una classe
			String cn = className.getText();

			MaltVarDescriptor vd = new MaltVarDescriptor(cn, "class");

			if (symbolTable.containsKey("cl_" + cn)) {
				// System.err
				// .println("La classe " + cn + " è già stata dichiarata --> riga (" +
				// className.getLine() + ")");
				maltErrorHandler(CLASS_ALREADY_DECLARED_ERROR, className);

			} else {

				symbolTable.put("cl_" + cn, vd);
				functionTables.put("cl_" + cn, new Hashtable<String, MaltVarDescriptor>());

				System.out.println("È stata dichiarata la classe " + cn + " --> riga (" + className.getLine() + ")");

			}
		} else {
			// System.err.println("ERRORE declareFunCl(): className e name sono entrambi
			// nulli");
			maltErrorHandler(DECLARE_FUN_CL_ERROR, className);
		}
	}

	/**
	 * 
	 * @param type Tipo della variabile
	 * @param name Nome della variabile
	 */

	public void declareInFor(Token type, Token name) {
		String t = type.getText();
		String n = name.getText();
		MaltVarDescriptor vd = new MaltVarDescriptor(n, t);

		Hashtable<String, MaltVarDescriptor> forTable = functionTables.get("for");

		if (forTable.contains(n)) {
			// System.err.println(
			// "La variabile " + n + " è già stata dichiarata nel ciclo for --> riga (" +
			// type.getLine() + ")");
			maltErrorHandler(VARIABLE_ALREADY_DECLARED_FOR_ERROR, name);
		} else {
			forTable.put(n, vd);
			System.out.println("È stata dichiarata una variabile " + n + " --> riga (" + type.getLine() + ")");
		}
	}

	public void declareVar(Token type, Token name) {
		String t = type.getText();
		String n = name.getText();
		MaltVarDescriptor vd = new MaltVarDescriptor(n, t);

		if (symbolTable.containsKey(n)) {
			// System.err.println("La variabile " + n + " è già stata dichiarata --> riga ("
			// + type.getLine() + ")");
			maltErrorHandler(VARIABLE_ALREADY_DECLARED_TOP_ERROR, name);
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
	public void declareVarInFunCl(Token className, Token functionName, Token type, Token name) {

		String t = type.getText();
		String n = name.getText();

		MaltVarDescriptor vd = new MaltVarDescriptor(n, t);

		// dichiarazione di variabile all'interno di metodi di una classe
		if (className != null && functionName != null) {

			String cn = className.getText();
			String fn = functionName.getText();

			Hashtable<String, MaltVarDescriptor> localTable = functionTables.get(cn + "." + fn);

			if (localTable.containsKey(n)) {

				// System.err.println("La variabile " + n + " nel metodo " + fn + " della classe
				// " + cn
				// + " è già stata dichiarata --> riga (" + type.getLine() + ")");

				maltErrorHandler(VARIABLE_ALREADY_DECLARED_CLASS_METHOD_ERROR, name);

			} else {

				localTable.put(n, vd);

				System.out.println("è stata dichiarata una variabile " + n + " nel metodo " + fn + " della classe " + cn
						+ " --> riga (" + type.getLine() + ")");
			}
		} else if (className == null && functionName != null) {
			// dichiarazione di variabili nelle funzioni top level
			String fn = functionName.getText();

			Hashtable<String, MaltVarDescriptor> localTable = functionTables.get("fun_" + fn);

			if (localTable.containsKey(n)) {

				// System.err.println("La variabile " + n + " della funzione " + fn + " è già
				// stata dichiarata --> riga ("
				// + type.getLine() + ")");

				maltErrorHandler(FUNCTION_VARIABLE_ALREADY_DECLARED_ERROR, name);

			} else {
				localTable.put(n, vd);

				System.out.println("è stata dichiarata una variabile " + n + " nella funzione " + fn + " --> riga ("
						+ type.getLine() + ")");
			}
		} else if (className != null && functionName == null) {
			// dichiarazione di campi di una classe
			String cn = className.getText();

			Hashtable<String, MaltVarDescriptor> localTable = functionTables.get("cl_" + cn);

			if (localTable.containsKey(n)) {

				// System.err.println("Il campo " + n + " della classe " + cn + " è già stato
				// dichiarato --> riga ("
				// + type.getLine() + ")");

				maltErrorHandler(FIELD_ALREADY_DECLARED_ERROR, name);

			} else {
				localTable.put(n, vd);

				System.out.println("È stato dichiarato un campo " + n + " nella classe " + cn + " --> riga ("
						+ type.getLine() + ")");
			}
		} else {
			// System.err.println("ERRORE declareVarInFunCl(): className e functionName sono
			// entrambi nulli");
			maltErrorHandler(DECLARE_VAR_IN_FUN_CL_ERROR, name);
		}
	}

	/**
	 * 
	 * @param id        class/fun/""/ nome della classe (per i metodi)
	 * @param nameFunCl nome della funzione/classe/metodo della classe
	 * @param type      tipo della variabile
	 * @param name      nome della variabile
	 */
	public void declareNew(Token className, Token functionName, boolean inFor, Token type, Token name) {

		if (inFor) {
			declareInFor(type, name);
		} else if (className == null && functionName == null) {
			// dichiarazione di variabili top-level (fuori da funzioni, metodi o classi)
			declareVar(type, name);
		} else {
			// dichiarazione di variabili in funzioni/classi/metodi
			declareVarInFunCl(className, functionName, type, name);
		}

	}

	public void declareArg(Token className, Token functionName, Token type, Token name) {

		String fn = functionName.getText();
		String t = type.getText();
		String n = name.getText();

		// caso delle funzioni
		if (className == null) {

			Hashtable<String, MaltVarDescriptor> localTable = functionTables.get("fun_" + fn);

			if (localTable.containsKey(n)) {
				// System.err.println("L'argomento " + n + " nella funzione " + fn + " è già
				// stato dichiarato --> riga ("
				// + type.getLine() + ")");

				maltErrorHandler(FUNCTION_ARG_ALREADY_DECLARED_ERROR, name);

			} else {
				localTable.put(n, new MaltVarDescriptor(n, t));
				symbolTable.get("fun_" + fn).addParam(n);
				System.out.println("è stato dichiarato un argomento " + n + " nella funzione " + fn + " --> riga ("
						+ type.getLine() + ")");
			}

			// caso dei metodi di una classe
		} else {
			String cn = className.getText();

			Hashtable<String, MaltVarDescriptor> classTable = functionTables.get("cl_" + cn);
			Hashtable<String, MaltVarDescriptor> localTable = functionTables.get(cn + "." + fn);

			if (localTable.containsKey(n)) {
				// System.err.println("L'argomento " + n + " nel metodo " + fn + " della classe
				// " + cn
				// + " è già stato dichiarato --> riga (" + type.getLine() + ")");
				maltErrorHandler(METHOD_ARG_ALREADY_DECLARED_ERROR, name);
			} else {
				localTable.put(n, new MaltVarDescriptor(n, t));
				classTable.get("fun_" + fn).addParam(n);
				System.out.println("è stato dichiarato un argomento " + n + " nel metodo " + fn + " della classe " + cn
						+ " --> riga (" + type.getLine() + ")");
			}

		}
	}

	public void assignVarValue(Token className, Token functionName, boolean inFor, Token name, String value) {

		String n = name.getText();
		String v = value.substring(1, value.length() - 1);

		// caso della variabile in un metodo
		if (className != null && functionName != null) {

			String cn = className.getText();
			String fn = functionName.getText();

			// localTable della funzione dove viene assegnata la variabile
			Hashtable<String, MaltVarDescriptor> localTable = functionTables.get(cn + "." + fn);
			Hashtable<String, MaltVarDescriptor> classTable = functionTables.get("cl_" + cn);

			Hashtable<String, MaltVarDescriptor> forTable = null;

			if (inFor) {
				forTable = functionTables.get("for");
			}

			if (inFor && forTable.containsKey(n)) {
				MaltVarDescriptor vd = forTable.get(n);
				vd.value = v;
				System.out.println("Alla variabile " + n + " del ciclo for del metodo " + fn + " della classe " + cn
						+ " è stato assegnato il valore " + v + " --> riga (" + name.getLine() + ")");
			} else if (localTable.containsKey(n)) {
				MaltVarDescriptor vd = localTable.get(n);
				vd.value = v;
				System.out.println("Alla variabile " + n + " del metodo " + fn + " della classe " + cn
						+ " è stato assegnato il valore " + v + " --> riga (" + name.getLine() + ")");
			} else if (classTable.containsKey(n)) {
				MaltVarDescriptor vd = classTable.get(n);
				vd.value = v;
				System.out.println("Al campo " + n + " della classe " + cn + " è stato assegnato il valore " + v
						+ " --> riga (" + name.getLine() + ")");
			} else if (symbolTable.containsKey(n)) {
				MaltVarDescriptor vd = symbolTable.get(n);
				vd.value = v;
				System.out.println("Alla variabile " + n + " è stato assegnato il valore " + v + " --> riga ("
						+ name.getLine() + ")");
			} else {
				// System.out.println("Errore assegnamento! La variabile " + n + " del metodo "
				// + fn + " della classe "
				// + cn + " non esiste!" + "--> riga (" + name.getLine() + ")");
				maltErrorHandler(METHOD_VARIABLE_UNDECLARED_ERROR, name);
			}
		} else if (className == null && functionName != null) {
			// caso delle variabili in funzioni top-level

			String fn = functionName.getText();

			// localTable della funzione dove viene assegnata la variabile
			Hashtable<String, MaltVarDescriptor> localTable = functionTables.get("fun_" + fn);

			Hashtable<String, MaltVarDescriptor> forTable = null;

			if (inFor) {
				forTable = functionTables.get("for");
			}

			if (inFor && forTable.containsKey(n)) {
				MaltVarDescriptor vd = forTable.get(n);
				vd.value = v;
				System.out.println("Alla variabile " + n + " del ciclo for della funzione " + fn
						+ " è stato assegnato il valore " + v + " --> riga (" + name.getLine() + ")");
			} else if (localTable.containsKey(n)) {
				MaltVarDescriptor vd = localTable.get(n);
				vd.value = v;
				System.out.println("Alla variabile " + n + " della funzione " + fn + " è stato assegnato il valore " + v
						+ " --> riga (" + name.getLine() + ")");
			} else if (symbolTable.containsKey(n)) {
				MaltVarDescriptor vd = symbolTable.get(n);
				vd.value = v;
				System.out.println("Alla variabile " + n + " è stato assegnato il valore " + v + " --> riga ("
						+ name.getLine() + ")");
			} else {
				// System.out.println("Errore assegnamento! La variabile " + n + " della
				// funzione " + fn + " non esiste!"
				// + "--> riga (" + name.getLine() + ")");
				maltErrorHandler(FUNCTION_VARIABLE_UNDECLARED_ERROR, name);
			}

		} else if (className != null && functionName == null) {
			// caso dei campi di una classe

			String cn = className.getText();

			// localTable della funzione dove viene assegnata la variabile
			Hashtable<String, MaltVarDescriptor> localTable = functionTables.get("cl_" + cn);

			Hashtable<String, MaltVarDescriptor> forTable = null;

			if (inFor) {
				forTable = functionTables.get("for");
			}

			if (inFor && forTable.containsKey(n)) {
				MaltVarDescriptor vd = forTable.get(n);
				vd.value = v;
				System.out.println("Alla variabile " + n + " del ciclo for della classe " + cn
						+ " è stato assegnato il valore " + v + " --> riga (" + name.getLine() + ")");
			} else if (localTable.containsKey(n)) {
				MaltVarDescriptor vd = localTable.get(n);
				vd.value = v;
				System.out.println("Al campo " + n + " della classe " + cn + " è stato assegnato il valore " + v
						+ " --> riga (" + name.getLine() + ")");
			} else if (symbolTable.containsKey(n)) {
				MaltVarDescriptor vd = symbolTable.get(n);
				vd.value = v;
				System.out.println("Alla variabile " + n + " è stato assegnato il valore " + v + " --> riga ("
						+ name.getLine() + ")");
			} else {
				// System.out.println("Errore assegnamento! Il campo " + n + " della classe " +
				// cn + " non esiste!"+ "--> riga ("
				// + name.getLine() + ")");
				maltErrorHandler(CLASS_ALREADY_DECLARED_ERROR, name);
			}

		} else {
			Hashtable<String, MaltVarDescriptor> forTable = null;

			if (inFor) {
				forTable = functionTables.get("for");
			}

			if (inFor && forTable.containsKey(n)) {
				MaltVarDescriptor vd = forTable.get(n);
				vd.value = v;
				System.out.println("Alla variabile del ciclo for " + n + " è stato assegnato il valore " + v
						+ " --> riga (" + name.getLine() + ")");

			} else if (symbolTable.containsKey(n)) {
				MaltVarDescriptor vd = symbolTable.get(n);
				vd.value = v;
				System.out.println("Alla variabile " + n + " è stato assegnato il valore " + v + " --> riga ("
						+ name.getLine() + ")");
			} else {
				// System.out.println("Errore assegnamento! La variabile " + n + " non esiste!"
				// + "--> riga ("
				// + name.getLine() + ")");
				maltErrorHandler(TOP_VARIABLE_UNDECLARED_ERROR, name);
			}
		}

	}

	public void assignListValue(Token className, Token functionName, boolean inFor, Token name, Vector<Token> value) {

		String n = name.getText();

		String[] listValue = new String[value.size()];

		for (int i = 0; i < value.size(); i++) {
			if (value.get(i).getText().contains("\"")) {
				listValue[i] = value.get(i).getText();
			} else {

				MaltVarDescriptor resVd = getVarDescriptor(className, functionName, inFor, value.get(i));

				if (resVd == null) {
					maltErrorHandler(VARIABLE_UNDECLARED_ERROR, value.get(i));
					return;
				}

				listValue[i] = resVd.value;
			}
		}

		// caso della variabile in un metodo
		if (className != null && functionName != null) {

			String cn = className.getText();
			String fn = functionName.getText();

			// localTable della funzione dove viene assegnata la variabile
			Hashtable<String, MaltVarDescriptor> localTable = functionTables.get(cn + "." + fn);
			Hashtable<String, MaltVarDescriptor> classTable = functionTables.get("cl_" + cn);

			Hashtable<String, MaltVarDescriptor> forTable = null;

			if (inFor) {
				forTable = functionTables.get("for");
			}

			if (inFor && forTable.containsKey(n)) {
				MaltVarDescriptor vd = forTable.get(n);
				vd.listValue = listValue;
				System.out.println("Alla variabile " + n + " del ciclo for del metodo " + fn + " della classe " + cn
						+ " è stata assegnata una lista --> riga (" + name.getLine() + ")");
			} else if (localTable.containsKey(n)) {
				MaltVarDescriptor vd = localTable.get(n);
				vd.listValue = listValue;
				System.out.println("Alla variabile " + n + " del metodo " + fn + " della classe " + cn
						+ " è stata assegnata una lista --> riga (" + name.getLine() + ")");
			} else if (classTable.containsKey(n)) {
				MaltVarDescriptor vd = classTable.get(n);
				vd.listValue = listValue;
				System.out.println("Al campo " + n + " della classe " + cn + " è stata assegnata una lista --> riga ("
						+ name.getLine() + ")");
			} else if (symbolTable.containsKey(n)) {
				MaltVarDescriptor vd = symbolTable.get(n);
				vd.listValue = listValue;
				System.out.println(
						"Alla variabile " + n + " è stata assegnata una lista --> riga (" + name.getLine() + ")");
			} else {
				// System.out.println("Errore assegnamento! La variabile " + n + " del metodo "
				// + fn + " della classe "
				// + cn + " non esiste!" + "--> riga (" + name.getLine() + ")");
				maltErrorHandler(METHOD_VARIABLE_UNDECLARED_ERROR, name);
			}
		} else if (className == null && functionName != null) {
			// caso delle variabili in funzioni top-level

			String fn = functionName.getText();

			// localTable della funzione dove viene assegnata la variabile
			Hashtable<String, MaltVarDescriptor> localTable = functionTables.get("fun_" + fn);

			Hashtable<String, MaltVarDescriptor> forTable = null;

			if (inFor) {
				forTable = functionTables.get("for");
			}

			if (inFor && forTable.containsKey(n)) {
				MaltVarDescriptor vd = forTable.get(n);
				vd.listValue = listValue;
				System.out.println("Alla variabile " + n + " del ciclo for della funzione " + fn
						+ " è stata assegnata una lista --> riga (" + name.getLine() + ")");
			} else if (localTable.containsKey(n)) {
				MaltVarDescriptor vd = localTable.get(n);
				vd.listValue = listValue;
				System.out.println("Alla variabile " + n + " della funzione " + fn
						+ " è stata assegnata una lista --> riga (" + name.getLine() + ")");
			} else if (symbolTable.containsKey(n)) {
				MaltVarDescriptor vd = symbolTable.get(n);
				vd.listValue = listValue;
				System.out.println(
						"Alla variabile " + n + " è stata assegnata una lista --> riga (" + name.getLine() + ")");
			} else {
				// System.out.println("Errore assegnamento! La variabile " + n + " della
				// funzione " + fn + " non esiste!"
				// + "--> riga (" + name.getLine() + ")");
				maltErrorHandler(FUNCTION_VARIABLE_UNDECLARED_ERROR, name);
			}

		} else if (className != null && functionName == null) {
			// caso dei campi di una classe

			String cn = className.getText();

			// localTable della funzione dove viene assegnata la variabile
			Hashtable<String, MaltVarDescriptor> localTable = functionTables.get("cl_" + cn);

			Hashtable<String, MaltVarDescriptor> forTable = null;

			if (inFor) {
				forTable = functionTables.get("for");
			}

			if (inFor && forTable.containsKey(n)) {
				MaltVarDescriptor vd = forTable.get(n);
				vd.listValue = listValue;
				System.out.println("Alla variabile " + n + " del ciclo for della classe " + cn
						+ " è stata assegnata una lista --> riga (" + name.getLine() + ")");
			} else if (localTable.containsKey(n)) {
				MaltVarDescriptor vd = localTable.get(n);
				vd.listValue = listValue;
				System.out.println("Al campo " + n + " della classe " + cn + " è stata assegnata una lista --> riga ("
						+ name.getLine() + ")");
			} else if (symbolTable.containsKey(n)) {
				MaltVarDescriptor vd = symbolTable.get(n);
				vd.listValue = listValue;
				System.out.println(
						"Alla variabile " + n + " è stata assegnata una lista --> riga (" + name.getLine() + ")");
			} else {
				// System.out.println("Errore assegnamento! Il campo " + n + " della classe " +
				// cn + " non esiste!"
				// + "--> riga (" + name.getLine() + ")");
				maltErrorHandler(FIELD_UNDECLARED_ERROR, name);
			}

		} else {
			Hashtable<String, MaltVarDescriptor> forTable = null;

			if (inFor) {
				forTable = functionTables.get("for");
			}

			if (inFor && forTable.containsKey(n)) {
				MaltVarDescriptor vd = forTable.get(n);
				vd.listValue = listValue;
				System.out.println("Alla variabile del ciclo for " + n + " è stata assegnata una lista --> riga ("
						+ name.getLine() + ")");

			} else if (symbolTable.containsKey(n)) {
				MaltVarDescriptor vd = symbolTable.get(n);
				vd.listValue = listValue;
				System.out.println(
						"Alla variabile " + n + " è stata assegnata una lista --> riga (" + name.getLine() + ")");
			} else {
				// System.out.println("Errore assegnamento! La variabile " + n + " non esiste!"
				// + "--> riga ("
				// + name.getLine() + ")");
				maltErrorHandler(TOP_VARIABLE_UNDECLARED_ERROR, name);
			}
		}
	}

	public boolean checkType(MaltVarDescriptor vd1, MaltVarDescriptor vd2) {
		if (vd1.varType.equals(vd2.varType)) {
			return true;
		}
		return false;
	}

	public void assignVarToVar(Token className, Token functionName, boolean inFor, boolean isValueFromFunction,
			Token var1, Token var2) {

		String value = "\"";

		MaltVarDescriptor leftVar = getVarDescriptor(className, functionName, inFor, var1);
		MaltVarDescriptor rightVar;

		if (isValueFromFunction) {
			rightVar = getFunctionVarDescriptor(className, var2);
		} else {
			rightVar = getVarDescriptor(className, functionName, inFor, var2);
		}

		if (leftVar == null) {
			// System.err.println("La variabile " + var1.getText() + " non è stata
			// trovata!");
			if (className != null) {
				maltErrorHandler(FIELD_UNDECLARED_ERROR, var1);
			} else {
				maltErrorHandler(TOP_VARIABLE_UNDECLARED_ERROR, var1);
			}

			return;
		}

		if (rightVar == null && isValueFromFunction) {
			// System.err.println("La variabile " + var2.getText() + " non è stata
			// trovata!");
			// maltErrorHandler(FUNCTION_UNDECLARED_ERROR, var2);
			return;
		}

		if (rightVar == null && !isValueFromFunction) {
			if (className != null) {
				maltErrorHandler(FIELD_UNDECLARED_ERROR, var2);
			} else {
				maltErrorHandler(TOP_VARIABLE_UNDECLARED_ERROR, var2);
			}
			return;
		}

		if (!checkType(leftVar, rightVar) && !isValueFromFunction) {
			// System.out.println("Assegnamento di variabile ad altra variabile non
			// corretto! Incompatibilità tra tipi!");
			maltErrorHandler(NOT_MATCH_TYPE_ASSIGNMENT_ERROR, var2);
			return;
		}

		value += rightVar.value + "\"";

		assignVarValue(className, functionName, inFor, var1, value);
	}

	public void assignExprToVar(Token className, Token functionName, boolean inFor, Token name, Vector<Token> exps) {

		MaltVarDescriptor nameVd = getVarDescriptor(className, functionName, inFor, name);
		String nameType = nameVd.varType;

		// posso assegnare un'espressione solo a tipi string
		String[] allowedTypes = { "title", "s1title", "s2title", "s3title", "s4title", "s5title", "text", "blockquote",
				"codeblock" };

		if (!Arrays.asList(allowedTypes).contains(nameType)) {
			maltErrorHandler(ILLEGAL_EXPR_ASSIGNMENT_ERROR, name);
			return;
		}

		if (exps.size() == 1) {
			assignVarToVar(className, functionName, inFor, false, name, exps.get(0));
		}

		String[] listValue = new String[exps.size()];

		for (int i = 0; i < exps.size(); i++) {
			String var = exps.get(i).getText();
			if (var.contains("\"")) {
				listValue[i] = var.substring(1, var.length() - 1);
			} else {
				MaltVarDescriptor resVd = getVarDescriptor(className, functionName, inFor, exps.get(i));

				if (resVd == null) {
					maltErrorHandler(VARIABLE_UNDECLARED_ERROR, exps.get(i));
					return;
				}

				if (checkType(nameVd, resVd)) {
					listValue[i] = resVd.value;
				} else {
					maltErrorHandler(NOT_MATCH_TYPE_ASSIGNMENT_ERROR, exps.get(i));
					return;
				}

			}
		}

		String concString = "\"";

		for (String str : listValue) {
			concString += str;
		}

		concString += "\"";

		assignVarValue(className, functionName, inFor, name, concString);

	}

	public void functionCall(Token className, Token functionName, Token functionToCall, Vector<Token> args) {

		if (functionToCall == null) {
			// System.out.println("ERRORE functionCall(): functionToCall è nullo!");
			maltErrorHandler(FUNCTION_CALL_ERROR, functionToCall);
			return;
		}

		String funcToCall = functionToCall.getText();

		String[] splitted = funcToCall.split("\\.");
		// System.out.println(Arrays.toString(splitted));

		Vector<String> argStrings = new Vector<String>();

		for (Token el : args) {
			// System.out.println(el.getText());
			argStrings.add(el.getText());
		}

		// vettore di VarDescriptor degli argomenti della chiamata
		Vector<MaltVarDescriptor> argsVd = new Vector<MaltVarDescriptor>();

		if (className != null && functionName != null) {
			String cn = className.getText();
			String fn = functionName.getText();

			Hashtable<String, MaltVarDescriptor> classTable = functionTables.get("cl_" + cn);
			Hashtable<String, MaltVarDescriptor> localTable = functionTables.get(cn + "." + fn);

			Hashtable<String, MaltVarDescriptor> funcToCallTable = new Hashtable<String, MaltVarDescriptor>();
			MaltVarDescriptor functionToCallVarDescriptor = new MaltVarDescriptor("", "");

			// tabella della funzione da chiamare
			// con this cerco la funzione solo dentro la classe
			if (splitted[0].equals("this") && splitted.length == 2) {
				// System.out.println("LOCAL METHOD");
				String key = cn + "." + splitted[1];

				if (functionTables.containsKey(key)) {
					funcToCallTable = functionTables.get(key);
					functionToCallVarDescriptor = classTable.get("fun_" + splitted[1]);
				} else {
					// System.out.println("Il metodo " + splitted[1] + " non esiste!");
					maltErrorHandler(METHOD_UNDECLARED_ERROR, functionToCall);
					return;
				}
				// System.out.println("key=" + key);
			} else if (splitted.length == 2) {
				String key = splitted[0] + "." + splitted[1];
				if (functionTables.containsKey(key)) {
					funcToCallTable = functionTables.get(key);
					functionToCallVarDescriptor = classTable.get("fun_" + splitted[1]);
				} else {
					// System.out.println("Il metodo " + splitted[1] + " non esiste!");
					maltErrorHandler(METHOD_UNDECLARED_ERROR, functionToCall);
					return;
				}
			} else {

				if (functionTables.containsKey("fun_" + funcToCall)) {
					funcToCallTable = functionTables.get("fun_" + funcToCall);
					functionToCallVarDescriptor = symbolTable.get("fun_" + funcToCall);
				} else {
					// System.out.println("La funzione " + funcToCall + " da chiamare non esiste!");
					maltErrorHandler(FUNCTION_UNDECLARED_ERROR, functionToCall);
					return;
				}
				// senza this cerco la funzione a livello globale

			}

			int numParams = functionToCallVarDescriptor.getNumParams();
			Vector<String> params = functionToCallVarDescriptor.getParams();

			// System.out.println("N parametri: " + numParams);

			// controllo se il numero degli argomenti della chiamata è uguale al numero dei
			// parametri della funzione
			if (args.size() == numParams) {
				int i = 0;

				// recupero i valori delle variabili nella chiamata
				for (int j = 0; j < args.size(); j++) {
					String argName = args.get(j).getText();

					if (localTable.containsKey(argName)) {
						MaltVarDescriptor vd = localTable.get(argName);
						argStrings.set(j, vd.value);
						argsVd.add(vd);
					} else if (!localTable.containsKey(argName) && classTable.containsKey(argName)) {
						MaltVarDescriptor vd = classTable.get(argName);
						argStrings.set(j, vd.value);
						argsVd.add(vd);
					} else if (symbolTable.containsKey(argName) && !localTable.containsKey(argName)
							&& !classTable.containsKey(argName)) {
						MaltVarDescriptor vd = symbolTable.get(argName);
						argStrings.set(j, vd.value);
						argsVd.add(vd);
					} else {
						// System.out.println("Il parametro " + argName + " passato nella chiamata di
						// funzione non esiste!");
						maltErrorHandler(FUNCTION_PARAMETER_UNDECLARED_ERROR, args.get(j));
						return;
					}
				}

				// stampa del valore degli argomenti nella chiamata
				// for (String value : argStrings) {
				// System.out.println(value);
				// }

				// per ogni argomento controlla se il tipo corrisponde con quello del parametro
				// corrispondente e in caso positivo assegna il valore
				for (MaltVarDescriptor vdInput : argsVd) {
					String paramName = params.get(i);

					// VarDescriptor del parametro della funzione
					MaltVarDescriptor vdParam = funcToCallTable.get(paramName);

					if (!vdInput.varType.equals(vdParam.varType)) {
						// System.out.println(
						// "Il tipo dell'argomento non corrisponde al tipo del parametro della
						// funzione!");
						maltErrorHandler(NOT_MATCH_TYPE_ARG_ERROR, args.get(i));
						return;
					} else {
						vdParam.value = vdInput.value;
						funcToCallTable.put(vdParam.varName, vdParam);
					}
					i++;
				}

			} else {
				// System.out.println("Il numero degli argomenti non corrisponde al numero dei
				// parametri della funzione");
				maltErrorHandler(NOT_MATCH_NUM_ARG_ERROR, functionToCall);
			}
		} else if (className == null && functionName != null) {

			String fn = functionName.getText();

			// tabella della funzione da chiamare
			Hashtable<String, MaltVarDescriptor> funcToCallTable = new Hashtable<String, MaltVarDescriptor>();

			// VarDescriptor della funzione da chiamare
			MaltVarDescriptor functionToCallVarDescriptor = new MaltVarDescriptor("", "");

			Hashtable<String, MaltVarDescriptor> localTable = functionTables.get("fun_" + fn);

			if (splitted.length == 2) {
				String key = splitted[0] + "." + splitted[1];
				if (functionTables.containsKey(key)) {
					funcToCallTable = functionTables.get(key);
					functionToCallVarDescriptor = functionTables.get("cl_" + splitted[0]).get("fun_" + splitted[1]);
				} else {
					// System.out.println("Il metodo " + splitted[1] + " non esiste!");
					maltErrorHandler(METHOD_UNDECLARED_ERROR, functionToCall);
					return;
				}
			} else {
				if (functionTables.containsKey("fun_" + funcToCall)) {
					funcToCallTable = functionTables.get("fun_" + funcToCall);
					functionToCallVarDescriptor = symbolTable.get("fun_" + funcToCall);
				} else {
					// System.out.println("La funzione " + funcToCall + " non esiste!");
					maltErrorHandler(FUNCTION_UNDECLARED_ERROR, functionToCall);
					return;
				}
			}

			int numParams = functionToCallVarDescriptor.getNumParams();
			Vector<String> params = functionToCallVarDescriptor.getParams();

			// System.out.println("N parametri: " + numParams);

			// controllo se il numero degli argomenti della chiamata è uguale al numero dei
			// parametri della funzione
			if (args.size() == numParams) {
				int i = 0;

				// recupero i valori delle variabili nella chiamata
				for (int j = 0; j < args.size(); j++) {
					String argName = argStrings.get(j);

					if (localTable.containsKey(argName)) {
						MaltVarDescriptor vd = localTable.get(argName);
						argStrings.set(j, vd.value);
						argsVd.add(vd);
					} else if (symbolTable.containsKey(argName) && !localTable.containsKey(argName)) {
						MaltVarDescriptor vd = symbolTable.get(argName);
						argStrings.set(j, vd.value);
						argsVd.add(vd);
					} else {
						// System.out.println("Il parametro " + argName + " passato nella chiamata di
						// funzione non esiste!");
						maltErrorHandler(FUNCTION_PARAMETER_UNDECLARED_ERROR, args.get(j));
						return;
					}
				}

				// stampa del valore degli argomenti nella chiamata
				for (String value : argStrings) {
					System.out.println(value);
				}

				// per ogni argomento controlla se il tipo corrisponde con quello del parametro
				// corrispondente e in caso positivo assegna il valore
				for (MaltVarDescriptor vdInput : argsVd) {
					String paramName = params.get(i);

					// VarDescriptor del parametro della funzione
					MaltVarDescriptor vdParam = funcToCallTable.get(paramName);

					if (!vdInput.varType.equals(vdParam.varType)) {
						// System.out.println(
						// "Il tipo dell'argomento non corrisponde al tipo del parametro della
						// funzione!");
						maltErrorHandler(NOT_MATCH_TYPE_ARG_ERROR, args.get(i));
						return;
					} else {
						vdParam.value = vdInput.value;
						funcToCallTable.put(vdParam.varName, vdParam);
					}
					i++;
				}

			} else {
				// System.out.println("Il numero degli argomenti non corrisponde al numero dei
				// parametri della funzione");
				maltErrorHandler(NOT_MATCH_NUM_ARG_ERROR, functionToCall);
			}

		} else if (className != null && functionName == null) {

			String cn = className.getText();

			Hashtable<String, MaltVarDescriptor> funcToCallTable = new Hashtable<String, MaltVarDescriptor>();

			// VarDescriptor della funzione da chiamare
			MaltVarDescriptor functionToCallVarDescriptor = new MaltVarDescriptor("", "");

			Hashtable<String, MaltVarDescriptor> localTable = functionTables.get("cl_" + cn);

			// tabella della funzione da chiamare
			// con this cerco la funzione solo dentro la classe
			if (splitted[0].equals("this") && splitted.length == 2) {
				// System.out.println("LOCAL METHOD");
				String key = cn + "." + splitted[1];

				if (functionTables.containsKey(key)) {
					funcToCallTable = functionTables.get(key);
					functionToCallVarDescriptor = localTable.get("fun_" + splitted[1]);
				} else {
					// System.out.println("Il metodo " + splitted[1] + " non esiste!");
					maltErrorHandler(METHOD_UNDECLARED_ERROR, functionToCall);
					return;
				}

				// System.out.println("key=" + key);

			} else if (splitted.length == 2) {
				String key = splitted[0] + "." + splitted[1];
				if (functionTables.containsKey(key)) {
					funcToCallTable = functionTables.get(key);
					functionToCallVarDescriptor = functionTables.get("cl_" + splitted[0]).get("fun_" + splitted[1]);
				} else {
					// System.out.println("Il metodo " + splitted[1] + " non esiste!");
					maltErrorHandler(METHOD_UNDECLARED_ERROR, functionToCall);
					return;
				}
			} else {

				if (functionTables.containsKey("fun_" + funcToCall)) {
					funcToCallTable = functionTables.get("fun_" + funcToCall);
					functionToCallVarDescriptor = symbolTable.get("fun_" + funcToCall);
				} else {
					// System.out.println("La funzione " + funcToCall + " da chiamare non esiste!");
					maltErrorHandler(FUNCTION_UNDECLARED_ERROR, functionToCall);
					return;
				}
				// senza this cerco la funzione a livello globale

			}

			int numParams = functionToCallVarDescriptor.getNumParams();
			Vector<String> params = functionToCallVarDescriptor.getParams();

			// System.out.println("N parametri: " + numParams);

			// controllo se il numero degli argomenti della chiamata è uguale al numero dei
			// parametri della funzione
			if (args.size() == numParams) {
				int i = 0;

				// recupero i valori delle variabili nella chiamata
				for (int j = 0; j < args.size(); j++) {
					String argName = argStrings.get(j);

					if (localTable.containsKey(argName)) {
						MaltVarDescriptor vd = localTable.get(argName);
						argStrings.set(j, vd.value);
						argsVd.add(vd);
					} else if (symbolTable.containsKey(argName) && !localTable.containsKey(argName)) {
						MaltVarDescriptor vd = symbolTable.get(argName);
						argStrings.set(j, vd.value);
						argsVd.add(vd);
					} else {
						// System.out.println("Il parametro " + argName + " passato nella chiamata di
						// funzione non esiste!");
						maltErrorHandler(FUNCTION_PARAMETER_UNDECLARED_ERROR, args.get(j));
						return;
					}
				}

				// stampa del valore degli argomenti nella chiamata
				for (String value : argStrings) {
					System.out.println(value);
				}

				// per ogni argomento controlla se il tipo corrisponde con quello del parametro
				// corrispondente e in caso positivo assegna il valore
				for (MaltVarDescriptor vdInput : argsVd) {
					String paramName = params.get(i);

					// VarDescriptor del parametro della funzione
					MaltVarDescriptor vdParam = funcToCallTable.get(paramName);

					if (!vdInput.varType.equals(vdParam.varType)) {
						// System.out.println(
						// "Il tipo dell'argomento non corrisponde al tipo del parametro della
						// funzione!");
						maltErrorHandler(NOT_MATCH_TYPE_ARG_ERROR, args.get(i));
						return;
					} else {
						vdParam.value = vdInput.value;
						funcToCallTable.put(vdParam.varName, vdParam);
					}
					i++;
				}

			} else {
				// System.out.println("Il numero degli argomenti non corrisponde al numero dei
				// parametri della funzione");
				maltErrorHandler(NOT_MATCH_NUM_ARG_ERROR, functionToCall);
			}

		} else {

			// tabella della funzione
			Hashtable<String, MaltVarDescriptor> funcToCallTable = functionTables.get("fun_" + funcToCall);

			// VarDescriptor della funzione
			MaltVarDescriptor functionToCallVarDescriptor = symbolTable.get("fun_" + funcToCall);

			if (splitted.length == 2) {
				String key = splitted[0] + "." + splitted[1];
				if (functionTables.containsKey(key)) {
					funcToCallTable = functionTables.get(key);
					functionToCallVarDescriptor = functionTables.get("cl_" + splitted[0]).get("fun_" + splitted[1]);
				} else {
					// System.out.println("Il metodo " + splitted[1] + " non esiste!");
					maltErrorHandler(METHOD_UNDECLARED_ERROR, functionToCall);
					return;
				}
			} else {
				if (functionTables.containsKey("fun_" + funcToCall)) {
					funcToCallTable = functionTables.get("fun_" + funcToCall);
					functionToCallVarDescriptor = symbolTable.get("fun_" + funcToCall);
				} else {
					// System.out.println("La funzione " + funcToCall + " non esiste!");
					maltErrorHandler(FUNCTION_UNDECLARED_ERROR, functionToCall);
					return;
				}
			}

			int numParams = functionToCallVarDescriptor.getNumParams();
			Vector<String> params = functionToCallVarDescriptor.getParams();

			System.out.println("N parametri: " + numParams);

			// controllo se il numero degli argomenti della chiamata è uguale al numero dei
			// parametri della funzione
			if (args.size() == numParams) {
				int i = 0;

				// recupero i valori delle variabili nella chiamata
				for (int j = 0; j < args.size(); j++) {
					String argName = argStrings.get(j);

					if (symbolTable.containsKey(argName)) {
						MaltVarDescriptor vd = symbolTable.get(argName);
						argStrings.set(j, vd.value);
						argsVd.add(vd);
					} else {
						// System.out.println("Il parametro " + argName + " passato nella chiamata di
						// funzione non esiste!");
						maltErrorHandler(FUNCTION_PARAMETER_UNDECLARED_ERROR, args.get(j));
						return;
					}
				}

				// stampa del valore degli argomenti nella chiamata
				for (String value : argStrings) {
					System.out.println(value);
				}

				// per ogni argomento controlla se il tipo corrisponde con quello del parametro
				// corrispondente e in caso positivo assegna il valore
				for (MaltVarDescriptor vdInput : argsVd) {
					String paramName = params.get(i);

					// VarDescriptor del parametro della funzione
					MaltVarDescriptor vdParam = funcToCallTable.get(paramName);

					if (!vdInput.varType.equals(vdParam.varType)) {
						// System.out.println(
						// "Il tipo dell'argomento non corrisponde al tipo del parametro della
						// funzione!");
						maltErrorHandler(NOT_MATCH_TYPE_ARG_ERROR, args.get(i));
						return;

					} else {
						vdParam.value = vdInput.value;
						funcToCallTable.put(vdParam.varName, vdParam);
					}
					i++;
				}

			} else {
				// System.out.println("Il numero degli argomenti non corrisponde al numero dei
				// parametri della funzione");
				maltErrorHandler(NOT_MATCH_NUM_ARG_ERROR, functionToCall);
			}

		}
	}

	public void handleReturn(Token className, Token functionName, Token returnToken) {

		String returnStr = returnToken.getText();

		String returnValue = "";

		// recupero il valore che viene ritornato
		if (returnStr.contains("\"")) {
			// se ritorno un letterale
			returnValue = returnStr.substring(1, returnStr.length() - 1);
		} else {
			// se ritorno una variabile
			// recupero il valore della variabile
			MaltVarDescriptor returnVd = getVarDescriptor(className, functionName, false, returnToken);

			if (returnVd == null) {
				maltErrorHandler(VARIABLE_UNDECLARED_ERROR, returnToken);
				return;
			}

			returnValue = returnVd.value;
		}

		// cerco la funzione alla quale assegnare il valore di return
		MaltVarDescriptor functionVd = getFunctionVarDescriptor(className, functionName);

		// non serve perché non può mancare la tabella della funzione dalla quale sto
		// eseguendo un return

		// if (functionVd == null) {

		// if (className != null) {
		// maltErrorHandler(METHOD_UNDECLARED_ERROR, functionName);
		// } else {
		// maltErrorHandler(FUNCTION_UNDECLARED_ERROR, functionName);
		// }
		// return;
		// }

		functionVd.value = returnValue;
	}

	public MaltVarDescriptor getVarDescriptor(Token className, Token functionName, boolean inFor, Token name) {
		String n = name.getText();

		Hashtable<String, MaltVarDescriptor> forTable = null;

		if (inFor) {
			forTable = functionTables.get("for");
		}

		if (className != null && functionName != null) {
			String cn = className.getText();
			String fn = functionName.getText();

			Hashtable<String, MaltVarDescriptor> localTable = functionTables.get(cn + "." + fn);
			Hashtable<String, MaltVarDescriptor> classTable = functionTables.get("cl_" + cn);

			if (forTable != null && forTable.containsKey(n)) {
				return forTable.get(n);
			} else if (localTable.containsKey(n)) {
				return localTable.get(n);
			} else if (classTable.containsKey(n)) {
				return classTable.get(n);
			} else if (symbolTable.containsKey(n)) {
				return symbolTable.get(n);
			} else {
				return null;
			}

		} else if (className == null && functionName != null) {
			String fn = functionName.getText();
			Hashtable<String, MaltVarDescriptor> localTable = functionTables.get("fun_" + fn);

			if (forTable != null && forTable.containsKey(n)) {
				return forTable.get(n);
			} else if (localTable.containsKey(n)) {
				return localTable.get(n);
			} else if (symbolTable.containsKey(n)) {
				return symbolTable.get(n);
			} else {
				return null;
			}

		} else if (className != null && functionName == null) {
			String cn = className.getText();

			Hashtable<String, MaltVarDescriptor> localTable = functionTables.get("cl_" + cn);

			if (forTable != null && forTable.containsKey(n)) {
				return forTable.get(n);
			} else if (localTable.containsKey(n)) {
				return localTable.get(n);
			} else if (symbolTable.containsKey(n)) {
				return symbolTable.get(n);
			} else {
				return null;
			}

		} else {

			if (forTable != null && forTable.containsKey(n)) {
				return forTable.get(n);
			} else if (symbolTable.containsKey(n)) {
				return symbolTable.get(n);
			} else {
				return null;
			}
		}

	}

	public MaltVarDescriptor getFunctionVarDescriptor(Token className, Token functionName) {

		String fn = functionName.getText();

		MaltVarDescriptor functionVd;

		if (className != null) {

			String cn = className.getText();

			Hashtable<String, MaltVarDescriptor> classTable = functionTables.get("cl_" + cn);

			if (classTable.containsKey("fun_" + fn)) {
				functionVd = classTable.get("fun_" + fn);
			} else if (symbolTable.containsKey("fun_" + fn)) {
				functionVd = symbolTable.get("fun_" + fn);
			} else {
				return null;
			}

		} else {

			if (symbolTable.containsKey("fun_" + fn)) {
				functionVd = symbolTable.get("fun_" + fn);
			} else {
				return null;
			}
		}

		return functionVd;
	}

	public void handleFormat(Token className, Token functionName, boolean inFor, Token resultVar, Token formatText,
			Vector<Token> vars) {

		MaltVarDescriptor ftVd = getVarDescriptor(className, functionName, inFor, formatText);

		if (ftVd == null) {
			maltErrorHandler(VARIABLE_UNDECLARED_ERROR, formatText);
			return;
		}

		String ft = ftVd.value;
		Vector<String> matches = new Vector<String>();
		Vector<String> values = new Vector<String>();

		// ft = "un \\%ib albero %b verde";

		String regex = "(?<!\\\\)%(ib|i|b|t)";
		Pattern pt = Pattern.compile(regex);
		Matcher matcher = pt.matcher(ft);

		while (matcher.find()) {
			matches.add(matcher.group());
		}

		String[] splitted = ft.split(regex);

		System.out.println(Arrays.toString(splitted));

		for (String el : matches) {
			System.out.println(el);
		}

		for (Token var : vars) {
			MaltVarDescriptor vd = getVarDescriptor(className, functionName, inFor, var);

			if (vd == null) {
				maltErrorHandler(VARIABLE_UNDECLARED_ERROR, var);
				return;
			}
			String value = vd.value;
			System.out.println("Var value: " + value);
			values.add(value);
		}

		String resultStr = "\"";

		for (int i = 0; i < splitted.length - 1; i++) {

			String symbol = matches.get(i);
			String markdownFormat = "";

			if (symbol.equals("%i")) {
				markdownFormat = "*";
			} else if (symbol.equals("%b")) {
				markdownFormat = "**";
			} else if (symbol.equals("%ib")) {
				markdownFormat = "***";
			}

			resultStr += splitted[i];

			resultStr += markdownFormat;
			resultStr += values.get(i);
			resultStr += markdownFormat;
		}

		resultStr += splitted[splitted.length - 1] + "\"";

		assignVarValue(className, functionName, inFor, resultVar, resultStr);

	}

	public void declareFor(Token className, Token functionName, boolean isIncr, Token name, Token it) {

		Hashtable<String, MaltVarDescriptor> forTable = null;
		if (functionTables.containsKey("for")) {
			functionTables.get("for").clear();
		} else {
			functionTables.put("for", new Hashtable<String, MaltVarDescriptor>());
		}

		forTable = functionTables.get("for");

		if (isIncr) {
			// iterazione tramite counter
			MaltVarDescriptor vd = new MaltVarDescriptor(name.getText(), "int");
			vd.value = "0";

			MaltVarDescriptor vdMax = new MaltVarDescriptor("for", "int");
			vdMax.value = it.getText();

			forTable.put(name.getText(), vd);
			forTable.put("for", vdMax);

		} else {
			// iterazione di un for sulle liste
			MaltVarDescriptor vdIt = getVarDescriptor(className, functionName, true, it);

			if (vdIt == null) {
				maltErrorHandler(VARIABLE_UNDECLARED_ERROR, it);
				return;
			}

			String[] values = vdIt.listValue;

			int length = vdIt.listValue.length;

			if (length <= 0) {
				System.err.println("Impossibile iterare una lista vuota --> riga (" + it.getLine() + ")");
				return;
			}

			MaltVarDescriptor vd = new MaltVarDescriptor(name.getText(), "text");
			vd.value = values[0];

			forTable.put(name.getText(), vd);

		}
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