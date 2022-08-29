package app.controller;

import app.component.AchatEditCommande;
import app.component.AchatModalForm;
import app.model.AchatModel;
import app.model.ClientModel;
import app.model.InformationAchat;
import app.model.InformationClient;
import app.model.InformationMateriel;
import app.model.MaterielModel;
import app.view.Dashboard;
import app.view.FactureModalForm;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CommandeController implements ActionListener{
    
    private InformationAchat achat;
    private InformationClient client;
    private InformationMateriel materiel;
    private AchatEditCommande frmAchatEdit;
    private AchatModalForm modalAchat;
    private AchatModel modAchat;
    private ClientModel modCli;
    private MaterielModel modMat;
    public int row;
    
    public CommandeController(InformationAchat achat, InformationClient client, InformationMateriel materiel, AchatModalForm modalAchat, AchatModel modAchat, ClientModel modCli, MaterielModel modMat,AchatEditCommande frmAchatEdit) {
        this.achat = achat;
        this.client = client;
        this.materiel = materiel;
        this.modalAchat = modalAchat;
        this.modAchat = modAchat;
        this.modCli = modCli;
        this.modMat = modMat;
        this.frmAchatEdit = frmAchatEdit;
        
        this.modalAchat.btnAchatArticle.addActionListener(this);
        this.modalAchat.btnSeeArctileSearch.addActionListener(this);
        this.modalAchat.btnDeleteCommande.addActionListener(this);
        this.modalAchat.btnEditAchatArticle.addActionListener(this);
        this.modalAchat.btnValidateCommande.addActionListener(this);
        this.frmAchatEdit.btnModifyCommandeEdit.addActionListener(this);
        this.frmAchatEdit.btnAnnulerCommandeEdit.addActionListener(this);
        this.modalAchat.btnCloseAchat.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if( e.getSource() == modalAchat.btnCloseAchat){
           
            int rowCount = modalAchat.tableCommande.getRowCount();
            
            if(rowCount == 0){
                modalAchat.setVisible(false);
                
            }else{
                for(int i=0; i < rowCount ; i++){
                    
                    String design = modalAchat.tableCommande.getValueAt(0, 0).toString();
                    String pu = modalAchat.tableCommande.getValueAt(0, 1).toString();
                    String qte = modalAchat.tableCommande.getValueAt(0, 2).toString();

                    modAchat = new AchatModel();
                    materiel = new InformationMateriel();
                    materiel.setDesign(design);

                    if(modAchat.modifierStockDeleteVente(materiel, Integer.parseInt(qte + ""))){
                        DefaultTableModel modelTable = (DefaultTableModel)(modalAchat.tableCommande).getModel();
                        modelTable.removeRow(0);
                        //JOptionPane.showMessageDialog(null, "OK :" + i );
                    }

                }
                
                modalAchat.setVisible(false);
            }
        }
        
        if( e.getSource() == modalAchat.btnAchatArticle ){
            
            String stock = modalAchat.txtStockRestantArticle.getText();
            String design = modalAchat.comboArticleSearch.getSelectedItem().toString();
            String pu = modalAchat.txtPUArticle.getText();
            String qte =modalAchat.txtQteArticle.getText();
            
            if(stock.equals("")  || pu.equals("")|| qte.equals("")){
                JOptionPane.showMessageDialog(null, "Champ vide ! Veuillez remplir !");
                
            }else{
                
                String regex = "^[0-9]{1,255}$";
                Pattern pattern = Pattern.compile(regex);
                Matcher m = pattern.matcher(qte);
                
                if(m.matches()){
                    int qteValue = Integer.parseInt(qte+"") ;
                
                    if(Integer.parseInt(stock + "") >= qteValue){

                        materiel = new InformationMateriel();
                        materiel.setDesign(design);

                        if(modAchat.modifierStockAddVente(materiel,qteValue)){

                            materiel = new InformationMateriel();
                            materiel.setDesign(design);
                            materiel.setPrixU(Double.parseDouble(pu));

                            DefaultTableModel tableCommande = (DefaultTableModel) modalAchat.tableCommande.getModel();

                            tableCommande.addRow(new Object[]{materiel.getDesign(),materiel.getPrixU(),qteValue, qteValue * materiel.getPrixU()});

                            //modalAchat.totalAchat +=  (materiel.getPrixU() * qte) ;

                            modalAchat.btnEditAchatArticle.setVisible(true);
                            modalAchat.btnValidateCommande.setVisible(true);
                            modalAchat.labelMontantTotal.setVisible(true);
                            modalAchat.labelMontantValue.setVisible(true);
                            modalAchat.btnDeleteCommande.setVisible(true);

                            resetInputCommandeArticle();
                            afficherMontantTotal();  
                        }

                    }else{
                        JOptionPane.showMessageDialog(modalAchat, "Stock Insuffisant pour le commande");
                    }   
                }else{
                    JOptionPane.showMessageDialog(modalAchat, "Champ quantité invalide");
                }

            }
        }
        
        if(e.getSource() == modalAchat.btnSeeArctileSearch){
            String materiel = modalAchat.comboArticleSearch.getSelectedItem().toString();
            modalAchat.btnAchatArticle.setVisible(true);
            afficheInfoArticle(materiel);
        }
        
        if(e.getSource() == modalAchat.btnEditAchatArticle){
            
            row = modalAchat.tableCommande.getSelectedRow();
       
            if(row == -1){
                JOptionPane.showMessageDialog(modalAchat, "Pas de ligne sélectionné ");
            }else{
                String design = modalAchat.tableCommande.getValueAt(row, 0).toString();
            String pu = modalAchat.tableCommande.getValueAt(row, 1).toString();
            String qte = modalAchat.tableCommande.getValueAt(row, 2).toString();
            
            materiel = new InformationMateriel();
            materiel.setDesign(design);
            
                if(modAchat.modifierStockDeleteVente(materiel, Integer.parseInt(qte + ""))){

                    Object[] columns = new Object[4];
                    int numRowCount = modAchat.rechercherInfoArticle(design).size();

                    for(int i = 0; i < numRowCount ; i++){
                        columns[0] = modAchat.rechercherInfoArticle(design).get(i).getNumMateriel();
                        columns[1] = modAchat.rechercherInfoArticle(design).get(i).getDesign();
                        columns[2] = modAchat.rechercherInfoArticle(design).get(i).getPrixU();
                        columns[3] = modAchat.rechercherInfoArticle(design).get(i).getStock();

                    }

                    int stockValue = Integer.parseInt(columns[3] + "");
                    int qteValue = Integer.parseInt(qte + "");
                    String designValue = columns[1] + "";
                    Double puValue = Double.parseDouble(columns[2] + "");

                    frmAchatEdit = new AchatEditCommande(modalAchat,true,designValue,puValue,stockValue,qteValue,row);
                    materiel = new InformationMateriel();
                    achat = new InformationAchat();
                    client = new InformationClient();
                    modAchat = new AchatModel();
                    modCli = new ClientModel();
                    modMat = new MaterielModel();
                    CommandeController ctrlCmd = new CommandeController(achat,client,materiel,modalAchat,modAchat,modCli,modMat,frmAchatEdit);
                    frmAchatEdit.setVisible(true);
                }
            }
        }
        
        if(e.getSource() == modalAchat.btnDeleteCommande){
            row = modalAchat.tableCommande.getSelectedRow();

            if(row == -1){
                JOptionPane.showMessageDialog(modalAchat, "Commande d'article vide ou Pas de ligne sélectionné");
            }else{
                String design = modalAchat.tableCommande.getValueAt(row, 0).toString();
                String pu = modalAchat.tableCommande.getValueAt(row, 1).toString();
                String qte = modalAchat.tableCommande.getValueAt(row, 2).toString();

                materiel = new InformationMateriel();
                materiel.setDesign(design);

                modAchat.modifierStockDeleteVente(materiel, Integer.parseInt(qte + ""));
                DefaultTableModel modelTable = (DefaultTableModel)(modalAchat.tableCommande).getModel();
                modelTable.removeRow(row);
                afficherMontantTotal();
            }

        }
        
        if(e.getSource() == frmAchatEdit.btnModifyCommandeEdit ){
            
            int row1 = Integer.parseInt(frmAchatEdit.labelHiddenRow.getText());
            
            String stock = frmAchatEdit.labelInfoStockEdit.getText();
            String design = frmAchatEdit.labelInfoDesignEdit.getText();
            String pu = frmAchatEdit.labelInfoPUEdit.getText();
            int qte =Integer.parseInt(frmAchatEdit.inputValueQteEdit.getText()) ;
            
            if(Integer.parseInt(stock + "") >= qte){
              
                    materiel = new InformationMateriel();
                    materiel.setDesign(design);

                    modAchat.modifierStockAddVente(materiel,qte);
                        
                    DefaultTableModel modelTable = (DefaultTableModel)(modalAchat.tableCommande).getModel();
                    modelTable.setValueAt(frmAchatEdit.labelInfoDesignEdit.getText(), row1, 0);
                    modelTable.setValueAt(frmAchatEdit.labelInfoPUEdit.getText(), row1, 1);
                    modelTable.setValueAt(frmAchatEdit.inputValueQteEdit.getText(), row1, 2);
                    modelTable.setValueAt(Integer.parseInt(frmAchatEdit.inputValueQteEdit.getText()) * Double.parseDouble(frmAchatEdit.labelInfoPUEdit.getText()), row1, 3);
                        
                    frmAchatEdit.setVisible(false);   

                afficherMontantTotal();
            }else{
                JOptionPane.showMessageDialog(modalAchat, "Stock Insuffisant pour le commande");
            }
 
        }
        
        if(e.getSource() == frmAchatEdit.btnAnnulerCommandeEdit){
            
            row = Integer.parseInt(frmAchatEdit.labelHiddenRow.getText());
            frmAchatEdit.setVisible(false);
            
            String design = modalAchat.tableCommande.getValueAt(row, 0).toString();
            String pu = modalAchat.tableCommande.getValueAt(row, 1).toString();
            String qte = modalAchat.tableCommande.getValueAt(row, 2).toString();
            
            materiel = new InformationMateriel();
            materiel.setDesign(design);
            
            modAchat.modifierStockAddVente(materiel, Integer.parseInt(qte + ""));
            
        }
        
        if(e.getSource() == modalAchat.btnValidateCommande){
            
            String montant = modalAchat.labelMontantValue.getText();
            String numCli = modalAchat.labelNumCliCommande.getText();
            String adrCli = modalAchat.labelAdrCliCommande.getText();
            String numCom = modalAchat.labelNumCommande.getText();
            String nomCli = modalAchat.labelNomCliCommande.getText();
            String date = modalAchat.dateChooserCommande.getText();
            String design ;
            String pu ;
            String qte;
 
            try {
                date = conversionDates("dd-mm-yyyy","yyyy-mm-dd", modalAchat.dateChooserCommande.getText());
            } catch (ParseException ex) {
                Logger.getLogger(CommandeController.class.getName()).log(Level.SEVERE, null, ex);
            }
          
            DefaultTableModel df = (DefaultTableModel) modalAchat.tableCommande.getModel();
            int rowCount = modalAchat.tableCommande.getRowCount();
            
            Dashboard dashAchat = new Dashboard();
            FactureModalForm fctForm = new FactureModalForm(null,true);
            DefaultTableModel modelTable = (DefaultTableModel) fctForm.tableCommandeImpr.getModel();
            
            for(int i = 0 ; i < rowCount ; i++ ){
                design = df.getValueAt(i, 0).toString();
                pu = df.getValueAt(i, 1).toString();
                qte = df.getValueAt(i, 2).toString();
           
            
                Object[] columns = new Object[4];
                int numRowCount = modAchat.rechercherInfoArticle(design).size();

                for(int j = 0; j < numRowCount ; j++){
                    columns[0] = modAchat.rechercherInfoArticle(design).get(j).getNumMateriel();
                    columns[1] = modAchat.rechercherInfoArticle(design).get(j).getDesign();
                    columns[2] = modAchat.rechercherInfoArticle(design).get(j).getPrixU();
                    columns[3] = modAchat.rechercherInfoArticle(design).get(j).getStock();
                }
                
                
                achat = new InformationAchat();
                achat.setNumCli(numCli);
                achat.setDateAchat(date);
                achat.setNumMat(columns[0] + "");
                achat.setQte(Integer.parseInt(qte + ""));
                
                modAchat.enregistrerCommande(achat, numCom);
            
                //JOptionPane.showMessageDialog(null, columns[0] + " " + columns[1]);
                
                
                Double produit = Double.parseDouble(pu+"") * Integer.parseInt(qte+"");
                String[] toadd = {design,pu,qte,(produit+"")};
                modelTable.addRow(toadd);
              
            }
            
            fctForm = new FactureModalForm(null,true,montant,adrCli,nomCli,modalAchat.dateChooserCommande.getText(),numCom,numCli,convertNumberToString((int)Double.parseDouble(montant +"")),modelTable,rowCount);
            
            modalAchat.setVisible(false);
            fctForm.setVisible(true);
            
            
        }
    }
    
    public static String conversionDates(String inputPattern,String outputPattern, String givenDate) throws ParseException{
    
        SimpleDateFormat inputFormat = new SimpleDateFormat(inputPattern);
        SimpleDateFormat outputFormat = new SimpleDateFormat(outputPattern);
        Date date = null ;
        String requiredDate =  null;
        date = inputFormat.parse(givenDate);
        requiredDate = outputFormat.format(date);
        return requiredDate;
        
    }
    
    public void afficheInfoArticle(String materiel){
        
        Object[] columns = new Object[4];
        int numRowCount = modAchat.rechercherInfoArticle(materiel).size();
        
        for(int i = 0; i < numRowCount ; i++){
            columns[0] = modAchat.rechercherInfoArticle(materiel).get(i).getNumMateriel();
            columns[1] = modAchat.rechercherInfoArticle(materiel).get(i).getDesign();
            columns[2] = modAchat.rechercherInfoArticle(materiel).get(i).getPrixU();
            columns[3] = modAchat.rechercherInfoArticle(materiel).get(i).getStock();
            
        }
        
        modalAchat.txtPUArticle.setText(columns[2] + "");
        modalAchat.txtStockRestantArticle.setText(columns[3] + "");
        
    }
    
    public void afficherMontantTotal(){
        
        DefaultTableModel modelTable = (DefaultTableModel)(modalAchat.tableCommande).getModel();
        
        int count = modelTable.getRowCount();
        Double somme = 0.0;
        
        for(int i = 0 ; i < count ; i++){
            somme += Double.parseDouble(modelTable.getValueAt(i, 3)+ "");
        }

        modalAchat.labelMontantValue.setText(somme + "");
    }
    
    public void resetInputCommandeArticle(){
        modalAchat.txtPUArticle.setText(null);
        modalAchat.txtQteArticle.setText(null);
        modalAchat.txtStockRestantArticle.setText(null);
    }

    
    public static String convertNumberToString(int number){
        final String[] UNITS_DIGIT ;
        final String[] TEN_DIGIT_WORDS ;

        UNITS_DIGIT = new String[]{"","un","deux","trois","quatre","cinq","six","sept","huit","neuf",
            "dix","onze","douze","treize","quatorze","quinze","seize","dix-sept","dix-huit","dix-neuf"};
        TEN_DIGIT_WORDS = new String[]{"","","vingt","trente","quarante","cinquante","soixante","soixante","quatre vingt","quatre vingt"};
                
        int numberToConvert = number;
        
        if(numberToConvert < 20 ){
            return UNITS_DIGIT[numberToConvert];
        }else if(numberToConvert < 70 || (numberToConvert >= 80 && numberToConvert < 90 ) ){
            return TEN_DIGIT_WORDS[numberToConvert/10] + ((numberToConvert%10 != 0 && numberToConvert%10 != 1 )?" ":"") + ((numberToConvert%10 == 1)?" et ":"") + UNITS_DIGIT[numberToConvert%10];
        }else if((numberToConvert >= 70 && numberToConvert < 80) || (numberToConvert > 90 && numberToConvert < 100) ){
            return TEN_DIGIT_WORDS[numberToConvert/10] + " " + UNITS_DIGIT[(numberToConvert%10)+10];
        }else if(numberToConvert >= 100 && numberToConvert < 200 ){
            return " cent "+ ((numberToConvert%10 != 0 )?" ":"") + convertNumberToString(numberToConvert%100);
        }else if(numberToConvert < 1000 ){
            return UNITS_DIGIT[numberToConvert/100] +" cent "+ ((numberToConvert%10 != 0 )?" ":"") + convertNumberToString(numberToConvert%100);
        }else if(numberToConvert >= 1000 && numberToConvert < 2000){
            return " mille " + ((numberToConvert%10 != 0 )?"":"") + convertNumberToString(numberToConvert%1000) ;
        }else if(numberToConvert < 1000000 ){
            return convertNumberToString(numberToConvert / 1000) + " mille " + ((numberToConvert%10 != 0 )?" ":"") + convertNumberToString(numberToConvert%1000) ;
        }else if(numberToConvert < 1000000000 ){
            return convertNumberToString(numberToConvert / 1000000) + " million " + ((numberToConvert%10 != 0 )?" ":"") + convertNumberToString(numberToConvert%1000000);
        }

        return convertNumberToString(numberToConvert / 1000000000) + " milliard " + ((numberToConvert%10 != 0 )?" ":"") + convertNumberToString(numberToConvert%1000000);
    }

}
