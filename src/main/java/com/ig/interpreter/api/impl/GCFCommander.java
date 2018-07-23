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
public class GCFCommander implements Intrepreter {

    private int firstNumber;
    private int secondNumber;

    public GCFCommander(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public int run() {
        return findGCD(firstNumber, secondNumber);
    }
    
    private int findGCD(int number1, int number2) { 
        if(number2 == 0){ 
            return number1;
        } 
        
        return findGCD(number2, number1%number2);
    }

}
