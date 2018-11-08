/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teiva
 */
public class Catalogue {
    
        private String article;
	private String prix;
	
	
	public Catalogue(String article, String prix) {
		this.article = article;
		this.prix = prix;
		
	}

	public Catalogue(Catalogue c) {
		article = c.article;
		prix = c.prix;
		
	}
	
	public Catalogue() {
		// TODO Auto-generated constructor stub
	}
	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public void afficher(){
	System.out.println("les articles :"+article);
        System.out.println("Prix :"+prix);
    }
    
}
