/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elixir.test;

import java.util.Scanner;

/**
 *
 * @author NIUAITI
 */
public class Client {
  
  private String nomClient;

  public Client(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Entré votre nom : ");
    String str = sc.nextLine();
  }

  //Retourne le nom du client
  public String getNom(){
    return nomClient;
  }

  //Définit le nom du client
  public void setNom(String pNom){
    nomClient = pNom;
  }
}
