package app.controller;

import app.component.StatModalAffaire;
import app.component.StatModalEtat;
import app.component.StatModalMateriel;
import app.component.StatModalVente;
import app.model.AchatModel;
import app.model.ClientModel;
import app.model.InformationAchat;
import app.model.InformationClient;
import app.model.InformationMateriel;
import app.model.MaterielModel;
import app.model.StatModel;
import app.view.Dashboard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class StatMaterielController implements ActionListener {
    private InformationAchat achat;
    private InformationClient client;
    private InformationMateriel materiel;
    private Dashboard dashStat;
    private AchatModel modAchat;
    private ClientModel modCli;
    private MaterielModel modMat;
    private StatModel modStat;
    private StatModalMateriel frmStatMat ; 

    public StatMaterielController(Dashboard dashStat, StatModel modStat) {
        this.dashStat = dashStat;
        this.modStat = modStat;
        
        this.dashStat.btnSeeListMaterielClient.addActionListener(this);
        this.dashStat.btnSeeListMatVendu.addActionListener(this);
        this.dashStat.btnListStockEtat.addActionListener(this);
        this.dashStat.btnSeeChiffreAffaire.addActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == dashStat.btnSeeListMaterielClient){
           
           if(dashStat.txtNumClientSearchStat.getText().equals("")){  
               JOptionPane.showMessageDialog(dashStat, "Champ vide ou choix vide ! " );
           }else{
               String numCli = dashStat.txtNumClientSearchStat.getText();
               
               client = new InformationClient();
               client.setNumCli(numCli);
      
                Object[] columns = new Object[3];
                int numRowCount = modStat.listerClientByNum(client).size();

                for(int i = 0; i < numRowCount ; i++){
                    columns[0] = modStat.listerClientByNum(client).get(i).getNumCli();
                    columns[1] = modStat.listerClientByNum(client).get(i).getNomCli();
                    columns[2] = modStat.listerClientByNum(client).get(i).getAdrCli();
                    
                } 
                
                client.setNumCli( columns[0] + "");
                client.setNomCli( columns[1] + "");
                client.setAdrCli( columns[2] + "");
                
                StatModalMateriel frmModalStatMat = new StatModalMateriel(dashStat,true,client);
                frmModalStatMat.setVisible(true);
               
               
           } 
  
       }
        
       if(e.getSource() == dashStat.btnSeeListMatVendu){
           StatModalVente frmModalStatVente = new StatModalVente(dashStat,true);
           frmModalStatVente.setVisible(true);
       } 
       
       if(e.getSource() == dashStat.btnListStockEtat){
           StatModalEtat frmModalStatEtat = new StatModalEtat(dashStat,true);
           frmModalStatEtat.setVisible(true);
       }
       
       if(e.getSource() == dashStat.btnSeeChiffreAffaire){
           int year = dashStat.jYearChooser1.getYear();
           StatModalAffaire frmModalStatAffaire = new StatModalAffaire(dashStat,true,year);
           frmModalStatAffaire.setVisible(true);
       }
    }
    
}
