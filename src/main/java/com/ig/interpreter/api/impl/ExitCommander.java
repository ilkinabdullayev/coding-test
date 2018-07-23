/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ig.interpreter.api.impl;

import com.ig.interpreter.api.Intrepreter;

/**
 *
 * @author ilkinabdullayev
 */
public class ExitCommander implements Intrepreter {

    @Override
    public int run() {
       System.exit(0);
       return 0;
    }

}
