package com.malt.grammar.compiler.util;

import java.util.Hashtable;

public class ParserResult {
    public String parserResult;
    public Hashtable<String, VarDescriptor> globalTable;
    public Hashtable<String, Hashtable<String, VarDescriptor>> localTables;

    public ParserResult() {
        this.parserResult = "";
        this.globalTable = new Hashtable<>();
        this.localTables = new Hashtable<>();
    }

    public ParserResult(String parserResult, Hashtable<String, VarDescriptor> globalTable,
            Hashtable<String, Hashtable<String, VarDescriptor>> localTables) {

        this.parserResult = parserResult;
        this.globalTable = globalTable;
        this.localTables = localTables;
    }
}
