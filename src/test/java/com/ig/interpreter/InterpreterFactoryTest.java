/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ig.interpreter;

import com.ig.interpreter.api.Intrepreter;
import com.ig.interpreter.api.IntrepreterFactory;
import com.ig.interpreter.api.impl.GCFCommander;
import com.ig.interpreter.api.impl.LineCounterCommander;
import com.ig.interpreter.api.impl.UniqueWordsCounterCommander;
import static org.hamcrest.CoreMatchers.instanceOf;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author ilkinabdullayev
 */
@RunWith(MockitoJUnitRunner.class)
public class InterpreterFactoryTest {
    
    @Spy
    private IntrepreterFactory spyFactory;
    
    
    @Test
    public void testGCDIntrepreterType() {
        Intrepreter intrepreter = spyFactory.getIntrepreter("gcf 3 2");
        assertThat(intrepreter, instanceOf(GCFCommander.class));
    }
   
    
    @Test
    public void testUWDIntrepreterType() {
        Intrepreter intrepreter = spyFactory.getIntrepreter("uwc test.txt");
        assertThat(intrepreter, instanceOf(UniqueWordsCounterCommander.class));
    }
    
    
    @Test
    public void testLCIntrepreterType() {
        Intrepreter intrepreter = spyFactory.getIntrepreter("lc test2.txt");
        assertThat(intrepreter, instanceOf(LineCounterCommander.class));
    }
    
}
