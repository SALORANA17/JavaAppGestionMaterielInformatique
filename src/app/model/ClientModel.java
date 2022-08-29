package app.model;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;        
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientModel extends ConnexionDB{
   
    
    public boolean ajouterClient(InformationClient client){
        PreparedStatement ps = null;
        Connection connexion = getConnexion();
        String sql = "INSERT INTO client (NumClient,NomClient,Adresse) VALUES (?,?,?)";
        
        try{
            ps = connexion.prepareStatement(sql);
            ps.setString(1,client.getNumCli());
            ps.setString(2,client.getNomCli());
            ps.setString(3,client.getAdrCli());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    
    public ArrayList<InformationClient> listerClient(){
        
        ArrayList listClient = new ArrayList();
        InformationClient client;
        String sql = "SELECT * FROM client";
        
        try{
            Connection connexion = getConnexion();
            PreparedStatement ps = connexion.prepareStatement(sql);
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
    
    public ArrayList<InformationClient> rechercherClientByNum(String search ){
        
        ArrayList listClient = new ArrayList();
        InformationClient client;
        String sql = "SELECT * FROM client WHERE NumClient LIKE ?";
        
        try{
            Connection connexion = getConnexion();
            PreparedStatement ps = connexion.prepareStatement(sql);
            ps.setString(1,"%"+search+"%");
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
    
    public ArrayList<InformationClient> rechercherClientByNom(String search ){
        
        ArrayList listClient = new ArrayList();
        InformationClient client;
        String sql = "SELECT * FROM client WHERE NomClient LIKE ?";
        
        try{
            Connection connexion = getConnexion();
            PreparedStatement ps = connexion.prepareStatement(sql);
            ps.setString(1,"%"+search+"%");
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
    
    public boolean modifierClient(InformationClient client){
        PreparedStatement ps = null;
        Connection connexion = getConnexion();
        String sql = "UPDATE client SET NomClient=?,Adresse=? WHERE NumClient=?";
        
        try{
            ps = connexion.prepareStatement(sql);
            ps.setString(1,client.getNomCli());
            ps.setString(2,client.getAdrCli());
            ps.setString(3,client.getNumCli());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    
    public boolean supprimerClient(InformationClient client){
        PreparedStatement ps = null;
        Connection connexion = getConnexion();
        String sql = "DELETE FROM client WHERE NumClient=?";
        
        try{
            ps = connexion.prepareStatement(sql);    
            ps.setString(1,client.getNumCli());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }

    
}
