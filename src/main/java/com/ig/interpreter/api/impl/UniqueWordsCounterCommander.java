/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ig.interpreter.api.impl;

import com.ig.interpreter.api.Intrepreter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.stream.Stream;

/**
 *
 * @author ilkinabdullayev
 */
public class UniqueWordsCounterCommander implements Intrepreter{
    
    private File file;

    public UniqueWordsCounterCommander(File file) {
        this.file = file;
    }

    @Override
    public int run() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            return (int)bufferedReader
                    .lines()
                    .flatMap(f -> Stream.of(f.split(" ")))
                    .distinct()
                    .count();
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }
    }
    
    
}
