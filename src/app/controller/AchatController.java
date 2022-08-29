package app.controller;

import app.component.AchatEditCommande;
import app.component.AchatModalForm;
import app.component.AchatModifyAchat;
import static app.controller.CommandeController.conversionDates;
import app.model.AchatModel;
import app.model.ClientModel;
import app.model.ConnexionDB;
import app.model.InformationAchat;
import app.model.InformationClient;
import app.model.InformationMateriel;
import app.model.MaterielModel;
import app.view.Dashboard;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AchatController implements ActionListener{

    private InformationAchat achat;
    private InformationClient client;
    private Dashboard dashAchat;
    private AchatModel modAchat;
    private ClientModel modCli;
    private MaterielModel modMat;
    private  InformationMateriel materiel;
    private AchatEditCommande frmAchatEdit ; 
    private AchatModifyAchat modalModAchat;
    
    int row;
    String adrCli ;
    String nomCli;
    String numCli ;
    
    
    public AchatController(InformationAchat achat, InformationClient client, Dashboard dashAchat, AchatModel modAchat, ClientModel modCli, MaterielModel modMat, InformationMateriel materiel, AchatModifyAchat modalModAchat) {
        this.achat = achat;
        this.client = client;
        this.dashAchat = dashAchat;
        this.modAchat = modAchat;
        this.modCli = modCli;
        this.modMat = modMat;
        this.materiel = materiel;
        this.modalModAchat = modalModAchat;
        
        this.dashAchat.btnClientCommanderMat.addActionListener(this);
        this.dashAchat.btnReturnClientAchat.addActionListener(this);
        this.dashAchat.btnSearchNomClientStat.addActionListener(this);
        this.dashAchat.btn_achat.addActionListener(this);
        this.dashAchat.btnSearchClient1.addActionListener(this);
        this.dashAchat.btnModifyAchat1.addActionListener(this);
        this.dashAchat.btnDeleteAchat1.addActionListener(this);
        this.modalModAchat.btnModifyCommandeEdit1.addActionListener(this);
        this.modalModAchat.btnAnnulerCommandeEdit1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == dashAchat.btnClientCommanderMat){
            numCli = dashAchat.inputNumClientSearchAchat.getText();
            nomCli = dashAchat.inputNomClientSearchAchat.getText();
            adrCli =dashAchat.inputAdresseClientSearchAchat.getText();
            client = new InformationClient();
            client.setNumCli(numCli);
            client.setNomCli(nomCli);
            client.setAdrCli(adrCli);
            
            AchatModalForm modalAchat = new AchatModalForm(dashAchat,true,client);
            materiel = new InformationMateriel();
            achat = new InformationAchat();
            client = new InformationClient();
            modAchat = new AchatModel();
            modCli = new ClientModel();
            modMat = new MaterielModel();
            frmAchatEdit = new AchatEditCommande(modalAchat,true,null,null,0,0,0);
            CommandeController ctrlCmd = new CommandeController(achat,client,materiel,modalAchat,modAchat,modCli,modMat,frmAchatEdit);
            modalAchat.setVisible(true);

        }
        
        if(e.getSource() == dashAchat.btnReturnClientAchat){
            dashAchat.inputNumClientSearchAchat.setText(null);
            dashAchat.inputNomClientSearchAchat.setText(null);
            dashAchat.inputAdresseClientSearchAchat.setText(null);
            
            dashAchat.btn_client.setBackground(new Color(0,51,102));
        
            dashAchat.panelMain.removeAll();
            dashAchat.panelMain.add(dashAchat.paneClient);
            dashAchat.panelMain.repaint();
            dashAchat.panelMain.revalidate();

            dashAchat.btnSearchNomClientAchat.setVisible(false);
            dashAchat.btnDeleteClient.setVisible(false);
            dashAchat.btnAddClientIcon.setVisible(false);

            dashAchat.btn_stat.setBackground(new Color(0,153,255));
            dashAchat.btn_materiel.setBackground(new Color(0,153,255));
            dashAchat.btn_dashboard.setBackground(new Color(0,153,255));
            dashAchat.btn_achat.setBackground(new Color(0,153,255));

            dashAchat.paneInfoClient.removeAll();
            dashAchat.paneInfoClient.add(dashAchat.paneAddClient);
            dashAchat.paneInfoClient.repaint();
            dashAchat.paneInfoClient.revalidate();
            
            dashAchat.autoIDClient();
        }
        
        if(e.getSource() == dashAchat.btnSearchNomClientStat){
            numCli = dashAchat.inputNumClientSearchAchat.getText();
            nomCli = dashAchat.inputNomClientSearchAchat.getText();
            adrCli =dashAchat.inputAdresseClientSearchAchat.getText();
            
            dashAchat.btn_stat.setBackground(new Color(0,51,102));
        
            dashAchat.panelMain.removeAll();
            dashAchat.panelMain.add(dashAchat.paneStat);
            dashAchat.panelMain.repaint();
            dashAchat.panelMain.revalidate();

            dashAchat.btn_dashboard.setBackground(new Color(0,153,255));
            dashAchat.btn_materiel.setBackground(new Color(0,153,255));
            dashAchat.btn_client.setBackground(new Color(0,153,255));
            dashAchat.btn_achat.setBackground(new Color(0,153,255));
            
            dashAchat.txtNumClientSearchStat.setText(numCli);

            /*AchatModalForm modalAchat = new AchatModalForm(dashAchat,true,client);
            materiel = new InformationMateriel();
            achat = new InformationAchat();
            client = new InformationClient();
            modAchat = new AchatModel();
            modCli = new ClientModel();
            modMat = new MaterielModel();
            frmAchatEdit = new AchatEditCommande(modalAchat,true,null,null,0,0,0);
            CommandeController ctrlCmd = new CommandeController(achat,client,materiel,modalAchat,modAchat,modCli,modMat,frmAchatEdit);
            modalAchat.setVisible(true);*/
        }
        
        if(e.getSource() == dashAchat.btn_achat){
            tableAchat();
        }
        
        if(e.getSource() == dashAchat.btnSearchClient1){
            
            String date = dashAchat.dateChooserCommande.getText();
            String recherche = dashAchat.inputSearchClient1.getText();
             
            DefaultTableModel modelTable = new DefaultTableModel();
                dashAchat.tableClient1.setModel(modelTable);
                modelTable.addColumn("N° Facture");
                modelTable.addColumn("N° Client");
                modelTable.addColumn("Nom");
                modelTable.addColumn("N° Matériel");
                modelTable.addColumn("Designation");
                modelTable.addColumn("Qté");
                modelTable.addColumn("Date");

            
            dashAchat.tableClient1.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 12));
            dashAchat.tableClient1.getTableHeader().setForeground(Color.black);
                
            dashAchat.tableClient1.setRowHeight(30);
            
            
            
            try {
                date = conversionDates("dd-mm-yyyy","yyyy-mm-dd", date);
                
            } catch (ParseException ex) {
                Logger.getLogger(AchatController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String sql = "SELECT NumFact,cli.NumClient,mat.NumMat,NomClient,Design,Qte,DateAchat FROM achat a, client cli, materiel mat"
                + " WHERE (a.NumMat = mat.NumMat) AND (a.NumClient = cli.NumClient) AND DateAchat = ? "
                + " AND (a.NumClient LIKE ? OR cli.NomClient LIKE ? )";

            try{
                ConnexionDB conn = new ConnexionDB();
                Connection connexion = conn.getConnexion();
                PreparedStatement ps = connexion.prepareStatement(sql);
                ps.setString(1, date);
                ps.setString(2, "%"+recherche+"%");
                ps.setString(3, "%"+recherche+"%");
             

                ResultSet rs = ps.executeQuery();

                while(rs.next()){

                   Vector v2 = new Vector();
                        for(int i = 0 ; i < 7 ; i++){
                            v2.add(rs.getString("NumFact"));
                            v2.add(rs.getString("cli.NumClient"));
                            v2.add(rs.getString("NomClient"));
                            v2.add(rs.getString("mat.NumMat"));
                            v2.add(rs.getString("Design"));
                            v2.add(rs.getInt("Qte"));   
                            v2.add(CommandeController.conversionDates("yyyy-mm-dd","dd-mm-yyyy",(rs.getDate("DateAchat")).toString()));
                        }

                        modelTable.addRow(v2);
               }

            } catch (SQLException ex) {
                Logger.getLogger(AchatController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(AchatController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        if(e.getSource() == dashAchat.btnModifyAchat1){
            
            row = dashAchat.tableClient1.getSelectedRow();
       
            if(row == -1){
                JOptionPane.showMessageDialog(dashAchat, "Pas de ligne sélectionné ");
            }else{
                String numFact = dashAchat.tableClient1.getValueAt(row, 0).toString();
                String numCli = dashAchat.tableClient1.getValueAt(row, 1).toString();
                String nomCli = dashAchat.tableClient1.getValueAt(row, 2).toString();
                String numMat = dashAchat.tableClient1.getValueAt(row, 3).toString();
                String design = dashAchat.tableClient1.getValueAt(row, 4).toString();
                String qte = dashAchat.tableClient1.getValueAt(row, 5).toString();
                String date = dashAchat.tableClient1.getValueAt(row, 6).toString();
            
                materiel = new InformationMateriel();
                materiel.setDesign(design);

                try {
                    date = conversionDates("dd-mm-yyyy","yyyy-mm-dd", date);
                   
                } catch (ParseException ex) {
                    Logger.getLogger(AchatController.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(modAchat.modifierStockDeleteVente(materiel, Integer.parseInt(qte + ""))){

                    String sql = "SELECT NumFact,cli.NumClient,mat.NumMat,NomClient,Design,Stock , PU,Qte,DateAchat FROM achat a, client cli, materiel mat"
                            + " WHERE (a.NumMat = mat.NumMat) AND (a.NumClient = cli.NumClient) AND"
                            + " a.NumMat = ? AND a.NumClient = ? AND DateAchat = ? and NumFact = ?";

                    try{
                        ConnexionDB conn = new ConnexionDB();
                        Connection connexion = conn.getConnexion();
                        PreparedStatement ps = connexion.prepareStatement(sql);
                        
                        ps.setString(1, numMat);
                        ps.setString(2, numCli);
                        ps.setString(3, date);
                        ps.setString(4, numFact);
                        
                        ResultSet rs = ps.executeQuery();

                        while(rs.next()){
                            client = new InformationClient();
                            achat = new InformationAchat();
                            materiel = new InformationMateriel();
  
                                    achat.setNumMat(rs.getString("NumFact"));
                                    client.setNumCli(rs.getString("cli.NumClient"));
                                    client.setNomCli(rs.getString("NomClient"));
                                    materiel.setNumMateriel(rs.getString("mat.NumMat"));
                                    materiel.setDesign(rs.getString("Design"));
                                    materiel.setPrixU(rs.getDouble("PU"));
                                    materiel.setStock(rs.getInt("Stock"));   
                                    achat.setQte(rs.getInt("Qte"));   
                                    achat.setDateAchat(CommandeController.conversionDates("yyyy-mm-dd","dd-mm-yyyy",(rs.getDate("DateAchat")).toString()));
                              

                              
                       }

                    } catch (SQLException ex) {
                        Logger.getLogger(AchatController.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ParseException ex) {
                        Logger.getLogger(AchatController.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    AchatModifyAchat mfAchat = new AchatModifyAchat(dashAchat,true,client,materiel,achat,row);
                    achat = new InformationAchat();
                    client = new InformationClient();
                    materiel = new InformationMateriel();
                    
                    AchatController ctrlAchat = new AchatController(achat,client,dashAchat,modAchat,modCli,modMat,materiel,mfAchat);
                    mfAchat.setVisible(true);
                }
            }
          
        }
        
        if(e.getSource() == dashAchat.btnDeleteAchat1){
            
            row = dashAchat.tableClient1.getSelectedRow();
       
            if(row == -1){
                JOptionPane.showMessageDialog(dashAchat, "Pas de ligne sélectionné ");
            }else{
                String numFact = dashAchat.tableClient1.getValueAt(row, 0).toString();
                String numCli = dashAchat.tableClient1.getValueAt(row, 1).toString();
                String numMat = dashAchat.tableClient1.getValueAt(row, 3).toString();
                String design = dashAchat.tableClient1.getValueAt(row, 4).toString();
                String qte = dashAchat.tableClient1.getValueAt(row, 5).toString();
                String date = dashAchat.tableClient1.getValueAt(row, 6).toString();
            
                materiel = new InformationMateriel();
                materiel.setDesign(design);

                try {
                    date = conversionDates("dd-mm-yyyy","yyyy-mm-dd", date);
                   
                } catch (ParseException ex) {
                    Logger.getLogger(AchatController.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(modAchat.modifierStockDeleteVente(materiel, Integer.parseInt(qte + ""))){

                    String sql = "DELETE FROM achat WHERE "
                            + " NumMat = ? AND NumClient = ? AND DateAchat = ? and NumFact = ?";

                    try{
                        ConnexionDB conn = new ConnexionDB();
                        Connection connexion = conn.getConnexion();
                        PreparedStatement ps = connexion.prepareStatement(sql);
                        
                        ps.setString(1, numMat);
                        ps.setString(2, numCli);
                        ps.setString(3, date);
                        ps.setString(4, numFact);
                        
                        ps.execute();
                       
                    } catch (SQLException ex) {
                        Logger.getLogger(AchatController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    DefaultTableModel modelTable = (DefaultTableModel)dashAchat.tableClient1.getModel();
                    modelTable.removeRow(row);
                }
            }
        }
        
        if(e.getSource() == modalModAchat.btnModifyCommandeEdit1){
            int row1 = Integer.parseInt(modalModAchat.labelHiddenRow.getText());
            
            String stock = modalModAchat.labelInfoStockEdit.getText();
            String design = modalModAchat.labelInfoDesignEdit.getText();
            String pu = modalModAchat.labelInfoPUEdit.getText();
            int qte = Integer.parseInt(modalModAchat.inputValueQteEdit.getText()) ;
            String date = modalModAchat.labelInfoStockEdit3.getText();
            String numFact = modalModAchat.labelInfoStockEdit2.getText();
            String numCli = modalModAchat.labelInfoDesignEdit1.getText();
            String numMat = modalModAchat.labelInfoStockEdit4.getText();
            String qteValue = modalModAchat.inputValueQteEdit.getText();
            
            if(Integer.parseInt(stock + "") >= qte){
              
                    materiel = new InformationMateriel();
                    materiel.setDesign(design);
                    
                    try {
                        date = conversionDates("dd-mm-yyyy","yyyy-mm-dd", date);

                    } catch (ParseException ex) {
                        Logger.getLogger(AchatModifyAchat.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    if(modAchat.modifierStockAddVente(materiel,Integer.parseInt(qteValue + ""))){
                        String sql = "UPDATE achat SET Qte = ? WHERE "
                            + " NumMat = ? AND NumClient = ? AND DateAchat = ? and NumFact = ?";

                        try{
                            ConnexionDB conn = new ConnexionDB();
                            Connection connexion = conn.getConnexion();
                            PreparedStatement ps = connexion.prepareStatement(sql);
                            
                            ps.setInt(1, qte);
                            ps.setString(2, numMat);
                            ps.setString(3, numCli);
                            ps.setString(4, date);
                            ps.setString(5, numFact);

                            ps.execute();

                        } catch (SQLException ex) {
                            Logger.getLogger(AchatController.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                    
                    modalModAchat.setVisible(false); 
                     
                    DefaultTableModel modelTable = (DefaultTableModel)(dashAchat.tableClient1).getModel();
                   
                    modelTable.setValueAt(modalModAchat.inputValueQteEdit.getText(), row1, 5);
                   
                     
                
            }else{
                JOptionPane.showMessageDialog(null, "Stock Insuffisant pour le commande");
            }
        }
        
        if(e.getSource() == modalModAchat.btnAnnulerCommandeEdit1){
            String design = modalModAchat.labelInfoDesignEdit.getText();
            String qte = modalModAchat.labelHiddenRow1.getText();
            
            InformationMateriel materiel = new InformationMateriel();
            materiel.setDesign(design);
            
            modAchat.modifierStockAddVente(materiel, Integer.parseInt(qte + ""));
            
            modalModAchat.setVisible(false);
        }
        
    }
    
    public void tableAchat(){
        DefaultTableModel modelTable = (DefaultTableModel)dashAchat.tableClient1.getModel();;
     
        dashAchat.tableClient1.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 12));
        dashAchat.tableClient1.getTableHeader().setForeground(Color.black);
        
        dashAchat.tableClient1.setRowHeight(30);
        
        String sql = "SELECT NumFact,cli.NumClient,mat.NumMat,NomClient,Design,Qte,DateAchat FROM achat a, client cli, materiel mat"
                + " WHERE (a.NumMat = mat.NumMat) AND (a.NumClient = cli.NumClient)";
        
            try{
                ConnexionDB conn = new ConnexionDB();
                Connection connexion = conn.getConnexion();
                PreparedStatement ps = connexion.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();

                while(rs.next()){

                   Vector v2 = new Vector();
                        for(int i = 0 ; i < 7 ; i++){
                            v2.add(rs.getString("NumFact"));
                            v2.add(rs.getString("cli.NumClient"));
                            v2.add(rs.getString("NomClient"));
                            v2.add(rs.getString("mat.NumMat"));
                            v2.add(rs.getString("Design"));
                            v2.add(rs.getInt("Qte"));   
                            v2.add(CommandeController.conversionDates("yyyy-mm-dd","dd-mm-yyyy",(rs.getDate("DateAchat")).toString()));
                        }

                        modelTable.addRow(v2);
               }

              

            } catch (SQLException ex) {
                Logger.getLogger(AchatController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(AchatController.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
}
