package JavaFXProject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import view.ViewManager;
import javafx.application.Application;
/**
 *
 * @author Eng. yazan lubbad
 */
public class JavaFXProject extends Application {
    ViewManager ViewManager;
    @Override
    public void start(Stage primaryStage) {
        ViewManager.changeSceneTologin();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
