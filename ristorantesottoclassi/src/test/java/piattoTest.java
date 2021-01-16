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
public class piattoTest {
    
    public piattoTest() {
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
     * Test of addingredienti method, of class piatto.
     */
    @org.junit.Test
    public void testAddingredienti() {
        System.out.println("addingredienti");
        Ingredienti i = new Ingredienti("maiale", 1, 20.0);
        piatto instance =new piatto("maiale arrosto","secondo");
        instance.addingredienti(i);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of removeingredienti method, of class piatto.
     */
    @org.junit.Test
    public void testRemoveingredienti() {
        System.out.println("removeingredienti");
        int i = 0;
        piatto instance = 0;
        instance.removeingredienti(i);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of sommmaingredienti method, of class piatto.
     */
    @org.junit.Test
    public void testSommmaingredienti() {
        System.out.println("sommmaingredienti");
        piatto instance = new piatto("maiale arrosto","secondo");
        double expResult = 20.0;
        double result = instance.sommmaingredienti();
        assertEquals(expResult, result, 20.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
