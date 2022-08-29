package app.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnexionDB {
    private final String nameBase = "db_gestion_materiel_informatique";
    private final String user = "root";
    private final String password = "";
    private final String host = "localhost";
    private final String port = "3308";
    private Connection connect = null;
    
    public ConnexionDB(){
        try{ 
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+nameBase+"?serverTimezone=UTC",user,password);
            
            /*if(connect != null){
                System.out.println("Connexion établie à la base");
            }*/

        }catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnexionDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection getConnexion(){
        return connect;
    }
    
   
}
