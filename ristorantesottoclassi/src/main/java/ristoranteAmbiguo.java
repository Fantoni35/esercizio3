/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc
 */
public class ristoranteAmbiguo{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        piatto puno= new piatto("maiale arrosto","secondo");
        piatto pdue= new piatto("bistecca","secondo");
        Ingredienti uno= new Ingredienti("maiale", 1, 20.0);
        Ingredienti due= new Ingredienti("manzo",1,30.0);
        ristorante r1= new ristorante();
        ordine ouno= new ordine(1234,"Beppe");
        ordine odue= new ordine(1226,"Francesco");
        ordine_domicilio duno= new ordine_domicilio(123,20,"via roma");
        ordine_tavolo tuno= new ordine_tavolo(345,"Gino");
        puno.addingredienti(uno);
        pdue.addingredienti(due);
        
        r1.addpiatto(puno);
        r1.addpiatto(pdue);
        
        ouno.addpiatto(puno);
        odue.addpiatto(pdue);
        
        
       
    }
    
}