package app.model;

import app.controller.CommandeController;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;        
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class AchatModel extends ConnexionDB{
    
    public ArrayList<InformationClient> listerNumClient(){
        
        ArrayList listClient = new ArrayList();
        InformationClient client;
        String sql = "SELECT DISTINCT NumClient FROM achat";
        
        try{
            Connection connexion = getConnexion();
            PreparedStatement ps = connexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
           while(rs.next()){
               client = new InformationClient();
               client.setNumCli(rs.getString("NumClient"));
            
               listClient.add(client);
               
           }
           
           return listClient;
           
        } catch (SQLException ex) {
            Logger.getLogger(ClientModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<InformationMateriel> rechercherInfoArticle(String info){
        
        ArrayList listMateriel = new ArrayList();
        InformationMateriel materiel;
        String sql = "SELECT * FROM materiel WHERE Design = ?";
        
        try{
            Connection connexion = getConnexion();
            PreparedStatement ps = connexion.prepareStatement(sql);
            ps.setString(1,info);
            ResultSet rs = ps.executeQuery();
            
           while(rs.next()){
               materiel = new InformationMateriel();
    
               materiel.setNumMateriel(rs.getString("NumMat"));
               materiel.setDesign(rs.getString("Design"));
               materiel.setPrixU(rs.getDouble("PU"));
               materiel.setStock(rs.getInt("Stock"));
            
               listMateriel.add(materiel);
               
           }
           
           return listMateriel;
           
        } catch (SQLException ex) {
            Logger.getLogger(ClientModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public boolean modifierStockAddVente(InformationMateriel materiel, int qte){
        PreparedStatement ps = null;
        Connection connexion = getConnexion();
        String sql = "UPDATE materiel SET Stock = Stock - ? WHERE Design=?";
        
        try{
            ps = connexion.prepareStatement(sql);
            ps.setInt(1, qte);
            ps.setString(2,materiel.getDesign());
           
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
     
    public boolean modifierStockDeleteVente(InformationMateriel materiel, int qte){
        PreparedStatement ps = null;
        Connection connexion = getConnexion();
        String sql = "UPDATE materiel SET Stock= Stock + ? WHERE Design=?";
        
        try{
            ps = connexion.prepareStatement(sql);
            ps.setInt(1, qte);
            ps.setString(2,materiel.getDesign());
           
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    
    public boolean enregistrerCommande(InformationAchat achat,String facture){
        Connection connexion =  null ;
        String sql = "INSERT INTO achat (NumFact,NumMat,NumClient,Qte,DateAchat) VALUES (?,?,?,?,?)";
        try{
           PreparedStatement ps = null;
           connexion = getConnexion();
           
           ps = connexion.prepareStatement(sql);
           ps.setString(1, facture);
           ps.setString(2, achat.getNumMat());
           ps.setString(3, achat.getNumCli());
           ps.setInt(4, achat.getQte());
           ps.setString(5, achat.getDateAchat());
           
           ps.executeUpdate();

           return true; 
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }

    }
    
    
    
}
