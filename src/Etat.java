/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teiva
 */
public class Etat {
    
       private int id;
	private String libelle;
	private int date;
	private int heure;

	public Etat(int id,String libelle, int date, int heure) {
		this.id = id;
		this.libelle = libelle;
		this.date = date;
		this.heure = heure;	
		
	}
public Etat(Etat e) {
	id = e.id;
	libelle = e.libelle;
	date = e.date;
	heure =e.heure;
}

public Etat() {
	// TODO Auto-generated constructor stub
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getHeure() {
		return heure;
	}

	public void setHeure(int heure) {
		this.heure = heure;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}
    
        public void afficher(){
            System.out.println("La commande est"+libelle);
            System.out.println("La commande à été faite le"+date);
            System.out.println("Commandé à"+heure);
        }
        
}
