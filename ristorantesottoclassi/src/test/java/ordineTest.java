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
public class ordineTest {
    
    public ordineTest() {
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
     * Test of addpiatto method, of class ordine.
     */
    @org.junit.Test
    public void testAddpiatto() {
        System.out.println("addpiatto");
        piatto i = new piatto("maiale arrosto","secondo");
        ordine instance = new ordine(1234,"Beppe");
        instance.addpiatto(i);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of removepiatto method, of class ordine.
     */
    @org.junit.Test
    public void testRemovepiatto() {
        System.out.println("removepiatto");
        piatto i = new piatto("maiale arrosto","secondo");
        ordine instance = new ordine(1234,"Beppe");
        instance.removepiatto(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sommaordine method, of class ordine.
     */
    @org.junit.Test
    public void testSommaordine() {
        System.out.println("sommaordine");
        ordine instance = new ordine(1234,"Beppe");
        double expResult = 20.0;
        double result = instance.sommaordine();
        assertEquals(expResult, result, 20.0);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of confronto method, of class ordine.
     */
    @org.junit.Test
    public void testConfronto() {
        System.out.println("confronto");
        ordine instance = new ordine(1234,"Beppe");
        double expResult = 20.0;
        double result = instance.confronto();
        assertEquals(expResult, result, 20.0);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
