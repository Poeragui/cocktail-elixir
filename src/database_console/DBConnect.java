/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_console;

import java.sql.*;
import java.sql.Connection;

/**
 *
 * @author Poesh
 */
public class DBConnect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Connection cnx= connecterDB();
    }
    public static Connection connecterDB(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver oki");   
            String url="jdbc:mysql://localhost:80/cocktail_elixir";
            String user="Poe";
            String password="lol";
            Connection cnx=DriverManager.getConnection(url,user,password);
            System.out.println("Connexion bien établie");
            return cnx;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        
    }
    
}
