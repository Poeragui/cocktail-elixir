/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teiva
 */
public class Table {
    
    private int numero;
	
	//constructor
	public Table(int numero) {
		this.numero = numero;
	}
	
	public Table(Table t) {
		numero = t.numero;
	}
	
	public Table() {
		// TODO Auto-generated constructor stub
	}
	
	// Get; Set
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
    
        public void afficher(){
            System.out.println("Le numero de la table "+numero);
        }
}
