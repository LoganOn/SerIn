package pl.controllers;

import javafx.fxml.FXML;
import pl.main.Main;

public class BaseController {
    @FXML
    public void openExampleBase(){
        Main.set_pane(3);
    }
}
