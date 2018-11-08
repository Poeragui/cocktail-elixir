/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teiva
 */
public class Client {
    
    private int numero;
	
	
    public Client(int numero) {
	this.numero = numero;
}	
	public Client(Client c) {
		numero = c.numero;
	}
	public Client() {
		// TODO Auto-generated constructor stub
	}
	

    public int getNumero() {
	return numero;
}


public void setNumero(int numero) {
	this.numero = numero;
}
    
public void afficher(){
    System.out.println("numero de client"+numero);
}

}
