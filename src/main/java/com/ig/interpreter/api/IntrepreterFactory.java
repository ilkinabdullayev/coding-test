/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ig.interpreter.api;

import com.ig.interpreter.api.impl.ExitCommander;
import com.ig.interpreter.api.impl.GCFCommander;
import com.ig.interpreter.api.impl.LineCounterCommander;
import com.ig.interpreter.api.impl.UniqueWordsCounterCommander;
import java.io.File;

/**
 *
 * @author ilkinabdullayev
 */
public class IntrepreterFactory {

    public Intrepreter getIntrepreter(String commands) {
        String[] commandsArray = commands.split(" ");
        IntrepreterType it = IntrepreterType.lookup(commandsArray[0]);
        if (it.equals(IntrepreterType.GCF)) {
            int firstNumber = Integer.parseInt(commandsArray[1]);
            int secondNumber = Integer.parseInt(commandsArray[2]);
            return new GCFCommander(firstNumber, secondNumber);
        }else if (it.equals(IntrepreterType.UWC)) {
            String fileName = commandsArray[1];
            return new UniqueWordsCounterCommander(new File("src/main/resources/"+fileName));
        }else if (it.equals(IntrepreterType.LC)) {
            String fileName = commandsArray[1];
            return new LineCounterCommander(new File("src/main/resources/"+fileName));
        }else if (it.equals(IntrepreterType.EXIT)) {
            return new ExitCommander();
        }

        return null;
    }

}
