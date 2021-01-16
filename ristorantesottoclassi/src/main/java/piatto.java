
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc
 */
public class piatto {
    
private String nome;
private String tipo;
    Vector<Ingredienti> ingredienti;

    public piatto(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        ingredienti=new Vector <Ingredienti> ();
    }

    public void addingredienti(Ingredienti i)
    {
      ingredienti.addElement(i); 
    }
    public void removeingredienti(int i)
    {
        ingredienti.removeElementAt(i);
    }
    
    public double sommmaingredienti()
    {
                                     /* si crea una variabile di tipo ingrediente dove vengono salvate le informazioni
        
                                            dopo con il  get si prende il dato e si somma al totale
        
       */
       Ingredienti m= new Ingredienti("", 0, 0.0);
       double totale =0.0;
    for(int i=0; i<ingredienti.size(); i++)
    {
          m=(Ingredienti) ingredienti.elementAt(i);
            totale=totale + m.getcosto();
    }
    
    return  totale;
}
   
}
