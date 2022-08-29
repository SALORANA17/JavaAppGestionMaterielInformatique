package app.controller;

import app.component.dialogMessage.DialogMessageCorrect;
import app.model.InformationClient;
import app.view.Dashboard;
import app.model.ClientModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;

public class ClientController implements ActionListener {
    private InformationClient client;
    private Dashboard dashClient;
    private ClientModel modCli;

    public ClientController(InformationClient client, Dashboard dashClient, ClientModel modCli) {
        this.client = client;
        this.dashClient = dashClient;
        this.modCli = modCli;
        this.dashClient.btnAddClient.addActionListener(this);
        this.dashClient.btnAnnulerClient.addActionListener(this);
        this.dashClient.btnModifyClient.addActionListener(this);
        this.dashClient.btnAnnulerModifyClient.addActionListener(this);  
        this.dashClient.btn_client.addActionListener(this);
        this.dashClient.btnDeleteClient.addActionListener(this);  
        this.dashClient.btnAddClientIcon.addActionListener(this);
        this.dashClient.btnSearchClient.addActionListener(this);
        this.dashClient.btnSearchNomClientAchat.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         
        if(e.getSource() == dashClient.btnAddClient){
            String numCli = dashClient.txtNumCliClient.getText();
            String nomCli = dashClient.txtNomCliClient.getText();
            String adrCli = dashClient.txtAdresseCliClient.getText();
            
            if(nomCli.equals("") || adrCli.equals("")){
                JOptionPane.showMessageDialog(dashClient, "Champ vide , veuillez remplir !");
            }else{
                if(isvalidNomClient(nomCli)== true && isvalidAdrClient(adrCli)==true){
                    client.setNumCli(numCli);
                    client.setNomCli(nomCli);
                    client.setAdrCli(adrCli);

                    if(modCli.ajouterClient(client)){
                        DialogMessageCorrect dlg = new DialogMessageCorrect(dashClient,true,"Client ajouté avec succès");
                        dlg.setVisible(true);

                        //JOptionPane.showMessageDialog(null, "Client ajouté avec succès");
                        resetInputClient();
                        dashClient.autoIDClient();
                        tableClient();
                    }else{
                        JOptionPane.showMessageDialog(dashClient, "Erreur d'insertion de client");
                    }
                }else{
                    JOptionPane.showMessageDialog(dashClient, "Champ incorrect");
                }
            }
            
        }
        
        if(e.getSource() == dashClient.btnModifyClient){
            String numCli = dashClient.txtNumCliClient.getText();
            String nomCli = dashClient.txtNomCliClient.getText();
            String adrCli = dashClient.txtAdresseCliClient.getText();
            
            if(nomCli.equals("") || adrCli.equals("")){
                  JOptionPane.showMessageDialog(dashClient, "Erreur de modification de client");
            }else{
                if(isvalidNomClient(nomCli) && isvalidAdrClient(adrCli)){
                    client.setNumCli(numCli);
                    client.setNomCli(nomCli);
                    client.setAdrCli(adrCli);

                    if(modCli.modifierClient(client)){

                        DialogMessageCorrect dlg = new DialogMessageCorrect(dashClient,true,"Client modifié avec succès");
                        dlg.setVisible(true);
                        //JOptionPane.showMessageDialog(null, "Client modifié avec succès");
                        resetInputClient();

                        dashClient.paneInfoClient.removeAll();
                        dashClient.paneInfoClient.add(dashClient.paneAddClient);
                        dashClient.paneInfoClient.repaint();
                        dashClient.paneInfoClient.revalidate();

                        dashClient.btnDeleteClient.setVisible(false);
                        dashClient.btnAddClientIcon.setVisible(false); 

                        dashClient.autoIDClient();
                        resetInputClientSearch();
                        tableClient();

                    }else{
                        JOptionPane.showMessageDialog(dashClient, "Erreur de modification de client");
                    }
                }else{
                    JOptionPane.showMessageDialog(dashClient, "Champ incorrect");
                }
            }
        }
        
        if(e.getSource() == dashClient.btnAnnulerClient){
            resetInputClient();
        }
        
        if(e.getSource() == dashClient.btnAddClientIcon){
            dashClient.autoIDClient();
            resetInputClient();
            
            dashClient.paneInfoClient.removeAll();
            dashClient.paneInfoClient.add(dashClient.paneAddClient);
            dashClient.paneInfoClient.repaint();
            dashClient.paneInfoClient.revalidate();
            
            dashClient.btnDeleteClient.setVisible(false);
            dashClient.btnAddClientIcon.setVisible(false);
        }
        
        if(e.getSource() == dashClient.btnDeleteClient){
            
            String numCli = dashClient.txtNumCliClient.getText();
            client.setNumCli(numCli);
            
            int response = JOptionPane.showConfirmDialog(dashClient, "Vouz-voulez vraiment supprimé ce client", " ",JOptionPane.YES_NO_OPTION);
            
            if(response == JOptionPane.YES_OPTION){
                if(modCli.supprimerClient(client)){
                    DialogMessageCorrect dlg = new DialogMessageCorrect(dashClient,true,"Client supprimé avec succès");
                    dlg.setVisible(true);

                    //JOptionPane.showMessageDialog(null, "Client supprimé avec succès");

                    resetInputClient();

                    dashClient.paneInfoClient.removeAll();
                    dashClient.paneInfoClient.add(dashClient.paneAddClient);
                    dashClient.paneInfoClient.repaint();
                    dashClient.paneInfoClient.revalidate();

                    dashClient.btnDeleteClient.setVisible(false);
                    dashClient.btnAddClientIcon.setVisible(false);
                    dashClient.autoIDClient();
                    tableClient();

                }else{
                    JOptionPane.showMessageDialog(dashClient, "Erreur de suppression de client");
                }
            }
            
        }
        
        if(e.getSource() == dashClient.btnAnnulerModifyClient){
           resetInputClient();
           
            dashClient.paneInfoClient.removeAll();
            dashClient.paneInfoClient.add(dashClient.paneAddClient);
            dashClient.paneInfoClient.repaint();
            dashClient.paneInfoClient.revalidate();
                    
            dashClient.btnDeleteClient.setVisible(false);
            dashClient.btnAddClientIcon.setVisible(false);
           
           dashClient.autoIDClient();
           resetInputClientSearch();
           tableClient();
        }
        
        if(e.getSource() == dashClient.btn_client){
            resetInputClientSearch();
            tableClient();
        }
        
        if(e.getSource() == dashClient.btnSearchClient){
            String search = dashClient.inputSearchClient.getText();
            int inputValue = dashClient.checkClientSearch.getSelectedIndex();
            
            if(inputValue == 0){
                tableClientByNum(search);
            }else if(inputValue == 1){
                tableClientByNom(search);
            }
            
        }
        
        if(e.getSource() == dashClient.btnSearchNomClientAchat){
            String numCli = dashClient.txtNumCliClient.getText();
            String nomCli = dashClient.txtNomCliClient.getText();
            String adrCli = dashClient.txtAdresseCliClient.getText();
            
            dashClient.btn_achat.setBackground(new Color(0,51,102));
            
            dashClient.panelMain.removeAll();
            dashClient.panelMain.add(dashClient.paneAchat);
            dashClient.panelMain.repaint();
            dashClient.panelMain.revalidate();


            dashClient.btn_stat.setBackground(new Color(0,153,255));
            dashClient.btn_materiel.setBackground(new Color(0,153,255));
            dashClient.btn_client.setBackground(new Color(0,153,255));
            dashClient.btn_dashboard.setBackground(new Color(0,153,255));
            
            dashClient.paneCommandeAchatClient.setVisible(true);
            dashClient.paneAchatInfoGeneral.setVisible(false);
            resetInputClient();

            dashClient.paneCommandeAchat.setVisible(true);
            dashClient.btnReturnClientAchat.setVisible(true);
            dashClient.btnSearchNomClientStat.setVisible(true);
            dashClient.inputNumClientSearchAchat.setText(numCli);
            dashClient.inputNomClientSearchAchat.setText(nomCli);
            dashClient.inputAdresseClientSearchAchat.setText(adrCli);
           
        }
        
    }
    
    
    
    public void tableClient(){
        DefaultTableModel modelTable = new DefaultTableModel();
        dashClient.tableClient.setModel(modelTable);
        
        modelTable.addColumn("Numéro");
        modelTable.addColumn("Nom");
        modelTable.addColumn("Adresse");
        
        dashClient.tableClient.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 12));
        dashClient.tableClient.getTableHeader().setForeground(Color.black);
        
        dashClient.tableClient.setRowHeight(30);
        
        Object[] columns = new Object[3];
        int numRowCount = modCli.listerClient().size();
        
        for(int i = 0; i < numRowCount ; i++){
            columns[0] = modCli.listerClient().get(i).getNumCli();
            columns[1] = modCli.listerClient().get(i).getNomCli();
            columns[2] = modCli.listerClient().get(i).getAdrCli();
            
            modelTable.addRow(columns);
        }
    }
    
    public void tableClientByNom(String client){
        DefaultTableModel modelTable = new DefaultTableModel();
        dashClient.tableClient.setModel(modelTable);
        
        modelTable.addColumn("Numéro");
        modelTable.addColumn("Nom");
        modelTable.addColumn("Adresse");
        
        dashClient.tableClient.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 12));
        dashClient.tableClient.getTableHeader().setForeground(Color.black);
        
        dashClient.tableClient.setRowHeight(30);
        
        Object[] columns = new Object[3];
        int numRowCount = modCli.rechercherClientByNom(client).size();
        
        for(int i = 0; i < numRowCount ; i++){
            columns[0] = modCli.rechercherClientByNom(client).get(i).getNumCli();
            columns[1] = modCli.rechercherClientByNom(client).get(i).getNomCli();
            columns[2] = modCli.rechercherClientByNom(client).get(i).getAdrCli();
            
            modelTable.addRow(columns);
        }
    }
    
    public void tableClientByNum(String client){
        DefaultTableModel modelTable = new DefaultTableModel();
        dashClient.tableClient.setModel(modelTable);
        
        modelTable.addColumn("Numéro");
        modelTable.addColumn("Nom");
        modelTable.addColumn("Adresse");
        
        dashClient.tableClient.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 12));
        dashClient.tableClient.getTableHeader().setForeground(Color.black);
        
        dashClient.tableClient.setRowHeight(30);
        
        Object[] columns = new Object[3];
        int numRowCount = modCli.rechercherClientByNum(client).size();
        
        for(int i = 0; i < numRowCount ; i++){
            columns[0] = modCli.rechercherClientByNum(client).get(i).getNumCli();
            columns[1] = modCli.rechercherClientByNum(client).get(i).getNomCli();
            columns[2] = modCli.rechercherClientByNum(client).get(i).getAdrCli();
            
            modelTable.addRow(columns);
        }
    }
    
    public boolean isvalidNomClient(String name){
        String regex = "^[A-Za-z ]{5,150}$";
        
        Pattern pattern = Pattern.compile(regex);
        
        if(name == null){
            return false;
        }else{
            Matcher m = pattern.matcher(name);
            
            return m.matches();
        }
        
    }
    
    public boolean isvalidAdrClient(String adresse){
        String regex = "^[A-Za-z ]{5,150}$";
        
        Pattern pattern = Pattern.compile(regex);
        
        if(adresse == null){
            return false;
        }else{
            Matcher m = pattern.matcher(adresse);
            
            return m.matches();
        }
        
    }
    
    public void resetInputClient(){
        dashClient.txtNomCliClient.setText(null);
        dashClient.txtAdresseCliClient.setText(null);
    }
    
    public void resetInputClientSearch(){
        dashClient.inputSearchClient.setText(null);  
    }

}
