/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elixir.test;

/**
 *
 * @author NIUAITI
 */
public class Commande {
    private int numero;
    private int prix;
    
    //constructeur par argument
    public Commande(int numero, int prix) {
        this.numero = numero;
        this.prix = prix;
    }
    
    //constructeur par default
    public Commande() {
        // TODO Auto-generated constructor stub
    }
    
    //constructeur par copie 
    public Commande(Commande c) {
        numero = c.numero;
        prix = c.prix;
    }
        
    // getter et setter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
    
    //Afficher
    public static void afficher() {
        System.out.println("numero" + "prix");
    }
}
