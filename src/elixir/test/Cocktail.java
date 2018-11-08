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
public class Cocktail {
      int prix;
      String name;

    public Cocktail(String name, int prix) {
        this.name = name;
        this.prix = prix;
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
}
