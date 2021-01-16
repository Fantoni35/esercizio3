/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class IngredientiTest {
    
    public IngredientiTest() {
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
     * Test of getnomeingredienti method, of class Ingredienti.
     */
    @org.junit.Test
    public void testGetnomeingredienti() {
        System.out.println("getnomeingredienti");
        Ingredienti instance = new Ingredienti("maiale", 1, 20.0);
        String expResult = "maiale";
        String result = instance.getnomeingredienti();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getquantita method, of class Ingredienti.
     */
    @org.junit.Test
    public void testGetquantita() {
        System.out.println("getquantita");
        Ingredienti instance = new Ingredienti("maiale", 1, 20.0);
        int expResult = 1;
        int result = instance.getquantita();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getcosto method, of class Ingredienti.
     */
    @org.junit.Test
    public void testGetcosto() {
        System.out.println("getcosto");
        Ingredienti instance =new Ingredienti("maiale", 1, 20.0); 
        double expResult = 20.0;
        double result = instance.getcosto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setnomeing method, of class Ingredienti.
     */
    @org.junit.Test
    public void testSetnomeingredienti() {
        System.out.println("setnomeingredienti");
        String nomeingredienti = "maiale";
        Ingredienti instance = new Ingredienti("maiale", 1, 20.0);
        instance.setnomeing(nomeingredienti);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setquantita method, of class Ingredienti.
     */
    @org.junit.Test
    public void testSetquantita() {
        System.out.println("setquantita");
        int quantita = 1;
        Ingredienti instance = new Ingredienti("maiale", 1, 20.0);
        instance.setquantita(quantita);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setcosto method, of class Ingredienti.
     */
    @org.junit.Test
    public void testSetcosto() {
        System.out.println("setcosto");
        double costo = 20.0;
        Ingredienti instance = new Ingredienti("maiale", 1, 20.0);
        instance.setcosto(costo);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
