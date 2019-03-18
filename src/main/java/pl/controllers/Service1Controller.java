package pl.controllers;

import javafx.fxml.FXML;
import pl.main.Main;

public class Service1Controller {
    @FXML
    public void goAccept(){
        Main.set_pane(7);
    }
    @FXML
    public void goBack(){
        Main.set_pane(3);
    }
}

