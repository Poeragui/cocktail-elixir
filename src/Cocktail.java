/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teiva
 */
public class Cocktail {
    
    

	private String name;
	private int prix;
	
	
	public Cocktail(String name, int prix) {
		this.name = name;
		this.prix = prix;
	}
	
	public Cocktail(Cocktail c) {
		name = c.name;
		prix = c.prix;
	}
	
	public Cocktail() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	public void afficher(){
            System.out.println("Votre cocktail est :"+name);
            System.out.println("le prix :"+prix);
        }
}
    

