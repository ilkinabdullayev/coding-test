/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ig.interpreter.api;

/**
 *
 * @author ilkinabdullayev
 */
public enum IntrepreterType {
    
    GCF("gcf", "Greatest Common Factor"),
    UWC("uwc", "Unique Words Counter"),
    LC("lc", "Line Counter"),
    EXIT("exit", "Exit");
    
    private String code;
    private String name;

    private IntrepreterType(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return name;
    }

   
    public static IntrepreterType lookup(String code) {
        if (code == null) {
            return null;
        }
        for (IntrepreterType bs : values()) {
            if(bs.code.equals(code)) {
                return bs;
            }
        }
        throw new IllegalArgumentException("No matching constant for IntrepreterType code =" + code);
    }
    
    public static String getCode(IntrepreterType it) {
        return (it == null) ? null : it.code;
    }
    
}
