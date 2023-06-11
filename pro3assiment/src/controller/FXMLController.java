package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import view.ViewManager;

public class FXMLController implements Initializable {
     @FXML
    private TextField usernameTextField;
    @FXML
    private TextField passwordPasswordField;
    @FXML
    private Button onLoginButtonClicked;
 private ViewManager viewManager;
@FXML
    private void onLoginButtonClicked(ActionEvent event) throws IOException {
        String username = usernameTextField.getText();
        String password = passwordPasswordField.getText();

        // Validate username and password
        if ("user".equals(username) && "userpass".equals(password)) {
            // Switch to CurrencyConversionView
            viewManager.changeSceneTodachdord();
        } else {
            // Show alert for invalid input
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Input");
            alert.setHeaderText("Invalid username or password");
            alert.showAndWait();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

   
}
