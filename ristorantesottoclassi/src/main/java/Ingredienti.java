/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc
 */
class Ingredienti {

    private String nomeingredienti;
    private int quantita;
    private double costo;

    public Ingredienti(String nomeingredienti, int quantita, double costo) {
        this.nomeingredienti = nomeingredienti;
        this.quantita = quantita;
        this.costo = costo;
    }

    public String getnomeingredienti() {
        return nomeingredienti;
    }

    public int getquantita() {
        return quantita;
    }

    public double getcosto() {
        return costo;
    }

    public void setnomeingredienti(String nomeingredienti) {
        this.nomeingredienti = nomeingredienti;
    }

    public void setquantita(int quantita) {
        this.quantita = quantita;
    }

    public void setcosto(double costo) {
        this.costo = costo;
    }


   
    
      
}
