package app.model;


import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;        
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StatModel extends ConnexionDB{
    
    public ArrayList<InformationClient> listerClientByNum(InformationClient client){
        
        ArrayList listClient = new ArrayList();
        String sql = "SELECT * FROM client WHERE NumClient = ?";
        
        try{
            Connection connexion = getConnexion();
            PreparedStatement ps = connexion.prepareStatement(sql);
            ps.setString(1,client.getNumCli());
            ResultSet rs = ps.executeQuery();
            
           while(rs.next()){
               client = new InformationClient();
               client.setNumCli(rs.getString("NumClient"));
               client.setNomCli(rs.getString("NomClient"));
               client.setAdrCli(rs.getString("Adresse"));
               
               listClient.add(client);
               
           }
           
           return listClient;
           
        } catch (SQLException ex) {
            Logger.getLogger(ClientModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
    
  
    public ArrayList<InformationMateriel> listerMaterielByNum(InformationMateriel materiel){
        
        ArrayList listMateriel = new ArrayList();
        String sql = "SELECT * FROM materiel WHERE NumMat = ?";
        
        try{
            Connection connexion = getConnexion();
            PreparedStatement ps = connexion.prepareStatement(sql);
            ps.setString(1,materiel.getNumMateriel());
            ResultSet rs = ps.executeQuery();
            
           while(rs.next()){
               materiel = new InformationMateriel();
               materiel.setNumMateriel(rs.getString("NumMat"));
               materiel.setDesign(rs.getString("Design"));
               materiel.setPrixU(rs.getDouble("PU"));
               
               listMateriel.add(materiel);
               
           }
           
           return listMateriel;
           
        } catch (SQLException ex) {
            Logger.getLogger(ClientModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
    
}
