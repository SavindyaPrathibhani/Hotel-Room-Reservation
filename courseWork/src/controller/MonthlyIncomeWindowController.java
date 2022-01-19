package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;

public class MonthlyIncomeWindowController implements Initializable {
    public ComboBox cbxYearOfMonthly;
    public ComboBox cbxMonthOfMonthly;

    public void searchOnAction(ActionEvent actionEvent) throws IOException {

        String year = cbxYearOfMonthly.getSelectionModel().getSelectedItem().toString();
        String month = cbxMonthOfMonthly.getSelectionModel().getSelectedItem().toString();

        if(year.equals("2021") && month.equals("December")){
            URL resource = getClass().getResource("../view/dec2021Report.fxml");
            Parent load = FXMLLoader.load(resource);
            Scene scene = new Scene(load);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> list1 = FXCollections.observableArrayList("2020","2021","2022","2023");
        cbxYearOfMonthly.setItems(list1);

        ObservableList<String> list2 = FXCollections.observableArrayList("January","February","March","April","May","June","July","August","September","October","November","December");
        cbxMonthOfMonthly.setItems(list2);

    }
}
