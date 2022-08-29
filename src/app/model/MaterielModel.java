package app.model;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MaterielModel extends ConnexionDB{
    
    public boolean ajouterMateriel(InformationMateriel materiel){
        PreparedStatement ps = null;
        Connection connexion = getConnexion();
        String sql = "INSERT INTO materiel (NumMat,Design,PU,Stock) VALUES (?,?,?,?)";
        
        try{
            ps = connexion.prepareStatement(sql);
            ps.setString(1,materiel.getNumMateriel());
            ps.setString(2,materiel.getDesign());
            ps.setDouble(3,materiel.getPrixU());
            ps.setInt(4,materiel.getStock());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    
    public ArrayList<InformationMateriel> listerMateriel(){
        
        ArrayList listMateriel = new ArrayList();
        InformationMateriel materiel;
        String sql = "SELECT * FROM materiel ";
        
        try{
            Connection connexion = getConnexion();
            PreparedStatement ps = connexion.prepareStatement(sql);
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
    
    public ArrayList<InformationMateriel> rechercherMaterieltByNum(String search ){
        
        ArrayList listMateriel = new ArrayList();
        InformationMateriel materiel;
        String sql = "SELECT * FROM materiel WHERE NumMat LIKE ?";
        
        try{
            Connection connexion = getConnexion();
            PreparedStatement ps = connexion.prepareStatement(sql);
            ps.setString(1,"%"+search+"%");
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
    
    public ArrayList<InformationMateriel> rechercherMaterielByDesign(String search ){
        
        ArrayList listMateriel = new ArrayList();
        InformationMateriel materiel;
        String sql = "SELECT * FROM materiel WHERE Design LIKE ?";
        
        try{
            Connection connexion = getConnexion();
            PreparedStatement ps = connexion.prepareStatement(sql);
            ps.setString(1,"%"+search+"%");
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
    
    public boolean modifierMateriel(InformationMateriel materiel){
        PreparedStatement ps = null;
        Connection connexion = getConnexion();
        String sql = "UPDATE materiel SET Design=?,PU=?,Stock=? WHERE NumMat=?";
        
        try{
            ps = connexion.prepareStatement(sql);
            ps.setString(1,materiel.getDesign());
            ps.setDouble(2,materiel.getPrixU());
            ps.setInt(3,materiel.getStock());
            ps.setString(4,materiel.getNumMateriel());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    
    public boolean supprimerMateriel(InformationMateriel materiel){
        PreparedStatement ps = null;
        Connection connexion = getConnexion();
        String sql = "DELETE FROM materiel WHERE NumMat=?";
        
        try{
            ps = connexion.prepareStatement(sql);    
            ps.setString(1,materiel.getNumMateriel());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    
}
