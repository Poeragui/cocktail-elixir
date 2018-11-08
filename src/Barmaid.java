/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teiva
 */
public class Barmaid {
    
    private String name;
	
	public Barmaid(String name) {
		this.name = name;
	}
	
	public Barmaid(Barmaid b) {
		name = b.name;
	}

	public Barmaid() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
        public void afficher(){
            System.out.println("Barmaid :"+name );
            
        }
        
}
