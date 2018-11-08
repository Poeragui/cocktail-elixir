/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teiva
 */
public class Commande_detail {
    
    private int quantite;
	private int prix;
	private int heure;
	private String article;
	
	public Commande_detail(int quantite, int prix, int heure, String article) {
		this.quantite = quantite;
		this.prix = prix;
		this.heure = heure;
		this.article = article;
	}

	public Commande_detail(Commande_detail c) {
		quantite =c.quantite;
		prix = c.prix;
		heure = c.heure;
		article = c.article;
	}
	
	public Commande_detail() {
		// TODO Auto-generated constructor stub
	}
	
	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	public int getHeure() {
		return heure;
	}
	
	public void setHeure(int heure) {
		this.heure = heure;
	}
	
	public String getArticle() {
		return article;
	}
	
	public void setArticle(String article) {
		this.article = article;
	}
    
        public void afficher(){
            System.out.println("Article de votre commande "+article);
            System.out.println("Prix de votre commande "+prix);
            System.out.println("Quantité de la commande "+quantite);
            System.out.println("L'heure de votre commande "+heure);
        }
}
