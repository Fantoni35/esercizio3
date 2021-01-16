/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Vector;
/**
 *
 * @author Pc
 */
public class ristorante {
    
    Vector <piatto> piatti;
    Vector <ordine> ordine;
    
    public ristorante() {
        piatti=new Vector<piatto>();
        ordine= new Vector<ordine>();
    }

    public Vector<piatto> getpiatti() {
        return piatti;
    }

    public Vector<ordine> getordine() {
        return ordine;
    }

    public void setpiatti(Vector<piatto> piatti) {
        this.piatti = piatti;
    }

    public void setordine(Vector<ordine> ordine) {
        this.ordine = ordine;
    }
    
      public void addpiatto(piatto i)
    {
      piatti.addElement(i); 
    }
    public void removepiatto(piatto i)
    {
        piatti.removeElement(i);
    }
    

    
    
    public double sommagiornaliera()
    {
        double tot=0.0;
        ordine m= new ordine(0,"" );
        for(int i=0; i< ordine.size();i++)
        {
        m=(ordine) ordine.elementAt(i);
        m.sommaordine();
        tot= tot +   m.sommaordine();
        }
        return tot;
    }
}