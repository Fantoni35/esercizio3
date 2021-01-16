/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class ordine_tavoloTest {
    
    public ordine_tavoloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sommaordine method, of class ordine_tavolo.
     */
    @org.junit.Test
    public void testSommaordine() {
        System.out.println("sommaordine");
        ordine_tavolo instance =  new ordine_tavolo(345,"Gino");;
        double expResult = 20.0;
        double result = instance.sommaordine();
        assertEquals(expResult, result, 20.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
