/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teiva
 */
public class Serveur {
    
    private String nom;
	private int matricul;
	
	public Serveur(String nom, int matricul) {
		this.nom = nom;
		this.matricul = matricul;
	}
public Serveur() {
	// TODO Auto-generated constructor stub
}
	public Serveur(Serveur s) {
		nom = s.nom;
		matricul = s.matricul;
	}
		
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getMatricul() {
		return matricul;
	}

	public void setMatricul(int matricul) {
		this.matricul = matricul;
	}
    
        public void afficher(){
            System.out.println("nom du serveur "+nom);
            System.out.println("matricule serveur"+matricul);
        }
}
