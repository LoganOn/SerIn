package pl.main;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    static StackPane root;
    static List<Pane> pane = new ArrayList<Pane>();
    private static int index = 0;


    @Override
    public void start(Stage primaryStage) throws Exception {


        try {
            root = (StackPane) FXMLLoader.load(getClass().getResource("/fxml/mainScreen.fxml"));

            pane.add((Pane) FXMLLoader.load(getClass().getResource("/fxml/login.fxml")));
            pane.add((Pane) FXMLLoader.load(getClass().getResource("/fxml/baseSelection.fxml")));
            pane.add((Pane) FXMLLoader.load(getClass().getResource("/fxml/base.fxml")));
            pane.add((Pane) FXMLLoader.load(getClass().getResource("/fxml/menu.fxml")));
            pane.add((Pane) FXMLLoader.load(getClass().getResource("/fxml/comService.fxml")));
            pane.add((Pane) FXMLLoader.load(getClass().getResource("/fxml/doneService.fxml")));
            pane.add((Pane) FXMLLoader.load(getClass().getResource("/fxml/service1.fxml")));
            pane.add((Pane) FXMLLoader.load(getClass().getResource("/fxml/service2.fxml")));
            root.getChildren().add(pane.get(0));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("SerIn");
            primaryStage.show();
        } catch (Exception e) {

        }
    }

    public static void set_pane(int idx) {
        root.getChildren().remove(pane.get(index));
        root.getChildren().add(pane.get(idx));
        index = idx;
    }

    public static void main(String[] args) {
        System.out.println("start");
        launch(args);
    }
}


