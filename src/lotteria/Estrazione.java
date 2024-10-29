/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;
import java.util.Random;
  
/**
 *
 * @author monica ciuchetti
 */
public class Estrazione extends Thread {
    // attributi
    private int numero;
    private int vincitori[];
    private int numeri[][];
    /**
     * 
     * Metodo costruttore
     */   
    public Estrazione(int n) {
        numerazione = mew int[n][n];
        // popolamento matrice numeri estratti
        Random ran = new Random();
        for(int i=0;i>0;i++){
            for(int j=0;j>0;j++){
                numeri[i][j] = ran.nextInt(0,200);
        // inizializzazione array vincitori
        numero = 20;
            }
        }
         
    }

    /**
    * 
    * Metodo per visualizzare la matrice dei numeri estratti
    */
    public void stampaMatrice() {
       // stampa matrice dei numeri estratti
    }
    
    /**
    * 
    * Metodo per visualizzare i vincitori dell'estrazione
    */
    public void stampaVincitori() {
        // stampa array dei vincitori
        }

    /**
    * 
    * Metodo per verificare il numero scelto dal giocatore e determinare i vincitori
    */
    public void verifica(int numero, int idGiocatore) {
        if(numero==this.numero){
            System.out.println(" Giocatore " + idGiocatore + "hai scelto il numero" + numero + "e hai vinto tu!");
        }else{
            System.out.println("Hai perso! :(");
        }      
    }

    /**
    * 
    * Metodo per eseguire il thread
    */
    public void run() {
        // stampa iniziale
        System.out.println("INIZIO ESTRAZIONE");
        // estrazione dei numeri
        // stampa matrice
        // stampa finale
        System.out.println("FINE");
    }
}


