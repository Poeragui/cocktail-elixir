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
public class Table {
    
    private int numero;
    
    //Constructeur 
    public Table (int unNumero){
        numero = unNumero;
    }
    
     // getter et Setter
    public void getNumero (int  monNumero) {
        monNumero = numero;
    }
    
    public void setNumero (int unNumero) {
        numero = unNumero;
    }
    
    //Afficher
    public void afficher(){
        System.out.println(numero);
    }
}
