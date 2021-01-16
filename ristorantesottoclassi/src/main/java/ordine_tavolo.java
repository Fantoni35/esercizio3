/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc
 */
public class ordine_tavolo extends ordine{
        private String nomecameriere;
 public ordine_tavolo(int numeroidentita,String nomecameriere) {
         super(numeroidentita,nomecameriere);
      this.nomecameriere=nomecameriere;
 }
   public double sommaordine()
    { double prezzo=0;
        piatto m= new piatto("","");
        for(int i=0; i<ordine.size();i++)
        {
            m=(piatto) ordine.elementAt(i);
            m.sommmaingredienti();
            
             prezzo= prezzo + m.sommmaingredienti();
        }
       return  prezzo;
    }
 
}
