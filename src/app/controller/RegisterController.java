package app.controller;

import app.model.InformationRegister;
import app.model.RegisterModel;
import app.view.Register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Base64;
import java.util.Base64.Encoder;
import javax.swing.JOptionPane;
import app.component.dialogMessage.DialogMessageCorrect;


public class RegisterController implements ActionListener{
    private InformationRegister register;
    private RegisterModel modRegister;
    private Register frmRegister;

    Encoder encoder = Base64.getEncoder();
    
    public RegisterController(InformationRegister register, RegisterModel modRegister, Register frmRegister) {
        this.register = register;
        this.modRegister = modRegister;
        this.frmRegister = frmRegister;
        
        this.frmRegister.btn_save_register.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == frmRegister.btn_save_register){
            
            if(verifyPassword()){
                register.setUsername(encoder.encodeToString((frmRegister.txt_username_register.getText()).getBytes()));
                register.setPassword(encoder.encodeToString((frmRegister.txt_password_register.getText()).getBytes())); 
                
                
                 if(modRegister.saveRegister(register)){
                    
                    DialogMessageCorrect dlg = new DialogMessageCorrect(frmRegister,true,"Utilisateur ajouté en succès");
                    dlg.setVisible(true);
                    
                    resetInput();
                }else{
                     JOptionPane.showMessageDialog(null, "Erreur d'enregistrement de l'utilisateur");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Mot de passe incorrect");

            }
            
        }
    }
    
    public boolean verifyPassword(){
        
        try{
            String password = encoder.encodeToString((frmRegister.txt_password_register.getText()).getBytes());
            String passwordConfirm = encoder.encodeToString((frmRegister.txt_passwordConfirm_register.getText()).getBytes());
            
            return password.equals(passwordConfirm);
        }catch(Exception e){
            System.err.println(e);
            return false;
        }   
    }
    
    public void resetInput(){
        frmRegister.txt_username_register.setText(null);
        frmRegister.txt_password_register.setText(null);
        frmRegister.txt_passwordConfirm_register.setText(null);
    }
    
}
