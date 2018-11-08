/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teiva
 */
public class Cas_utilisation {
    
    private int liste_table;
	private int liste_client;
	private String barmaid;
	private String serveur;
	
	
	//constructeur par argument
	public Cas_utilisation(int liste_table, int liste_client, String barmaid, String serveur) {
		this.liste_table = liste_table;
		this.liste_client = liste_client;
		this.barmaid = barmaid;
		this.serveur = serveur;
		
	}

	//constructeur par copie
	public Cas_utilisation(Cas_utilisation r) {
		liste_table = r.liste_table;
		liste_client = r.liste_client;
		barmaid = r.barmaid;
		serveur = r.serveur;
	}
	//constructeur par defaut
	public Cas_utilisation() {
		// TODO Auto-generated constructor stub
	}
	
	public int getListe_table() {
		return liste_table;
	}

	public void setListe_table(int liste_table) {
		this.liste_table = liste_table;
	}

	public int getListe_client() {
		return liste_client;
	}

	public void setListe_client(int liste_client) {
		this.liste_client = liste_client;
	}

	public String getBarmaid() {
		return barmaid;
	}

	public void setBarmaid(String barmaid) {
		this.barmaid = barmaid;
	}

	public String getServeur() {
		return serveur;
	}

	public void setServeur(String serveur) {
		this.serveur = serveur;
	}
	public void afficher() {
		System.out.println("");
	}
    
}
