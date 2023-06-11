/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Eng. yazan lubbad
 */

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

 public class ViewManager extends Stage{
    
    private Scene login;
       private Scene dachdord;

    public ViewManager() throws IOException {
        
        FXMLLoader loginpage = new FXMLLoader(getClass().getResource("AdminFXML/FXMLController.fxml"));
        Parent loginpageRoot = loginpage.load();     
        login = new Scene(loginpageRoot);
        
        
        FXMLLoader dachdordpage = new FXMLLoader(getClass().getResource("AdminFXML/FXML2Controller.fxml"));
        Parent dachdordpageRoot = dachdordpage.load();     
        dachdord = new Scene(dachdordpageRoot);
        
    }
    
     public void changeSceneTologin(){
        this.setScene(login);
    }
    public void changeSceneTodachdord(){
        this.setScene(dachdord);
    }

   
 }