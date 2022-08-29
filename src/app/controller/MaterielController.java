package app.controller;

import app.component.dialogMessage.DialogMessageCorrect;
import app.model.InformationMateriel;
import app.model.MaterielModel;
import app.view.Dashboard;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MaterielController implements ActionListener{

    private InformationMateriel materiel;
    private Dashboard dashMateriel;
    private MaterielModel modMat;

    public MaterielController(InformationMateriel materiel, Dashboard dashMateriel, MaterielModel modMat) {
        this.materiel = materiel;
        this.dashMateriel = dashMateriel;
        this.modMat = modMat;
        this.dashMateriel.btnAddMateriel.addActionListener(this);
        this.dashMateriel.btnAnnulerMateriel.addActionListener(this);
        this.dashMateriel.btnModifyMateriel.addActionListener(this);
        this.dashMateriel.btnModifyAnnulerMateriel.addActionListener(this);  
        this.dashMateriel.btn_materiel.addActionListener(this);
        this.dashMateriel.btnDeleteMateriel.addActionListener(this);  
        this.dashMateriel.btnAddMaterielIcon.addActionListener(this);
        this.dashMateriel.btnSearchMateriel.addActionListener(this);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == dashMateriel.btnAddMateriel){
           
            String numMat = dashMateriel.txtNumMatMateriel.getText();
            String design = dashMateriel.txtDesignMateriel.getText();
            String pu = dashMateriel.txtPuMateriel.getText();
            String stock = dashMateriel.txtStockMateriel.getText();
            
            if(design.equals("") || pu.equals("") || stock.equals("")){
                JOptionPane.showMessageDialog(dashMateriel, "Champ vide , veuillez remplir !");
            }else{
                if(isvalidDesignMateriel(design)== true && isvalidPU(pu)== true && isvalidStock(stock)== true){
                    materiel.setNumMateriel(numMat);
                    materiel.setDesign(design);
                    materiel.setPrixU(Double.parseDouble(pu));
                    materiel.setStock(Integer.parseInt(stock));

                    if(modMat.ajouterMateriel(materiel)){
                        DialogMessageCorrect dlg = new DialogMessageCorrect(dashMateriel,true,"Matériel ajouté avec succès");
                        dlg.setVisible(true);
                        //JOptionPane.showMessageDialog(null, "Matériel ajouté avec succès");

                        resetInputMateriel();
                        dashMateriel.autoIDMateriel();
                        tableMateriel();
                    }else{
                        JOptionPane.showMessageDialog(dashMateriel, "Erreur d'insertion de matériel");
                    }

                }else{
                    JOptionPane.showMessageDialog(dashMateriel, "Champ incorrect");
                }
            }
        }
        
        if(e.getSource() == dashMateriel.btnModifyMateriel){
            String numMat = dashMateriel.txtNumMatMateriel.getText();
            String design = dashMateriel.txtDesignMateriel.getText();
            String pu = dashMateriel.txtPuMateriel.getText();
            String stock = dashMateriel.txtStockMateriel.getText();
            
            if(design.equals("") || pu.equals("") || stock.equals("")){
                JOptionPane.showMessageDialog(dashMateriel, "Champ vide , veuillez remplir ! ");
            }else{
                if(isvalidDesignMateriel(design)== true && isvalidPU(pu) && isvalidStock(stock)){
                    materiel.setNumMateriel(numMat);
                    materiel.setDesign(design);
                    materiel.setPrixU(Double.parseDouble(pu));
                    materiel.setStock(Integer.parseInt(stock));

                    if(modMat.modifierMateriel(materiel)){
                        DialogMessageCorrect dlg = new DialogMessageCorrect(dashMateriel,true,"Matériel modifié avec succès");
                        dlg.setVisible(true);

                        //JOptionPane.showMessageDialog(null, "Matériel modifié avec succès");
                        resetInputMateriel();

                        dashMateriel.paneInfoMateriel.removeAll();
                        dashMateriel.paneInfoMateriel.add(dashMateriel.paneAddMateriel);
                        dashMateriel.paneInfoMateriel.repaint();
                        dashMateriel.paneInfoMateriel.revalidate();

                        dashMateriel.autoIDMateriel();;
                        tableMateriel();

                    }else{
                        JOptionPane.showMessageDialog(dashMateriel, "Erreur de modification de matériel");
                    }
                }else{
                    JOptionPane.showMessageDialog(dashMateriel, "Champ incorrect");
                }
            }
        }
        
        if(e.getSource() == dashMateriel.btnAnnulerMateriel){
            resetInputMateriel();
        }
        
        if(e.getSource() == dashMateriel.btnAddMaterielIcon){
            dashMateriel.autoIDMateriel();
            resetInputMateriel();
            
            dashMateriel.paneInfoMateriel.removeAll();
            dashMateriel.paneInfoMateriel.add(dashMateriel.paneAddMateriel);
            dashMateriel.paneInfoMateriel.repaint();
            dashMateriel.paneInfoMateriel.revalidate();
            
            dashMateriel.btnDeleteMateriel.setVisible(false);
            dashMateriel.btnAddMaterielIcon.setVisible(false);
        }
        
        if(e.getSource() == dashMateriel.btnDeleteMateriel){
            
            String numMat = dashMateriel.txtNumMatMateriel.getText();
            materiel.setNumMateriel(numMat);
            
            int response = JOptionPane.showConfirmDialog(dashMateriel, "Vouz-voulez vraiment supprimé ce matériel", " ",JOptionPane.YES_NO_OPTION);
            
            if(response == JOptionPane.YES_OPTION){
                if(modMat.supprimerMateriel(materiel)){
                    DialogMessageCorrect dlg = new DialogMessageCorrect(dashMateriel,true,"Materiel supprimé avec succès");
                    dlg.setVisible(true);   
                    //JOptionPane.showMessageDialog(null, "Materiel supprimé avec succès");  
                        resetInputMateriel();

                        dashMateriel.paneInfoMateriel.removeAll();
                        dashMateriel.paneInfoMateriel.add(dashMateriel.paneAddMateriel);
                        dashMateriel.paneInfoMateriel.repaint();
                        dashMateriel.paneInfoMateriel.revalidate();

                        dashMateriel.btnDeleteMateriel.setVisible(false);
                        dashMateriel.btnAddMaterielIcon.setVisible(false);
                        dashMateriel.autoIDMateriel();
                        tableMateriel();

                }else{
                    JOptionPane.showMessageDialog(dashMateriel, "Erreur de suppression de client");
               }  
            }
        }
        
        if(e.getSource() == dashMateriel.btnModifyAnnulerMateriel){
           resetInputMateriel();
           
            dashMateriel.paneInfoMateriel.removeAll();
            dashMateriel.paneInfoMateriel.add(dashMateriel.paneAddMateriel);
            dashMateriel.paneInfoMateriel.repaint();
            dashMateriel.paneInfoMateriel.revalidate();
            
            dashMateriel.btnDeleteMateriel.setVisible(false);
            dashMateriel.btnAddMaterielIcon.setVisible(false); 
            
            dashMateriel.autoIDMateriel();
           tableMateriel();
        }
        
        if(e.getSource() == dashMateriel.btn_materiel){
            tableMateriel();
        }
        
        if(e.getSource() == dashMateriel.btnSearchMateriel){
            String search = dashMateriel.inputSearchMateriel.getText();
            int inputValue = dashMateriel.checkMaterielSearch.getSelectedIndex();
           
            if(inputValue == 0){
                tableMaterielByNum(search);
            }else if(inputValue == 1){
                tableMaterielByDesign(search);
            }
            
        }
    }
    
    public void tableMateriel(){
        DefaultTableModel modelTable = new DefaultTableModel();
        dashMateriel.tableMateriel.setModel(modelTable);
        
        modelTable.addColumn("Numéro");
        modelTable.addColumn("Désignation");
        modelTable.addColumn("PU");
        modelTable.addColumn("Stock");
        
        dashMateriel.tableMateriel.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 12));
        dashMateriel.tableMateriel.getTableHeader().setForeground(Color.black);
        
        dashMateriel.tableMateriel.setRowHeight(30);
        
        Object[] columns = new Object[4];
        int numRowCount = modMat.listerMateriel().size();
        
        for(int i = 0; i < numRowCount ; i++){
            columns[0] = modMat.listerMateriel().get(i).getNumMateriel();
            columns[1] = modMat.listerMateriel().get(i).getDesign();
            columns[2] = modMat.listerMateriel().get(i).getPrixU();
            columns[3] = modMat.listerMateriel().get(i).getStock();
            
            modelTable.addRow(columns);
        }
    }
    
     public void tableMaterielByDesign(String materiel){
        DefaultTableModel modelTable = new DefaultTableModel();
        dashMateriel.tableMateriel.setModel(modelTable);
        
        modelTable.addColumn("Numéro");
        modelTable.addColumn("Désignation");
        modelTable.addColumn("PU");
        modelTable.addColumn("Stock");
        
        dashMateriel.tableMateriel.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 12));
        dashMateriel.tableMateriel.getTableHeader().setForeground(Color.black);
        
        dashMateriel.tableMateriel.setRowHeight(30);
        
        Object[] columns = new Object[4];
        int numRowCount = modMat.rechercherMaterielByDesign(materiel).size();
        
        for(int i = 0; i < numRowCount ; i++){
            columns[0] = modMat.rechercherMaterielByDesign(materiel).get(i).getNumMateriel();
            columns[1] = modMat.rechercherMaterielByDesign(materiel).get(i).getDesign();
            columns[2] = modMat.rechercherMaterielByDesign(materiel).get(i).getPrixU();
            columns[3] = modMat.rechercherMaterielByDesign(materiel).get(i).getStock();
        
            modelTable.addRow(columns);
        }
    }
    
    public void tableMaterielByNum(String materiel){
        DefaultTableModel modelTable = new DefaultTableModel();
        dashMateriel.tableMateriel.setModel(modelTable);
        
        modelTable.addColumn("Numéro");
        modelTable.addColumn("Désignation");
        modelTable.addColumn("PU");
        modelTable.addColumn("Stock");
        
        dashMateriel.tableMateriel.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 12));
        dashMateriel.tableMateriel.getTableHeader().setForeground(Color.black);
        
        dashMateriel.tableMateriel.setRowHeight(30);
        
        Object[] columns = new Object[4];
        int numRowCount = modMat.rechercherMaterieltByNum(materiel).size();
        
        for(int i = 0; i < numRowCount ; i++){
            columns[0] = modMat.rechercherMaterieltByNum(materiel).get(i).getNumMateriel();
            columns[1] = modMat.rechercherMaterieltByNum(materiel).get(i).getDesign();
            columns[2] = modMat.rechercherMaterieltByNum(materiel).get(i).getPrixU();
            columns[3] = modMat.rechercherMaterieltByNum(materiel).get(i).getStock();
   
            modelTable.addRow(columns);
        }
    }
    
    public boolean isvalidDesignMateriel(String design){
        String regex = "^[A-Za-z0-9 ]{5,100}$";
        
        Pattern pattern = Pattern.compile(regex);
        
        if(design == null){
            return false;
        }else{
            Matcher m = pattern.matcher(design);
            
            return m.matches();
        }
        
    }
    
    public boolean isvalidPU(String pu){
        String regex = "^[0-9]{1,20}$";
        
        Pattern pattern = Pattern.compile(regex);
        
        if(pu == null){
            return false;
        }else{
            Matcher m = pattern.matcher(pu);
            
            return m.matches();
        }
        
    }
    
    public boolean isvalidStock(String stock){
        String regex = "^[0-9]{1,6}$";
        
        Pattern pattern = Pattern.compile(regex);
        
        if(stock == null){
            return false;
        }else{
            Matcher m = pattern.matcher(stock);
            
            return m.matches();
        }
        
    }
    
    
    public void resetInputMateriel(){
        dashMateriel.txtDesignMateriel.setText(null);
        dashMateriel.txtPuMateriel.setText(null);
        dashMateriel.txtStockMateriel.setText(null);
    }
    
}
