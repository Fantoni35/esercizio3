/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Vector;
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
public class ristoranteTest {
    
    public ristoranteTest() {
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
     * Test of getpiatti method, of class ristorante.
     */
    @org.junit.Test
    public void testGetpiatti() {
        System.out.println("getpiatti");
        ristorante instance = new ristorante();
        Vector<piatto> expResult = null;
        Vector<piatto> result = instance.getpiatti();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getordine method, of class ristorante.
     */
    @org.junit.Test
    public void testGetordine() {
        System.out.println("getordine");
        ristorante instance = new ristorante();
        Vector<ordine> expResult = null;
        Vector<ordine> result = instance.getordine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setpiatti method, of class ristorante.
     */
    @org.junit.Test
    public void testSetpiatti() {
        System.out.println("setpiatti");
        Vector<piatto> piatti = null;
        ristorante instance = new ristorante();
        instance.setpiatti(piatti);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setordine method, of class ristorante.
     */
    @org.junit.Test
    public void testSetordine() {
        System.out.println("setordine");
        Vector<ordine> ordine = null;
        ristorante instance = new ristorante();
        instance.setordine(ordine);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of addpiatto method, of class ristorante.
     */
    @org.junit.Test
    public void testAddpiatto() {
        System.out.println("addpiatto");
        piatto i = new piatto("maiale arrosto","secondo");;
        ristorante instance = new ristorante();
        instance.addpiatto(i);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of removepiatto method, of class ristorante.
     */
    @org.junit.Test
    public void testRemovepiatto() {
        System.out.println("removepiatto");
        piatto i = new piatto("maiale arrosto","secondo");
        ristorante instance = new ristorante();
        instance.removepiatto(i);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of sommagiornaliera method, of class ristorante.
     */
    @org.junit.Test
    public void testSommagiornaliera() {
        System.out.println("sommagiornaliera");
        ristorante instance = new ristorante();
        double expResult = 0.0;
        double result = instance.sommagiornaliera();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
