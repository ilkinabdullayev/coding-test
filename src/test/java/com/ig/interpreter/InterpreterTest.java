package com.ig.interpreter;

import com.ig.interpreter.api.Intrepreter;
import com.ig.interpreter.api.IntrepreterFactory;
import com.ig.interpreter.api.impl.GCFCommander;
import com.ig.interpreter.api.impl.LineCounterCommander;
import com.ig.interpreter.api.impl.UniqueWordsCounterCommander;
import java.io.File;
import static org.hamcrest.CoreMatchers.instanceOf;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import org.junit.Before;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Unit test for simple App.
 */
@RunWith(MockitoJUnitRunner.class)
public class InterpreterTest {

    @Mock
    private IntrepreterFactory intrepreterFactory;
       
    
    @Test
    public void testTwoNumbersGCF() {
       when(intrepreterFactory.getIntrepreter(null)).thenReturn(new GCFCommander(10, 5));
       
       Intrepreter gcfCommander = intrepreterFactory.getIntrepreter(null);
       int result = gcfCommander.run();
       int expected = 5;
       
       assertEquals(result, expected);
    }
   
    
    @Test
    public void testFileUWD() {
       ClassLoader classLoader = getClass().getClassLoader();
       File file = new File("src/test/resources/test.txt");
       when(intrepreterFactory.getIntrepreter(null)).thenReturn(new UniqueWordsCounterCommander(file));
       
       Intrepreter uwcCommander = intrepreterFactory.getIntrepreter(null);
       int result = uwcCommander.run();
       int expected = 5;
       
       assertEquals(result, expected);
    }
    
    
     @Test
    public void testFileLC() {
       ClassLoader classLoader = getClass().getClassLoader();
       File file = new File("src/test/resources/test.txt");
       when(intrepreterFactory.getIntrepreter(null)).thenReturn(new LineCounterCommander(file));
       
       Intrepreter uwcCommander = intrepreterFactory.getIntrepreter(null);
       int result = uwcCommander.run();
       int expected = 2;
       
       assertEquals(result, expected);
    }
}
