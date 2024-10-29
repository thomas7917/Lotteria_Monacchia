 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author monica ciuchetti
 */
public class Giocatore extends Thread{
    // attributi
    private int idGiocatore;
    private String nomeGiocatore;
    private Estrazione estrazione;
    /**
    * 
    * Metodo costruttore
    * @param idGiocatore codice del giocatore
    * @param estrazione riferimento dell'oggetto Estrazione
    */
    public Giocatore(int idGiocatore, Estrazione estrazione) {
       // inizializzazione attributi
       this.idGiocatore=idGiocatore;
       this.estrazione=estrazione;
    }

    /**
    * 
    * Metodo per eseguire il thread
    */
    @Override
    public void run() {
       // stampa info giocatore
       System.out.println("id" + this.idGiocatore);
       // scelta del numero da giocare
       int numeroScelto=20;
       for (int i=3; i>0; i--){
           System.out.println(i); 
           try {
               this.sleep(1000);
           } catch (InterruptedException ex) {
               Logger.getLogger(Giocatore.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }
       // verifica del risultato
       estrazione.verifica(numeroScelto , idGiocatore);
       // stampa fine verifica
       System.out.println("Il giocatore" + idGiocatore + "con estrazione" +  this.estrazione +   "ha finito di giocare");
    }
}
