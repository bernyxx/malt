package compilerPackage;

import java.util.Arrays;
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
			Hashtable<String, VarDescriptor> localTable = functionTables.get("cl_" + cn);

			if (localTable.containsKey("fun_" + n)) {

				System.err.println("Il metodo " + n + " della classe " + cn + " è già stato dichiarato --> riga ("
						+ name.getLine() + ")");

			} else {
				VarDescriptor vd = new VarDescriptor(n, "function");
				localTable.put("fun_" + n, vd);

				System.out.println("è stato dichiarato un metodo " + n + " della classe " + cn + " --> riga ("
						+ name.getLine() + ")");
				functionTables.put(cn + "." + n, new Hashtable<String, VarDescriptor>());
			}
		} else if (className == null && name != null) {
			// dichiarazione di una funzione top-level

			String n = name.getText();

			VarDescriptor vd = new VarDescriptor(n, "fun");

			if (symbolTable.containsKey("fun_" + n)) {
				System.err.println("La funzione " + n + " è già stata dichiarata --> riga (" + name.getLine() + ")");

			} else {

				symbolTable.put("fun_" + n, vd);
				functionTables.put("fun_" + n, new Hashtable<String, VarDescriptor>());

				System.out.println("è stata dichiarata la funzione " + n + " --> riga (" + name.getLine() + ")");

			}
		} else if (className != null && name == null) {
			// dichiarazione di una classe
			String cn = className.getText();

			VarDescriptor vd = new VarDescriptor(cn, "class");

			if (symbolTable.containsKey("cl_" + cn)) {
				System.err
						.println("La classe " + cn + " è già stata dichiarata --> riga (" + className.getLine() + ")");

			} else {

				symbolTable.put("cl_" + cn, vd);
				functionTables.put("cl_" + cn, new Hashtable<String, VarDescriptor>());

				System.out.println("È stata dichiarata la classe " + cn + " --> riga (" + className.getLine() + ")");

			}
		} else {
			System.err.println("ERRORE declareFunCl(): className e name sono entrambi nulli");
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

		if (symbolTable.containsKey(n)) {
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
	public void declareVarInFunCl(Token className, Token functionName, Token type, Token name) {

		String t = type.getText();
		String n = name.getText();

		VarDescriptor vd = new VarDescriptor(n, t);

		// dichiarazione di variabile all'interno di metodi di una classe
		if (className != null && functionName != null) {

			String cn = className.getText();
			String fn = functionName.getText();

			Hashtable<String, VarDescriptor> localTable = functionTables.get(cn + "." + fn);

			if (localTable.containsKey(n)) {

				System.err.println("La variabile " + n + " nel metodo " + fn + " della classe " + cn
						+ " è già stata dichiarata --> riga ("
						+ type.getLine() + ")");

			} else {

				localTable.put(n, vd);

				System.out.println(
						"è stata dichiarata una variabile " + n + " nel metodo " + fn + " della classe " + cn
								+ " --> riga (" + type.getLine() + ")");
			}
		} else if (className == null && functionName != null) {
			// dichiarazione di variabili nelle funzioni top level
			String fn = functionName.getText();

			Hashtable<String, VarDescriptor> localTable = functionTables.get("fun_" + fn);

			if (localTable.containsKey(n)) {

				System.err.println(
						"La variabile " + n + " della funzione " + fn + " è già stata dichiarata --> riga ("
								+ type.getLine() + ")");

			} else {
				localTable.put(n, vd);

				System.out.println(
						"è stata dichiarata una variabile " + n + " nella funzione " + fn + " --> riga (" +
								type.getLine() + ")");
			}
		} else if (className != null && functionName == null) {
			// dichiarazione di campi di una classe
			String cn = className.getText();

			Hashtable<String, VarDescriptor> localTable = functionTables.get("cl_" + cn);

			if (localTable.containsKey(n)) {

				System.err.println(
						"Il campo " + n + " della classe " + cn + " è già stato dichiarato --> riga ("
								+ type.getLine() + ")");

			} else {
				localTable.put(n, vd);

				System.out.println(
						"È stato dichiarato un campo " + n + " nella classe " + cn + " --> riga (" +
								type.getLine() + ")");
			}
		} else {
			System.err.println("ERRORE declareVarInFunCl(): className e functionName sono entrambi nulli");
		}
	}

	/**
	 * 
	 * @param id        class/fun/""/ nome della classe (per i metodi)
	 * @param nameFunCl nome della funzione/classe/metodo della classe
	 * @param type      tipo della variabile
	 * @param name      nome della variabile
	 */
	public void declareNew(Token className, Token functionName, Token type, Token name) {

		if (className == null && functionName == null) {
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

			Hashtable<String, VarDescriptor> localTable = functionTables.get("fun_" + fn);

			if (localTable.containsKey(n)) {
				System.err.println("L'argomento " + n + " nella funzione " + fn + " è già stato dichiarato --> riga ("
						+ type.getLine() + ")");
			} else {
				localTable.put(n, new VarDescriptor(n, t));
				symbolTable.get("fun_" + fn).addParam(n);
				System.out.println(
						"è stato dichiarato un argomento " + n + " nella funzione " + fn + " --> riga (" +
								type.getLine() + ")");
			}

			// caso dei metodi di una classe
		} else {
			String cn = className.getText();

			Hashtable<String, VarDescriptor> classTable = functionTables.get("cl_" + cn);
			Hashtable<String, VarDescriptor> localTable = functionTables.get(cn + "." + fn);

			if (localTable.containsKey(n)) {
				System.err.println("L'argomento " + n + " nel metodo " + fn + " della classe " + cn
						+ " è già stato dichiarato --> riga ("
						+ type.getLine() + ")");
			} else {
				localTable.put(n, new VarDescriptor(n, t));
				classTable.get("fun_" + fn).addParam(n);
				System.out.println(
						"è stato dichiarato un argomento " + n + " nel metodo " + fn + " della classe " + cn
								+ " --> riga (" +
								type.getLine() + ")");
			}

		}
	}

	public void assignVarValue(Token className, Token functionName, Token name, String value) {

		String n = name.getText();
		String v = value;

		// caso della variabile in un metodo
		if (className != null && functionName != null) {

			String cn = className.getText();
			String fn = functionName.getText();

			// localTable della funzione dove viene assegnata la variabile
			Hashtable<String, VarDescriptor> localTable = functionTables.get(cn + "." + fn);

			if (localTable.containsKey(n)) {
				VarDescriptor vd = localTable.get(n);
				vd.value = v;
				System.out
						.println("Alla variabile " + n + " del metodo " + fn + " della classe " + cn
								+ " è stato assegnato il valore " + v
								+ " --> riga ("
								+ name.getLine() + ")");
			} else {
				System.out.println("Errore assegnamento! La variabile " + n + " del metodo " + fn + " della classe "
						+ cn + " non esiste!"
						+ "--> riga ("
						+ name.getLine() + ")");
			}
		} else if (className == null && functionName != null) {
			// caso delle variabili in funzioni top-level

			String fn = functionName.getText();

			// localTable della funzione dove viene assegnata la variabile
			Hashtable<String, VarDescriptor> localTable = functionTables.get("fun_" + fn);

			if (localTable.containsKey(n)) {
				VarDescriptor vd = localTable.get(n);
				vd.value = v;
				System.out
						.println("Alla variabile " + n + " della funzione " + fn
								+ " è stato assegnato il valore " + v
								+ " --> riga ("
								+ name.getLine() + ")");
			} else {
				System.out.println("Errore assegnamento! La variabile " + n + " della funzione " + fn + " non esiste!"
						+ "--> riga ("
						+ name.getLine() + ")");
			}

		} else if (className != null && functionName == null) {
			// caso dei campi di una classe

			String cn = className.getText();

			// localTable della funzione dove viene assegnata la variabile
			Hashtable<String, VarDescriptor> localTable = functionTables.get("cl_" + cn);

			if (localTable.containsKey(n)) {
				VarDescriptor vd = localTable.get(n);
				vd.value = v;
				System.out
						.println("Al campo " + n + " della classe " + cn
								+ " è stato assegnato il valore " + v
								+ " --> riga ("
								+ name.getLine() + ")");
			} else {
				System.out.println("Errore assegnamento! Il campo " + n + " della classe  " + cn + " non esiste!"
						+ "--> riga ("
						+ name.getLine() + ")");
			}

		} else {
			if (symbolTable.containsKey(n)) {
				VarDescriptor vd = symbolTable.get(n);
				vd.value = v;
				System.out
						.println("Alla variabile " + n + " è stato assegnato il valore " + v
								+ " --> riga ("
								+ name.getLine() + ")");
			} else {
				System.out.println("Errore assegnamento! La variabile " + n + " non esiste!"
						+ "--> riga ("
						+ name.getLine() + ")");
			}
		}

	}

	public void functionCall(Token className, Token functionName, Token functionToCall, Vector<String> args) {

		System.out.println("Function call");

		if (functionToCall == null) {
			System.out.println("ERRORE functionCall(): functionToCall è nullo!");
			return;
		}

		String funcToCall = functionToCall.getText();

		for (String el : args) {
			System.out.println(el);
		}

		// vettore di VarDescriptor degli argomenti della chiamata
		Vector<VarDescriptor> argsVd = new Vector<VarDescriptor>();

		if (className != null && functionName != null) {
			String cn = className.getText();
			String fn = functionName.getText();

			System.out.println("PEZZI : " + funcToCall);

			String[] splitted = funcToCall.split("\\.");

			System.out.println(Arrays.toString(splitted));

			Hashtable<String, VarDescriptor> funcToCallTable = new Hashtable<String, VarDescriptor>();

			// VarDescriptor della funzione da chiamare
			VarDescriptor functionToCallVarDescriptor = new VarDescriptor("", "");

			Hashtable<String, VarDescriptor> classTable = functionTables.get("cl_" + cn);
			Hashtable<String, VarDescriptor> localTable = functionTables.get(cn + "." + fn);

			// tabella della funzione da chiamare
			// con this cerco la funzione solo dentro la classe
			if (splitted[0].equals("this") && splitted.length == 2) {
				System.out.println("LOCAL METHOD");
				String key = cn + "." + splitted[1];

				if (functionTables.containsKey(key)) {
					funcToCallTable = functionTables.get(key);
					functionToCallVarDescriptor = classTable.get("fun_" + splitted[1]);
				} else {
					System.out.println("Il metodo " + splitted[1] + " non esiste!");
					return;
				}
				System.out.println("key=" + key);

			} else {

				if (functionTables.containsKey("fun_" + funcToCall)) {
					funcToCallTable = functionTables.get("fun_" + funcToCall);
					functionToCallVarDescriptor = symbolTable.get("fun_" + funcToCall);
				} else {
					System.out.println("La funzione " + funcToCall + " da chiamare non esiste!");
					return;
				}
				// senza this cerco la funzione a livello globale

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
					String argName = args.get(j);

					if (localTable.containsKey(argName)) {
						VarDescriptor vd = localTable.get(argName);
						args.set(j, vd.value);
						argsVd.add(vd);
					} else if (!localTable.containsKey(argName) && classTable.containsKey(argName)) {
						VarDescriptor vd = classTable.get(argName);
						args.set(j, vd.value);
						argsVd.add(vd);
					} else if (symbolTable.containsKey(argName) && !localTable.containsKey(argName)
							&& !classTable.containsKey(argName)) {
						VarDescriptor vd = symbolTable.get(argName);
						args.set(j, vd.value);
						argsVd.add(vd);
					} else {
						System.out.println(
								"Il parametro " + argName + " passato nella chiamata di funzione non esiste!");
						return;
					}
				}

				// stampa del valore degli argomenti nella chiamata
				for (String value : args) {
					System.out.println(value);
				}

				// per ogni argomento controlla se il tipo corrisponde con quello del parametro
				// corrispondente e in caso positivo assegna il valore
				for (VarDescriptor vdInput : argsVd) {
					String paramName = params.get(i);

					// VarDescriptor del parametro della funzione
					VarDescriptor vdParam = funcToCallTable.get(paramName);

					if (!vdInput.varType.equals(vdParam.varType)) {
						System.out.println(
								"Il tipo dell'argomento non corrisponde al tipo del parametro della funzione!");
						return;
					} else {
						vdParam.value = vdInput.value;
						funcToCallTable.put(vdParam.varName, vdParam);
					}
					i++;
				}

			} else {
				System.out.println(
						"Il numero degli argomenti non corrisponde al numero dei parametri della funzione");
			}
		} else if (className == null && functionName != null) {

			String fn = functionName.getText();

			if (functionTables.containsKey("fun_" + funcToCall)) {

				// tabella della funzione da chiamare
				Hashtable<String, VarDescriptor> funcToCallTable = functionTables.get("fun_" +
						funcToCall);

				Hashtable<String, VarDescriptor> localTable = functionTables.get("fun_" +
						fn);

				// VarDescriptor della funzione da chiamare
				VarDescriptor functionToCallVarDescriptor = symbolTable.get("fun_" + funcToCall);

				int numParams = functionToCallVarDescriptor.getNumParams();
				Vector<String> params = functionToCallVarDescriptor.getParams();

				System.out.println("N parametri: " + numParams);

				// controllo se il numero degli argomenti della chiamata è uguale al numero dei
				// parametri della funzione
				if (args.size() == numParams) {
					int i = 0;

					// recupero i valori delle variabili nella chiamata
					for (int j = 0; j < args.size(); j++) {
						String argName = args.get(j);

						if (localTable.containsKey(argName)) {
							VarDescriptor vd = localTable.get(argName);
							args.set(j, vd.value);
							argsVd.add(vd);
						} else if (symbolTable.containsKey(argName) && !localTable.containsKey(argName)) {
							VarDescriptor vd = symbolTable.get(argName);
							args.set(j, vd.value);
							argsVd.add(vd);
						} else {
							System.out.println(
									"Il parametro " + argName + " passato nella chiamata di funzione non esiste!");
							return;
						}
					}

					// stampa del valore degli argomenti nella chiamata
					for (String value : args) {
						System.out.println(value);
					}

					// per ogni argomento controlla se il tipo corrisponde con quello del parametro
					// corrispondente e in caso positivo assegna il valore
					for (VarDescriptor vdInput : argsVd) {
						String paramName = params.get(i);

						// VarDescriptor del parametro della funzione
						VarDescriptor vdParam = funcToCallTable.get(paramName);

						if (!vdInput.varType.equals(vdParam.varType)) {
							System.out.println(
									"Il tipo dell'argomento non corrisponde al tipo del parametro della funzione!");
							return;
						} else {
							vdParam.value = vdInput.value;
							funcToCallTable.put(vdParam.varName, vdParam);
						}
						i++;
					}

				} else {
					System.out.println(
							"Il numero degli argomenti non corrisponde al numero dei parametri della funzione");
				}

			}
		} else if (className != null && functionName == null) {

			String cn = className.getText();

			System.out.println("PEZZI : " + funcToCall);

			String[] splitted = funcToCall.split("\\.");

			System.out.println(Arrays.toString(splitted));

			Hashtable<String, VarDescriptor> funcToCallTable = new Hashtable<String, VarDescriptor>();

			// VarDescriptor della funzione da chiamare
			VarDescriptor functionToCallVarDescriptor = new VarDescriptor("", "");

			Hashtable<String, VarDescriptor> localTable = functionTables.get("cl_" + cn);

			// tabella della funzione da chiamare
			// con this cerco la funzione solo dentro la classe
			if (splitted[0].equals("this") && splitted.length == 2) {
				System.out.println("LOCAL METHOD");
				String key = cn + "." + splitted[1];

				if (functionTables.containsKey(key)) {
					funcToCallTable = functionTables.get(key);
					functionToCallVarDescriptor = localTable.get("fun_" + splitted[1]);
				} else {
					System.out.println("Il metodo " + splitted[1] + " non esiste!");
					return;
				}
				System.out.println("key=" + key);

			} else {

				if (functionTables.containsKey("fun_" + funcToCall)) {
					funcToCallTable = functionTables.get("fun_" + funcToCall);
					functionToCallVarDescriptor = symbolTable.get("fun_" + funcToCall);
				} else {
					System.out.println("La funzione " + funcToCall + " da chiamare non esiste!");
					return;
				}
				// senza this cerco la funzione a livello globale

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
					String argName = args.get(j);

					if (localTable.containsKey(argName)) {
						VarDescriptor vd = localTable.get(argName);
						args.set(j, vd.value);
						argsVd.add(vd);
					} else if (symbolTable.containsKey(argName) && !localTable.containsKey(argName)) {
						VarDescriptor vd = symbolTable.get(argName);
						args.set(j, vd.value);
						argsVd.add(vd);
					} else {
						System.out.println(
								"Il parametro " + argName + " passato nella chiamata di funzione non esiste!");
						return;
					}
				}

				// stampa del valore degli argomenti nella chiamata
				for (String value : args) {
					System.out.println(value);
				}

				// per ogni argomento controlla se il tipo corrisponde con quello del parametro
				// corrispondente e in caso positivo assegna il valore
				for (VarDescriptor vdInput : argsVd) {
					String paramName = params.get(i);

					// VarDescriptor del parametro della funzione
					VarDescriptor vdParam = funcToCallTable.get(paramName);

					if (!vdInput.varType.equals(vdParam.varType)) {
						System.out.println(
								"Il tipo dell'argomento non corrisponde al tipo del parametro della funzione!");
						return;
					} else {
						vdParam.value = vdInput.value;
						funcToCallTable.put(vdParam.varName, vdParam);
					}
					i++;
				}

			} else {
				System.out.println(
						"Il numero degli argomenti non corrisponde al numero dei parametri della funzione");
			}

		} else {

			if (functionTables.containsKey("fun_" + funcToCall)) {

				// tabella della funzione
				Hashtable<String, VarDescriptor> localTable = functionTables.get("fun_" +
						funcToCall);

				// VarDescriptor della funzione
				VarDescriptor functionVarDescriptor = symbolTable.get("fun_" + funcToCall);

				int numParams = functionVarDescriptor.getNumParams();
				Vector<String> params = functionVarDescriptor.getParams();

				System.out.println("N parametri: " + numParams);

				// controllo se il numero degli argomenti della chiamata è uguale al numero dei
				// parametri della funzione
				if (args.size() == numParams) {
					int i = 0;

					// recupero i valori delle variabili nella chiamata
					for (int j = 0; j < args.size(); j++) {
						String argName = args.get(j);

						if (symbolTable.containsKey(argName)) {
							VarDescriptor vd = symbolTable.get(argName);
							args.set(j, vd.value);
							argsVd.add(vd);
						} else {
							System.out.println(
									"Il parametro " + argName + " passato nella chiamata di funzione non esiste!");
							return;
						}
					}

					// stampa del valore degli argomenti nella chiamata
					for (String value : args) {
						System.out.println(value);
					}

					// per ogni argomento controlla se il tipo corrisponde con quello del parametro
					// corrispondente e in caso positivo assegna il valore
					for (VarDescriptor vdInput : argsVd) {
						String paramName = params.get(i);

						// VarDescriptor del parametro della funzione
						VarDescriptor vdParam = localTable.get(paramName);

						if (!vdInput.varType.equals(vdParam.varType)) {
							System.out.println(
									"Il tipo dell'argomento non corrisponde al tipo del parametro della funzione!");
							return;

						} else {
							vdParam.value = vdInput.value;
							localTable.put(vdParam.varName, vdParam);
						}
						i++;
					}

				} else {
					System.out.println(
							"Il numero degli argomenti non corrisponde al numero dei parametri della funzione");
				}
			}
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