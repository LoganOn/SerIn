package pl.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import pl.main.Main;

public class MenuController {
    @FXML
    public void printComingServices(){
        Main.set_pane(4);
    }
    @FXML
    public void printDoneServices(){
        Main.set_pane(5);
    }
    @FXML
    public void service(){
        Main.set_pane(6);
    }
    @FXML
    public void exit(){
        Platform.exit();
    }
}
