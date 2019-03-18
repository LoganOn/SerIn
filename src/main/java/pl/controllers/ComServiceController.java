package pl.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import pl.main.Main;

public class ComServiceController {

    @FXML
    public void goBack(){
        Main.set_pane(3);
    }
}
