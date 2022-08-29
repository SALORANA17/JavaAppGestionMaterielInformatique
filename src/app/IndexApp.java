package app;

import app.view.Login;
import app.component.LoadingBeginApp;
import app.controller.ClientController;
import app.controller.LoginController;
import app.controller.RegisterController;
import app.model.ClientModel;
import app.model.InformationClient;
import app.model.InformationRegister;
import app.model.LoginModel;
import app.model.RegisterModel;
import app.view.Dashboard;
import app.view.Register;

public class IndexApp {
    
    public static void main(String args[]){
        
        InformationRegister register = new InformationRegister();
        LoginModel modLogin = new LoginModel();
        Login frmLogin = new Login();
        LoginController loginController = new LoginController(register,modLogin,frmLogin);
    
        LoadingBeginApp load = new LoadingBeginApp();
        load.setVisible(true);

        try{
            for(int i = 0; i < 100 ; i++){
                Thread.sleep(60);
                load.LoadingProgressBar.setValue(i);
            }
        }catch(InterruptedException e){

        }

        load.setVisible(false);

        frmLogin.setVisible(true);

        //load.dispose();
   } 
}
