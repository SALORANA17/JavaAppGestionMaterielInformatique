package app.model;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class RegisterModel extends ConnexionDB {
    public boolean saveRegister(InformationRegister register){
        PreparedStatement ps = null;
        Connection connexion = getConnexion();
        
        String sql = "INSERT INTO utilisateur(Pseudo,MotDePasse) VALUES (?,?)";
        
        try{
            ps = connexion.prepareStatement(sql);
            ps.setString(1, register.getUsername());
            ps.setString(2, register.getPassword());
            ps. execute();
            
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
        
    }
}
