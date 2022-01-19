package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminWindowController {

    public Label lbl1;
    public Label lbl2;
    public Label lbl3;
    public Label lblIncomeReports;


    public void roomsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/adminRoomsWindow.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void mealOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/mealWindow.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void annualOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/annualIncomeWindow.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void monthlyOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/monthlyIncomeWindow.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
