package app.model;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;

public class LoginModel{
    
    
    public boolean connectInApp(InformationRegister register){
        Connection connexion = new ConnexionDB().getConnexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
  
        String sql = "SELECT * FROM utilisateur WHERE Pseudo = ? AND MotDePasse = ? ";
        
        try{
            ps = connexion.prepareStatement(sql);
            ps.setString(1, register.getUsername());
            ps.setString(2, register.getPassword());
            rs = ps.executeQuery();
            
            if(rs.next()){
               register.setId(Integer.parseInt(rs.getString("NumUtilisateur")));
               register.setUsername(rs.getString("Pseudo"));
               register.setPassword(rs.getString("MotDePasse"));
                
               return true;
            }
            
            return false;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
        
    }
}
