package controller;


import view.ViewManager;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.CurrencyConverter;

public class  FXML2Controller implements Initializable {
    @FXML
    private TextField dollarsTextField;
    @FXML
    private TextField shekelsTextField;
    @FXML
    private Button onConvertButtonClicked;
    @FXML
    private Button onLogoutButtonClicked;
 private ViewManager viewManager;

    private CurrencyConverter currencyConverter = new CurrencyConverter();
        @FXML
    private void onConvertButtonClicked(ActionEvent event) {
        String dollarsString = dollarsTextField.getText();
        String shekelsString = shekelsTextField.getText();

        // Check which TextField is empty and perform the conversion
        if (dollarsString.isEmpty()) {
            // Convert shekels to dollars
            double shekels = Double.parseDouble(shekelsString);
            double dollars = currencyConverter.convertToDollars(shekels);
            dollarsTextField.setText(String.valueOf(dollars));
        } else if (shekelsString.isEmpty()) {
            // Convert dollars to shekels
            double dollars = Double.parseDouble(dollarsString);
            double shekels = currencyConverter.convertToShekels(dollars);
            shekelsTextField.setText(String.valueOf(shekels));
        }
    }
 @FXML
    private void onLogoutButtonClicked(ActionEvent event) {
        // Switch back to LoginView
        viewManager.changeSceneTologin();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
