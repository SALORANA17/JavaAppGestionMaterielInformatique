package app.controller;

import app.component.AchatEditCommande;
import app.component.AchatModalForm;
import app.component.AchatModifyAchat;
import app.component.StatModalMateriel;
import app.model.AchatModel;
import app.model.ClientModel;
import app.model.InformationAchat;
import app.model.InformationClient;
import app.model.InformationMateriel;
import app.model.InformationRegister;
import app.model.LoginModel;
import app.model.MaterielModel;
import app.model.StatModel;
import app.view.Login;
import app.view.Dashboard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import javax.swing.JOptionPane;

public class LoginController implements ActionListener{

    private InformationRegister register;
    private LoginModel modLogin;
    private Login frmLogin;
    
    Encoder encoder = Base64.getEncoder();
    Decoder decoder = Base64.getDecoder();
    
    public LoginController(InformationRegister register, LoginModel modLogin, Login frmLogin) {
        this.register = register;
        this.modLogin = modLogin;
        this.frmLogin = frmLogin;
        
        this.frmLogin.btn_connect_login.addActionListener(this);
    }
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == frmLogin.btn_connect_login){
            
            String username = encoder.encodeToString((frmLogin.txt_username_login.getText()).getBytes());
            String password = encoder.encodeToString((frmLogin.txt_password_login.getText()).getBytes());
 
            register.setUsername(username);
            register.setPassword(password);
 
            if(modLogin.connectInApp(register)){
                Dashboard dashboard = new Dashboard();
                
                InformationClient client = new InformationClient();
                ClientModel modClient = new ClientModel();
                ClientController ctrlClient = new ClientController(client,dashboard,modClient);
                
                InformationMateriel materiel = new InformationMateriel();
                MaterielModel modMat = new MaterielModel();
                MaterielController ctrlMateriel = new MaterielController(materiel,dashboard,modMat);
                
                InformationAchat achat = new InformationAchat();
                AchatModel modAchat = new AchatModel();
                AchatModifyAchat modalModAchat = new AchatModifyAchat(dashboard,true,client,materiel,achat,0);
                AchatController ctrlAchat = new AchatController(achat,client,dashboard,modAchat,modClient,modMat,materiel,modalModAchat);
                AchatModalForm modalAchat = new AchatModalForm(dashboard,true,client);
                AchatEditCommande frmAchatEdit = new AchatEditCommande(modalAchat,true,null,null,0,0,0);
                CommandeController ctrlCmd = new CommandeController(achat,client,materiel,modalAchat,modAchat,modClient,modMat,frmAchatEdit);
                
                StatModel modStat = new StatModel();
                StatModalMateriel modalMat = new StatModalMateriel(dashboard,true,client);
                StatMaterielController ctrlStat = new StatMaterielController(dashboard,modStat);
                
                byte[] bytes = decoder.decode(register.getUsername());
                dashboard.setVisible(true);
                dashboard.labelLogin.setText("Bienvenue , " + new String(bytes));
                frmLogin.dispose();
                
            }else{
                JOptionPane.showMessageDialog(null, "Nom de l'utilisateur ou mot de passe incorrect");
            }  

        }
        
        
    }
    
}
