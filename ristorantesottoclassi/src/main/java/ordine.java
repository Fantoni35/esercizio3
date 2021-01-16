
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
public class ordine {
    private int numeroidentificativo;
    private double prezzo;
    private String nomecameriere;
    Vector <piatto> ordine;

    public ordine(int numeroidentificativo, String nomecameriere) {
        this.numeroidentificativo = numeroidentificativo;
       this.nomecameriere=nomecameriere;
        ordine= new Vector <piatto>(); 
    }
           public void addpiatto(piatto i)
    {
      ordine.addElement(i); 
    }
    public void removepiatto(piatto i)
    {
        ordine.removeElement(i);
    }
    
    public double sommaordine()
    {
        piatto m= new piatto("","");
        for(int i=0; i<ordine.size();i++)
        {
            m=(piatto) ordine.elementAt(i);
            m.sommmaingredienti();
            
             prezzo= prezzo + m.sommmaingredienti();
        }
       return  prezzo;
    }
    
    public double confronto()
            { 
                double max=0;
                piatto m= new piatto("","");// nn si mette il vettore tra le parentesi 
                for(int i=0;i<ordine.size();i++)
                {
                     m=(piatto) ordine.elementAt(i);
                     m.sommmaingredienti();
                     if(m.sommmaingredienti()>max)
                     {
                         max= m.sommmaingredienti();
                     }
                    
                }
                return max;
            }
}
