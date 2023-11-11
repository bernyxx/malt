package com.malt.grammar.compiler.util;

import java.util.Hashtable;

public class ParserResult {
    public String parserResult;
    public Hashtable<String, VarDescriptor> globalTable;
    public Hashtable<String, Hashtable<String, VarDescriptor>> functionsTable;

    public ParserResult() {
        this.parserResult = "";
        this.globalTable = new Hashtable<>();
        this.functionsTable = new Hashtable<>();
    }

    public ParserResult(String parserResult, Hashtable<String, VarDescriptor> globalTable,
            Hashtable<String, Hashtable<String, VarDescriptor>> functionsTable) {

        this.parserResult = parserResult;
        this.globalTable = globalTable;
        this.functionsTable = functionsTable;
    }
}
