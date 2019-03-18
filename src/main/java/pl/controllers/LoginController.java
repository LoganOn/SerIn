package pl.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import pl.main.Main;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;

import java.util.prefs.Preferences;


public class LoginController {
    @FXML
    private CheckBox rememberMe;

    @FXML
    private PasswordField password;

    @FXML
    private TextField userName;

    Preferences preferences;


    public void initialize() {
        preferences = Preferences.userNodeForPackage(LoginController.class);

        if (preferences != null) {
            if (!preferences.get("username", null).isEmpty()) {
                userName.setText(preferences.get("username", null));
                password.setText(preferences.get("password", null));
            }
        }

    }

    @FXML
    public void login(ActionEvent event) {

        if (userName.getText().equals("admin") && password.getText().equals("admin")) {

            if (rememberMe.isSelected()) {

                preferences.put("username", userName.getText());
                preferences.put("password", password.getText());
            } else {
                preferences.put("username", "");
                preferences.put("password", "");
            }
            Main.set_pane(1);

        } else {
            System.out.println("Nieprawidłowy login lub hasło");
        }


    }
}
