package pl.controllers;

import javafx.fxml.FXML;
import pl.main.Main;

public class DoneServiceController {
    @FXML
    public void goBack(){
        Main.set_pane(3);
    }
}
