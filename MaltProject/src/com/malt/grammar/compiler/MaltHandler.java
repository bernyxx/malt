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

import com.malt.grammar.compiler.util.VarDescriptor;

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
	public static int ITERATE_EMPTY_LIST_ERROR = 24;
	public static int VARIABLE_UNDECLARED_ERROR = 25;
	public static int NOT_MATCH_TYPE_ARG_ERROR = 26;
	public static int NOT_MATCH_NUM_ARG_ERROR = 27;
	public static int NOT_MATCH_TYPE_ASSIGNMENT_ERROR = 28;
	public static int ILLEGAL_EXPR_ASSIGNMENT_ERROR = 29;
	public static int NOT_LIST_INDEXING_ERROR = 30;
	public static int OUT_OF_BOUND_ERROR = 31;
	public static int NOT_PRIMITIVE_TEXT_VARIABLE_IN_LIST_ERROR = 32;
	public static int NOT_PRIMITIVE_VARIABLE_ASSIGNMENT_ERROR = 33;
	public static int NOT_PRIMITIVE_VARIABLE_IN_FORMAT_ERROR = 34;
	public static int NOT_MATCH_NUM_VARS_FORMAT_ERROR = 35;
	public static int VOID_FUNCTION_ASSIGNMENT_ERROR = 36;
	public static int TABLE_ROW_SIZE_ERROR = 37;
	public static int NOT_LIST_MANIPULATION_ERROR = 38;

	TokenStream input;
	List<String> errorList;
	public Hashtable<String, VarDescriptor> globalTable;
	public Hashtable<String, Hashtable<String, VarDescriptor>> localTables;

	public MaltHandler(TokenStream input) {
		this.input = input;
		this.globalTable = new Hashtable<String, VarDescriptor>();
		this.localTables = new Hashtable<String, Hashtable<String, VarDescriptor>>();
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
			errMsg += "Il parametro passato alla funzione non è stata dichiarato";
		} else if (code == FORMAT_VARIABLE_UNDECLARED_ERROR) {
			errMsg += "La variabile passata alla format non è stata dichiarata";
		} else if (code == EMPTY_LIST_ERROR) {
			errMsg += "La lista è vuota";
		} else if (code == ITERATE_EMPTY_LIST_ERROR) {
			errMsg += "Impossibile iterare una lista vuota";
		} else if (code == VARIABLE_UNDECLARED_ERROR) {
			errMsg += "La variabile non è stata dichiarata";
		} else if (code == NOT_MATCH_TYPE_ARG_ERROR) {
			errMsg += "Tipo degli argomenti non corrispondente";
		} else if (code == NOT_MATCH_NUM_ARG_ERROR) {
			errMsg += "Numero degli argomenti non corrispondente";
		} else if (code == NOT_MATCH_TYPE_ASSIGNMENT_ERROR) {
			errMsg += "Tipo della variabile assegnata non corrispondente";
		} else if (code == ILLEGAL_EXPR_ASSIGNMENT_ERROR) {
			errMsg += "Assegnamento dell'espresione non ammesso";
		} else if (code == NOT_LIST_INDEXING_ERROR) {
			errMsg += "Impossibile usare la notazione [], la variabile non è di tipo list";
		} else if (code == OUT_OF_BOUND_ERROR) {
			errMsg += "Impossibile accedere ad un elemento di una lista che non le appartiene. idx >= length";
		} else if (code == NOT_PRIMITIVE_TEXT_VARIABLE_IN_LIST_ERROR) {
			errMsg += "Impossibile assegnare una variabile non primitiva testuale come elemento di una lista";
		} else if (code == NOT_PRIMITIVE_VARIABLE_ASSIGNMENT_ERROR) {
			errMsg += "Impossibile assegnare un elemento di una lista ad una variabile non primitiva testuale";
		} else if (code == NOT_PRIMITIVE_VARIABLE_IN_FORMAT_ERROR) {
			errMsg += "Impossibile sostituire il valore di una variabile non testuale primitiva nella funzione format";
		} else if (code == NOT_MATCH_NUM_VARS_FORMAT_ERROR) {
			errMsg += "Il numero degli specificatori non corrisponde al numero di variabili passate alla funzione format";
		} else if (code == VOID_FUNCTION_ASSIGNMENT_ERROR) {
			errMsg += "Impossibile ottenere un valore di ritorno da una funzione senza return";
		} else if (code == TABLE_ROW_SIZE_ERROR) {
			errMsg += "La riga della tabella ha un numero di colonne errato";
		} else if (code == NOT_LIST_MANIPULATION_ERROR) {
			errMsg += "Impossibile eseguire istruzioni di manipolazione su una variabile non di tipo lista";
		}

		errorList.add(errMsg);
	}

	public boolean isPrimitiveTextVariable(VarDescriptor vd) {
		// posso assegnare un'espressione solo a tipi string
		String[] primitiveTextTypes = { "title", "s1title", "s2title", "s3title", "s4title", "s5title", "text",
				"blockquote", "codeblock" };

		String varType;

		if (vd.varType.equals("fun")) {
			varType = vd.returnType;
		} else {
			varType = vd.varType;
		}

		if (Arrays.asList(primitiveTextTypes).contains(varType)) {
			return true;
		}
		return false;
	}

	/***
	 * Dichiarazione di funzioni/metodi/classi
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
			Hashtable<String, VarDescriptor> localTable = localTables.get("cl_" + cn);

			if (localTable.containsKey("fun_" + n)) {
				// il metodo è già stato dichiarato
				maltErrorHandler(METHOD_ALREADY_DECLARED_ERROR, name);

			} else {
				VarDescriptor vd = new VarDescriptor(n, "fun");
				localTable.put("fun_" + n, vd);
				localTables.put(cn + "." + n, new Hashtable<String, VarDescriptor>());
			}
		} else if (className == null && name != null) {
			// dichiarazione di una funzione top-level

			String n = name.getText();

			VarDescriptor vd = new VarDescriptor(n, "fun");

			if (globalTable.containsKey("fun_" + n)) {
				// la funzione top-level è già stata dischiarata
				maltErrorHandler(FUNCTION_ALREADY_DECLARED_ERROR, name);
			} else {
				globalTable.put("fun_" + n, vd);
				localTables.put("fun_" + n, new Hashtable<String, VarDescriptor>());
			}
		} else if (className != null && name == null) {
			// dichiarazione di una classe
			String cn = className.getText();

			VarDescriptor vd = new VarDescriptor(cn, "class");

			if (globalTable.containsKey("cl_" + cn)) {
				// classe già dichiarata
				maltErrorHandler(CLASS_ALREADY_DECLARED_ERROR, className);
			} else {
				globalTable.put("cl_" + cn, vd);
				localTables.put("cl_" + cn, new Hashtable<String, VarDescriptor>());
			}
		} else {
			// parametri mancanti alla chiamata del metodo dell'handler declareFunCl
			maltErrorHandler(DECLARE_FUN_CL_ERROR, className);
		}
	}

	/**
	 * Dichiarazione di variabili in un ciclo for
	 * 
	 * @param type Tipo della variabile
	 * @param name Nome della variabile
	 */

	public void declareInFor(Token type, Token name) {
		// esiste una ed una sola localTable dedicata ai cicli for
		String t = type.getText();
		String n = name.getText();
		VarDescriptor vd = new VarDescriptor(n, t);

		Hashtable<String, VarDescriptor> forTable = localTables.get("for");

		if (forTable.contains(n)) {
			// la variabile è già stata dichiarata nel ciclo for
			maltErrorHandler(VARIABLE_ALREADY_DECLARED_FOR_ERROR, name);
		} else {
			// aggiungi la variable alla localtable del ciclo for
			forTable.put(n, vd);
		}
	}

	/**
	 * Dichiarazione di variabili top-level
	 * 
	 * @param type Tipo della variabile
	 * @param name Nome della variabile
	 */
	public void declareVar(Token type, Token name) {
		String t = type.getText();
		String n = name.getText();
		VarDescriptor vd = new VarDescriptor(n, t);

		if (globalTable.containsKey(n)) {
			// la variabile top-level è già stata dichiarata
			maltErrorHandler(VARIABLE_ALREADY_DECLARED_TOP_ERROR, name);
		} else {
			// aggiungi la variabile alla tabella globale
			globalTable.put(n, vd);
		}
	}

	/**
	 * Dichiarazione di una variabile in una funzione/classe/metodo
	 * 
	 * @param className    Nome della classe
	 * @param functionName Nome della funzione
	 * @param type         Tipo della variabile
	 * @param name         Nome della variabile
	 */
	public void declareVarInFunCl(Token className, Token functionName, Token type, Token name) {

		String t = type.getText();
		String n = name.getText();

		VarDescriptor vd = new VarDescriptor(n, t);

		Hashtable<String, VarDescriptor> localTable;

		if (className != null && functionName != null) {
			// dichiarazione di variabile all'interno di metodi di una classe
			String cn = className.getText();
			String fn = functionName.getText();

			// localTable del metodo della classe
			localTable = localTables.get(cn + "." + fn);

			if (localTable.containsKey(n)) {
				// variabile già dichiarata all'interno del metodo
				maltErrorHandler(VARIABLE_ALREADY_DECLARED_CLASS_METHOD_ERROR, name);
			} else {
				// aggiungi la variabile alla localtable del metodo
				localTable.put(n, vd);
			}

		} else if (className == null && functionName != null) {
			// dichiarazione di variabili nelle funzioni top level
			String fn = functionName.getText();

			// localTable della funzione top-level
			localTable = localTables.get("fun_" + fn);

			if (localTable.containsKey(n)) {
				// variabile già dichiarata nella funzione
				maltErrorHandler(FUNCTION_VARIABLE_ALREADY_DECLARED_ERROR, name);
			} else {
				localTable.put(n, vd);
			}
		} else if (className != null && functionName == null) {
			// dichiarazione di campi di una classe
			String cn = className.getText();

			// localTable della classe
			localTable = localTables.get("cl_" + cn);

			if (localTable.containsKey(n)) {
				// campo della classe già dichiarato
				maltErrorHandler(FIELD_ALREADY_DECLARED_ERROR, name);

			} else {
				localTable.put(n, vd);
			}
		} else {
			// non sono stati forniti alcuni parametri necessari per eseguire la funzione
			// dell'handler
			maltErrorHandler(DECLARE_VAR_IN_FUN_CL_ERROR, name);
		}
	}

	/**
	 * Dichiarazione di una nuova variabile
	 * 
	 * @param className    Nome della classe
	 * @param functionName Nome della funzione
	 * @param inFor        All'interno di un ciclo for?
	 * @param type         Tipo della variabile
	 * @param name         Nome della variabile
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

	/**
	 * Dichiarazione di argomenti di una funzione/metodo
	 * 
	 * @param className    Nome della classe
	 * @param functionName Nome della funzione
	 * @param type         Tipo della variabile
	 * @param name         Nome della variabile
	 */
	public void declareArg(Token className, Token functionName, Token type, Token name) {

		String fn = functionName.getText();
		String t = type.getText();
		String n = name.getText();

		if (className == null) {
			// caso delle funzioni top-level
			Hashtable<String, VarDescriptor> localTable = localTables.get("fun_" + fn);

			if (localTable.containsKey(n)) {
				// è stata dichiarata una funzione con due argomenti che hanno lo stesso nome
				maltErrorHandler(FUNCTION_ARG_ALREADY_DECLARED_ERROR, name);
			} else {
				// aggiungi la variabile alla localTable della funzione
				localTable.put(n, new VarDescriptor(n, t));

				// aggiorna il numero dei parametri nel VarDescriptor della funzione
				globalTable.get("fun_" + fn).addParam(n);
			}

		} else {
			// caso dei metodi di una classe
			String cn = className.getText();

			Hashtable<String, VarDescriptor> classTable = localTables.get("cl_" + cn);
			Hashtable<String, VarDescriptor> localTable = localTables.get(cn + "." + fn);

			if (localTable.containsKey(n)) {
				// è stato dichiarato un metodo con due argomenti che hanno lo stesso nome
				maltErrorHandler(METHOD_ARG_ALREADY_DECLARED_ERROR, name);
			} else {
				// aggiungi la variabile alla localTable del metodo
				localTable.put(n, new VarDescriptor(n, t));

				// aggiorna il numero dei parametri nel VarDescriptor della funzione (si trova
				// nella localTable della classe)
				classTable.get("fun_" + fn).addParam(n);
			}

		}
	}

	/**
	 * Assegna ad una variabile una stringa
	 * (solo per assegnare stringhe a variabili primitive testuali)
	 * 
	 * @param className    Nome della classe
	 * @param functionName Nome della funzione
	 * @param inFor        All'interno di un ciclo for?
	 * @param type         Tipo della variabile, definito da un caller
	 * @param name         Nome della variabile
	 * @param value        Valore da assegnare alla variabile
	 */

	public void assignTextPrimitiveVarValue(Token className, Token functionName, boolean inFor, Token name,
			String value) {

		VarDescriptor vd = getVarDescriptor(className, functionName, inFor, name);

		if (vd == null) {
			maltErrorHandler(VARIABLE_UNDECLARED_ERROR, name);
			return;
		}

		if (!isPrimitiveTextVariable(vd)) {
			maltErrorHandler(NOT_MATCH_TYPE_ASSIGNMENT_ERROR, name);
			return;
		}

		String v = value.substring(1, value.length() - 1);

		vd.value = v;

	}

	public void assignTitle(Token className, Token functionName, boolean inFor, Token name, Token ref,
			String value) {

		// rimuovi le virgolette da value

		String valueWithRef;
		if (ref != null) {
			value = value.substring(1, value.length());
			valueWithRef = " {#" + ref.getText() + "}" + value;
		} else {
			valueWithRef = value;
		}

		assignTextPrimitiveVarValue(className, functionName, inFor, name, valueWithRef);

	}

	/**
	 * Assegna ad una variabile non primitiva testuale un valore
	 * 
	 * @param className    Nome della classe
	 * @param functionName Nome della funzione
	 * @param inFor        All'interno di un ciclo for?
	 * @param type         Tipo della variabile, definito da un caller
	 * @param name         Nome della variabile
	 * @param value        Valore da assegnare alla variabile
	 */

	public void assignComplexVarValue(Token className, Token functionName, boolean inFor, String type, Token name,
			String value) {

		VarDescriptor vd = getVarDescriptor(className, functionName, inFor, name);

		if (vd == null) {
			maltErrorHandler(VARIABLE_UNDECLARED_ERROR, name);
			return;
		}

		if (!type.equals(vd.varType)) {
			maltErrorHandler(NOT_MATCH_TYPE_ASSIGNMENT_ERROR, name);
			return;
		}

		vd.value = value;

	}

	public void assignTable(Token className, Token functionName, boolean inFor, Token name, Vector<Token> alignment,
			Vector<Vector<Token>> data) {

		VarDescriptor vd = getVarDescriptor(className, functionName, inFor, name);

		if (vd == null) {
			maltErrorHandler(VARIABLE_UNDECLARED_ERROR, name);
			return;
		}

		if (!vd.varType.equals("table")) {
			maltErrorHandler(NOT_MATCH_TYPE_ASSIGNMENT_ERROR, name);
			return;
		}

		int numColumns = 0;
		String valueString = "[";

		if (alignment != null) {
			numColumns = alignment.size();
		} else {
			numColumns = data.get(0).size();
		}

		// converti alignment a stringa
		for (int i = 0; i < numColumns; i++) {

			if (alignment != null) {
				if (alignment.get(i) != null) {
					valueString += alignment.get(i).getText();
				}

			} else {
				valueString += "$c";
			}

			if (i != numColumns - 1) {
				valueString += ",";
			}
		}

		valueString += "](";

		for (int nRow = 0; nRow < data.size(); nRow++) {
			Vector<Token> row = data.get(nRow);

			// controlla se la riga ha un numero errato di colonne
			if (row.size() != numColumns) {
				maltErrorHandler(TABLE_ROW_SIZE_ERROR, row.lastElement());
				return;
			}

			// se la lunghezza della riga è corretta, converti la riga in stringa
			for (int nColumn = 0; nColumn < row.size(); nColumn++) {
				String tkStr = row.get(nColumn).getText();
				tkStr = tkStr.substring(1, tkStr.length() - 1);
				if (nColumn == 0) {
					valueString += "[" + tkStr + ",";
				} else if (nColumn == row.size() - 1) {
					valueString += tkStr + "]";
				} else {
					valueString += tkStr + ",";
				}
			}

			if (nRow != data.size() - 1) {
				valueString += ",";
			}

		}

		valueString += ")";

		// va tutto bene, assegna la stringa
		assignComplexVarValue(className, functionName, inFor, "table", name, valueString);

	}

	/**
	 * Assegna il valore di una lista ad una variabile
	 * 
	 * @param className    Nome della classe
	 * @param functionName Nome della funzione
	 * @param inFor        All'interno di un ciclo for?
	 * @param name         Nome della variabile
	 * @param value        Lista di token (variabili o stringhe)
	 */
	public void assignListValue(Token className, Token functionName, boolean inFor, Token name, Vector<Token> value) {

		// String[] listValue = new String[value.size()];

		Vector<String> listValue = new Vector<String>();

		VarDescriptor varVd = getVarDescriptor(className, functionName, inFor, name);

		if (varVd == null) {
			maltErrorHandler(VARIABLE_UNDECLARED_ERROR, name);
			return;
		}

		for (int i = 0; i < value.size(); i++) {
			if (value.get(i).getText().contains("\"")) {
				String itemStr = value.get(i).getText();
				// listValue[i] = itemStr.substring(1, itemStr.length() - 1);
				listValue.add(itemStr.substring(1, itemStr.length() - 1));
			} else {

				VarDescriptor resVd = getVarDescriptor(className, functionName, inFor, value.get(i));

				if (resVd == null) {
					maltErrorHandler(VARIABLE_UNDECLARED_ERROR, value.get(i));
					return;
				}

				if (!isPrimitiveTextVariable(resVd)) {
					maltErrorHandler(NOT_PRIMITIVE_TEXT_VARIABLE_IN_LIST_ERROR, value.get(i));
					return;
				}

				// listValue[i] = resVd.value;
				listValue.add(resVd.value);
			}
		}

		varVd.listValue = listValue;

	}

	/**
	 * Controlla se due variabili hanno lo stesso tipo
	 * 
	 * @param vd1 Prima variabile
	 * @param vd2 Seconda variabile
	 * @return true: stesso tipo, false: tipo diverso
	 */
	public boolean checkType(VarDescriptor vd1, VarDescriptor vd2) {

		String type1 = vd1.varType;
		String type2 = vd2.varType;

		if (vd1.varType.equals("fun")) {
			type1 = vd1.returnType;
		}

		if (vd2.varType.equals("fun")) {
			type2 = vd2.returnType;
		}

		if (type1.equals(type2)) {
			return true;
		}
		return false;
	}

	/**
	 * Assegna il valore di una variabile ad un'altra variabile
	 * Esempio: text t1 = "esempio"; text t2 = t1;
	 * 
	 * @param className           Nome della classe
	 * @param functionName        Nome della funzione
	 * @param inFor               Dentro un ciclo for?
	 * @param isValueFromFunction A destra c'è una chiamata di funzione?
	 * @param var1                Token variabile di sinistra
	 * @param var2                Token variabile di destra
	 */
	public void assignVarToVar(Token className, Token functionName, boolean inFor, boolean isValueFromFunction,
			Token var1, Token var2) {

		VarDescriptor leftVar = getVarDescriptor(className, functionName, inFor, var1);
		VarDescriptor rightVar;

		if (leftVar == null) {
			maltErrorHandler(VARIABLE_UNDECLARED_ERROR, var1);
			return;
		}

		// se è un assegnamento di una chiamata di funzione cerco il VarDescriptor della
		// funzione
		// che contiene il return value
		if (isValueFromFunction) {
			// a destra c'è una chiamata di funzione

			String var2Str = var2.getText();

			String[] splitted = var2Str.split("\\.");

			if (splitted.length == 2) {
				// se usa la dot notation in chiamata
				String classKey;
				String functionKey;

				// se il valore prima del punto è this
				if (className != null && splitted[0].equals("this")) {
					String cn = className.getText();
					classKey = "cl_" + cn;
					functionKey = "fun_" + splitted[1];
				} else {
					classKey = "cl_" + splitted[0];
					functionKey = "fun_" + splitted[1];
				}

				if (localTables.containsKey(classKey)) {
					Hashtable<String, VarDescriptor> classTable = localTables.get(classKey);

					if (classTable.containsKey(functionKey)) {
						rightVar = classTable.get(functionKey);
					} else {
						maltErrorHandler(METHOD_UNDECLARED_ERROR, var2);
						return;
					}
				} else {
					maltErrorHandler(METHOD_UNDECLARED_ERROR, var2);
					return;
				}

			} else {
				// nessuna dot notazione, semplice chiamata es: funzione(params...)
				rightVar = getFunctionVarDescriptor(className, var2);

				if (rightVar == null) {
					maltErrorHandler(FUNCTION_UNDECLARED_ERROR, var2);
					return;
				}
			}

		} else {
			// a destra c'è una variabile
			rightVar = getVarDescriptor(className, functionName, inFor, var2);

			if (rightVar == null) {
				maltErrorHandler(VARIABLE_UNDECLARED_ERROR, var2);
				return;
			}
		}

		// nel caso isValueFromFunction = true, controllo se la funzione è void
		if (rightVar.varType.equals("fun") && rightVar.returnType.isEmpty()) {
			maltErrorHandler(VOID_FUNCTION_ASSIGNMENT_ERROR, var2);
			return;
		}

		// se la variabile a destra è una lista devo assegnare il valore nel campo
		// listValue (e non value) del VarDescriptor della var di sinistra
		if (rightVar.varType.contains("list")) {
			leftVar.listValue = rightVar.listValue;
		} else {
			// se la variabile di destra non è una lista
			if (isPrimitiveTextVariable(leftVar) && isPrimitiveTextVariable(rightVar)) {
				String value = "\"" + rightVar.value + "\"";
				assignTextPrimitiveVarValue(className, functionName, inFor, var1, value);
			} else if (checkType(leftVar, rightVar)) {
				if (rightVar.varType.equals("fun")) {
					assignComplexVarValue(className, functionName, inFor, rightVar.returnType, var1, rightVar.value);
				} else {
					assignComplexVarValue(className, functionName, inFor, rightVar.varType, var1, rightVar.value);
				}

			} else {
				maltErrorHandler(NOT_MATCH_TYPE_ASSIGNMENT_ERROR, var2);
				return;
			}

		}

	}

	public void assignListItemToVar(Token className, Token functionName, boolean inFor, Token leftVar, Token rightVar,
			Token idxTk) {
		VarDescriptor leftVarVd = getVarDescriptor(className, functionName, inFor, leftVar);

		if (leftVarVd == null) {
			maltErrorHandler(VARIABLE_UNDECLARED_ERROR, leftVar);
			return;
		}

		if (!isPrimitiveTextVariable(leftVarVd)) {
			maltErrorHandler(NOT_PRIMITIVE_VARIABLE_ASSIGNMENT_ERROR, idxTk);
			return;
		}

		VarDescriptor rightVarVd = getVarDescriptor(className, functionName, inFor, rightVar);

		if (rightVarVd == null) {
			maltErrorHandler(VARIABLE_UNDECLARED_ERROR, rightVar);
			return;
		}

		if (!rightVarVd.varType.contains("list")) {
			maltErrorHandler(NOT_LIST_INDEXING_ERROR, rightVar);
			return;
		}

		int idx = Integer.valueOf(idxTk.getText());

		if (idx >= rightVarVd.getListLength()) {
			maltErrorHandler(OUT_OF_BOUND_ERROR, idxTk);
			return;
		}

		// String item = rightVarVd.listValue[idx];
		String item = rightVarVd.listValue.get(idx);

		leftVarVd.value = item;

	}

	/**
	 * Assegna un'espressione ad una variabile con tipo allowedTypes (vedi metodo)
	 * 
	 * @param className    Nome della classe
	 * @param functionName Nome della funzione
	 * @param inFor        Dentro un ciclo for?
	 * @param name         Nome della variabile
	 * @param exps         Espressione
	 */
	public void assignExprToVar(Token className, Token functionName, boolean inFor, Token name, Vector<Token> exps) {

		VarDescriptor nameVd = getVarDescriptor(className, functionName, inFor, name);

		if (nameVd == null) {
			maltErrorHandler(VARIABLE_UNDECLARED_ERROR, name);
			return;
		}

		if (!isPrimitiveTextVariable(nameVd)) {
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
				VarDescriptor resVd = getVarDescriptor(className, functionName, inFor, exps.get(i));

				if (resVd == null) {
					maltErrorHandler(VARIABLE_UNDECLARED_ERROR, exps.get(i));
					return;
				}

				if (checkConvertibleTypes(nameVd, resVd)) {
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

		assignTextPrimitiveVarValue(className, functionName, inFor, name, concString);

	}

	public boolean checkConvertibleTypes(VarDescriptor vd1, VarDescriptor vd2) {

		if (checkType(vd1, vd2)) {
			return true;
		}

		if (vd1.varType.contains("list") && vd2.varType.contains("list")) {
			return true;
		}

		if (isPrimitiveTextVariable(vd1) && isPrimitiveTextVariable(vd2)) {
			return true;
		}

		return false;

	}

	/**
	 * Chiamata di funzione: controlla se esiste la funzione / metodo e controlla se
	 * il numero e il tipo di parametri corrisponde
	 * 
	 * @param className      Nome della classe
	 * @param functionName   Nome della funzione
	 * @param functionToCall Funzione chiamata
	 * @param args           Argomenti passati alla funzione chiamata
	 */
	public void functionCall(Token className, Token functionName, Token functionToCall, Vector<Token> args) {

		if (functionToCall == null) {
			maltErrorHandler(FUNCTION_CALL_ERROR, functionToCall);
			return;
		}

		String funcToCall = functionToCall.getText();

		String[] splitted = funcToCall.split("\\.");

		Vector<String> argStrings = new Vector<String>();

		for (Token el : args) {
			argStrings.add(el.getText());
		}

		// vettore di VarDescriptor degli argomenti della chiamata
		Vector<VarDescriptor> argsVd = new Vector<VarDescriptor>();

		Hashtable<String, VarDescriptor> classTable = null;

		Hashtable<String, VarDescriptor> funcToCallTable = new Hashtable<String, VarDescriptor>();
		VarDescriptor functionToCallVarDescriptor = new VarDescriptor("", "");

		if (className != null && splitted[0].equals("this") && splitted.length == 2) {
			String key = className.getText() + "." + splitted[1];

			classTable = localTables.get("cl_" + className.getText());

			if (localTables.containsKey(key)) {
				funcToCallTable = localTables.get(key);
				functionToCallVarDescriptor = classTable.get("fun_" + splitted[1]);
			} else {
				maltErrorHandler(METHOD_UNDECLARED_ERROR, functionToCall);
				return;
			}
		} else if (splitted.length == 2) {
			String key = splitted[0] + "." + splitted[1];
			if (localTables.containsKey(key)) {
				funcToCallTable = localTables.get(key);

				classTable = localTables.get("cl_" + splitted[0]);
				functionToCallVarDescriptor = classTable.get("fun_" + splitted[1]);

			} else {
				maltErrorHandler(METHOD_UNDECLARED_ERROR, functionToCall);
				return;
			}
		} else {
			if (localTables.containsKey("fun_" + funcToCall)) {
				funcToCallTable = localTables.get("fun_" + funcToCall);
				functionToCallVarDescriptor = globalTable.get("fun_" + funcToCall);
			} else {
				maltErrorHandler(FUNCTION_UNDECLARED_ERROR, functionToCall);
				return;
			}
		}

		int numParams = functionToCallVarDescriptor.getNumParams();
		Vector<String> params = functionToCallVarDescriptor.getParams();

		// controllo se il numero degli argomenti della chiamata è uguale al numero dei
		// parametri della funzione
		if (args.size() == numParams) {
			int i = 0;

			// recupero i valori delle variabili nella chiamata
			for (int j = 0; j < args.size(); j++) {
				String argName = argStrings.get(j);

				VarDescriptor vd = getVarDescriptor(className, functionName, false, args.get(j));

				if (vd == null) {
					maltErrorHandler(FUNCTION_PARAMETER_UNDECLARED_ERROR, args.get(j));
					return;
				}

				argStrings.set(j, argName);
				argsVd.add(vd);
			}

			// per ogni argomento controlla se il tipo corrisponde o è convertibile con
			// quello del parametro corrispondente e in caso positivo assegna il valore
			for (VarDescriptor vdInput : argsVd) {
				String paramName = params.get(i);

				// VarDescriptor del parametro della funzione
				VarDescriptor vdParam = funcToCallTable.get(paramName);

				if (!checkConvertibleTypes(vdInput, vdParam)) {
					maltErrorHandler(NOT_MATCH_TYPE_ARG_ERROR, args.get(i));
					return;

				} else if (vdInput.varType.contains("list")) {
					vdParam.listValue = vdInput.listValue;
				} else {
					vdParam.value = vdInput.value;
					funcToCallTable.put(vdParam.varName, vdParam);
				}
				i++;
			}

		} else {
			maltErrorHandler(NOT_MATCH_NUM_ARG_ERROR, functionToCall);
		}

	}

	/**
	 * Gestisce il valore di ritorno delle funzioni
	 * 
	 * @param className    Nome della classe
	 * @param functionName Nome della funzione
	 * @param returnToken  Variabile ritornata dalla funzione
	 */
	public void handleReturn(Token className, Token functionName, Token returnToken) {

		String returnStr = returnToken.getText();

		String returnValue = "";
		String returnType = "";

		// recupero il valore che viene ritornato
		if (returnStr.contains("\"")) {
			// se ritorno un letterale
			returnType = "text";
			returnValue = returnStr.substring(1, returnStr.length() - 1);
		} else {
			// se ritorno una variabile
			// recupero il valore della variabile
			VarDescriptor returnVd = getVarDescriptor(className, functionName, false, returnToken);

			if (returnVd == null) {
				maltErrorHandler(VARIABLE_UNDECLARED_ERROR, returnToken);
				return;
			}

			returnValue = returnVd.value;
			returnType = returnVd.varType;
		}

		// cerco la funzione alla quale assegnare il valore di return
		VarDescriptor functionVd = getFunctionVarDescriptor(className, functionName);

		functionVd.returnType = returnType;
		functionVd.value = returnValue;
	}

	/**
	 * Ricerca il VarDescriptor della variabile seguendo la cascata for -> dentro
	 * metodo -> dentro classe -> top-level
	 * 
	 * @param className    Nome della classe
	 * @param functionName Nome della funzione
	 * @param inFor        Dentro il ciclo for?
	 * @param name         Nome della variabile
	 * @return VarDescriptor della variabile
	 */
	public VarDescriptor getVarDescriptor(Token className, Token functionName, boolean inFor, Token name) {
		String n = name.getText();

		Hashtable<String, VarDescriptor> forTable = null;
		Hashtable<String, VarDescriptor> classTable = null;
		Hashtable<String, VarDescriptor> localTable = null;

		if (inFor) {
			forTable = localTables.get("for");
		}

		if (className != null && functionName != null) {
			String cn = className.getText();
			String fn = functionName.getText();

			localTable = localTables.get(cn + "." + fn);
			classTable = localTables.get("cl_" + cn);
		} else if (className == null && functionName != null) {
			String fn = functionName.getText();
			localTable = localTables.get("fun_" + fn);
		} else if (className != null && functionName == null) {
			String cn = className.getText();
			localTable = localTables.get("cl_" + cn);
		}

		if (forTable != null && forTable.containsKey(n)) {
			return forTable.get(n);
		} else if (localTable != null && localTable.containsKey(n)) {
			return localTable.get(n);
		} else if (classTable != null && classTable.containsKey(n)) {
			return classTable.get(n);
		} else if (globalTable.containsKey(n)) {
			return globalTable.get(n);
		} else {
			return null;
		}

	}

	/**
	 * Ricerca il VarDecsriptor della funzione / metodo allocata nella tabella
	 * locale di una classe o della tabella globale
	 * 
	 * @param className    Nome della classe
	 * @param functionName Nome della funzione
	 * @return VarDescriptor della funzione / metodo
	 */
	public VarDescriptor getFunctionVarDescriptor(Token className, Token functionName) {

		String fn = functionName.getText();
		VarDescriptor functionVd;

		if (className != null) {

			String cn = className.getText();
			Hashtable<String, VarDescriptor> classTable = localTables.get("cl_" + cn);

			if (classTable.containsKey("fun_" + fn)) {
				functionVd = classTable.get("fun_" + fn);
			} else if (globalTable.containsKey("fun_" + fn)) {
				functionVd = globalTable.get("fun_" + fn);
			} else {
				return null;
			}

		} else {

			if (globalTable.containsKey("fun_" + fn)) {
				functionVd = globalTable.get("fun_" + fn);
			} else {
				return null;
			}
		}

		return functionVd;
	}

	/**
	 * Gestisce la funzione format()
	 * 
	 * @param className    Nome della classe
	 * @param functionName Nome della funzione
	 * @param inFor        Dentro il ciclo for?
	 * @param resultVar    Variabile dove inserire il risultato di format()
	 * @param formatText   Stringa da formattare
	 * @param vars         Variabili da inserire nei % nella formatText
	 */

	public void handleFormat(Token className, Token functionName, boolean inFor, Token resultVar, Token formatText,
			Vector<Token> vars) {

		// VarDescriptor della variabile formattext
		VarDescriptor ftVd = getVarDescriptor(className, functionName, inFor, formatText);

		if (ftVd == null) {
			maltErrorHandler(VARIABLE_UNDECLARED_ERROR, formatText);
			return;
		}

		if (!isPrimitiveTextVariable(ftVd)) {
			maltErrorHandler(NOT_MATCH_TYPE_ASSIGNMENT_ERROR, formatText);
			return;
		}

		// trovare i %.. all'interno della formattext con regex
		String ft = ftVd.value;
		Vector<String> matches = new Vector<String>();
		Vector<String> values = new Vector<String>();

		String regex = "(?<!\\\\)%(ib|i|b|t)";
		Pattern pt = Pattern.compile(regex);
		Matcher matcher = pt.matcher(ft);

		while (matcher.find()) {
			matches.add(matcher.group());
		}

		if (matches.size() != vars.size()) {
			maltErrorHandler(NOT_MATCH_NUM_VARS_FORMAT_ERROR, formatText);
			return;
		}

		// suddivido la stringa dove trovo i %..
		String[] splitted = ft.split(regex);

		// itera la lista di variabili (da inserire nella formattext)
		for (Token var : vars) {
			// VarDescriptor di una variabile da inserire
			VarDescriptor vd = getVarDescriptor(className, functionName, inFor, var);

			if (vd == null) {
				maltErrorHandler(VARIABLE_UNDECLARED_ERROR, var);
				return;
			}

			if (!isPrimitiveTextVariable(vd)) {
				maltErrorHandler(NOT_PRIMITIVE_VARIABLE_IN_FORMAT_ERROR, var);
			}

			String value = vd.value;

			// aggiungi il valore della variabile alla lista di valori da inserire nella
			// formattext
			values.add(value);
		}

		for (int i = 0; i < matches.size(); i++) {
			String symbol = matches.get(i);
			String markdownFormat = "";

			if (symbol.equals("%i")) {
				markdownFormat = "*";
			} else if (symbol.equals("%b")) {
				markdownFormat = "**";
			} else if (symbol.equals("%ib")) {
				markdownFormat = "***";
			}

			String formattedValues = markdownFormat + values.get(i) + markdownFormat;

			values.set(i, formattedValues);
		}

		String resultStr = "\"";

		for (int i = 0; i < splitted.length - 1; i++) {

			// aggiungi prima il pezzo di testo
			resultStr += splitted[i];

			// aggiungi il valore della variabile da inserire
			resultStr += values.get(i);

		}

		// aggiungi l'ultimo pezzo di testo

		resultStr += splitted[splitted.length - 1];

		if (values.size() > splitted.length - 1) {
			resultStr += values.get(values.size() - 1);
		}

		resultStr += "\"";

		// assegna la stringa alla variabile resultVar
		assignTextPrimitiveVarValue(className, functionName, inFor, resultVar, resultStr);

	}

	public void handleListPush(Token className, Token functionName, boolean inFor, Token listName, Token newElement) {

		VarDescriptor listVd = getVarDescriptor(className, functionName, inFor, listName);

		// controlla se la variabile è stata dichiarata
		if (listVd == null) {
			maltErrorHandler(VARIABLE_UNDECLARED_ERROR, listName);
			return;
		}

		// controlla se push è stato invocato su una variabile lista
		if (!listVd.varType.contains("list")) {
			maltErrorHandler(NOT_LIST_MANIPULATION_ERROR, listName);
			return;
		}

		VarDescriptor elementVd = getVarDescriptor(className, functionName, inFor, newElement);

		// controlla se l'elemento da inserire nella lista è stato dichiarato
		if (elementVd == null) {
			maltErrorHandler(VARIABLE_UNDECLARED_ERROR, newElement);
			return;
		}

		// controlla se l'elemento da inserire nella lista è di tipo primitivo testuale
		if (!isPrimitiveTextVariable(elementVd)) {
			maltErrorHandler(NOT_LIST_MANIPULATION_ERROR, newElement);
			return;
		}

		listVd.listValue.add(elementVd.value);

	}

	public void handleListRemove(Token className, Token functionName, boolean inFor, Token listName, Token idxTk,
			Token saveVar) {

		VarDescriptor listVd = getVarDescriptor(className, functionName, inFor, listName);

		// controlla se la variabile è stata dichiarata
		if (listVd == null) {
			maltErrorHandler(VARIABLE_UNDECLARED_ERROR, listName);
			return;
		}

		// controlla se push è stato invocato su una variabile lista
		if (!listVd.varType.contains("list")) {
			maltErrorHandler(NOT_LIST_MANIPULATION_ERROR, listName);
			return;
		}

		if (listVd.getListLength() == 0) {
			maltErrorHandler(EMPTY_LIST_ERROR, listName);
			return;
		}

		int idx;

		if (idxTk.getText().equals("_")) {
			idx = listVd.getListLength() - 1;
		} else {
			idx = Integer.parseInt(idxTk.getText());
		}

		if (idx >= listVd.getListLength() || idx < 0) {
			maltErrorHandler(OUT_OF_BOUND_ERROR, idxTk);
			return;
		}

		if (!saveVar.getText().equals("_")) {

			VarDescriptor saveVarVd = getVarDescriptor(className, functionName, inFor, saveVar);

			// controlla se la variabile dove viene salvato il risultato della remove è
			// stato
			// dichiarato
			if (saveVarVd == null) {
				maltErrorHandler(VARIABLE_UNDECLARED_ERROR, saveVar);
				return;
			}

			// controlla se la variabile dove viene salvato il risultato della remove è
			// primitivo testuale
			if (!isPrimitiveTextVariable(saveVarVd)) {
				maltErrorHandler(NOT_LIST_MANIPULATION_ERROR, saveVar);
				return;
			}

			saveVarVd.value = listVd.listValue.get(idx);
		}

		listVd.listValue.removeElementAt(idx);

	}

	/**
	 * Gestisce i cicli for
	 * 
	 * @param className    Nome della classe
	 * @param functionName Nome della funzione
	 * @param isIncr       È un for con incremento?
	 * @param name         Nome della variabile dove viene salvata l'iterazione
	 *                     attuale
	 * @param it           Lista da iterare o valore che contiene il numero di
	 *                     iterazioni
	 */
	public void declareFor(Token className, Token functionName, boolean isIncr, Token name, Token it) {

		Hashtable<String, VarDescriptor> forTable = null;
		if (localTables.containsKey("for")) {
			localTables.get("for").clear();
		} else {
			localTables.put("for", new Hashtable<String, VarDescriptor>());
		}

		forTable = localTables.get("for");

		if (isIncr) {
			// iterazione tramite counter
			VarDescriptor vd = new VarDescriptor(name.getText(), "text");
			vd.value = "0";

			VarDescriptor vdMax = new VarDescriptor("for", "text");
			vdMax.value = it.getText();

			forTable.put(name.getText(), vd);
			forTable.put("for", vdMax);

		} else {
			// iterazione di un for sulle liste
			// VarDescriptor della lista da iterare
			VarDescriptor vdIt = getVarDescriptor(className, functionName, true, it);

			if (vdIt == null) {
				maltErrorHandler(VARIABLE_UNDECLARED_ERROR, it);
				return;
			}

			int length = vdIt.listValue.size();

			// controllo la lunghezza della lista da iterare
			if (length <= 0) {
				maltErrorHandler(ITERATE_EMPTY_LIST_ERROR, it);
				return;
			}

			// inizializzo l'iteratore con il primo valore della lista da iterare
			VarDescriptor vd = new VarDescriptor(name.getText(), "text");
			vd.value = vdIt.listValue.get(0);

			forTable.put(name.getText(), vd);

		}
	}

	/**
	 * Stampa la tabella globale e le tabelle locali
	 */
	public void printTable() {
		System.out.println("\n\n--------BEGIN GLOBAL TABLE--------");
		Set<String> keysG = globalTable.keySet();
		for (String varG : keysG) {
			System.out.println(varG + "-> " + globalTable.get(varG));
		}
		System.out.println("--------END GLOBAL TABLE--------\n\n");

		System.out.println("--------BEGIN LOCAL TABLES--------");
		Set<String> keysL = localTables.keySet();
		for (String varL : keysL) {

			System.out.println(varL + "-> " + localTables.get(varL));
		}
		System.out.println("--------END LOCAL TABLES--------");
	}
}