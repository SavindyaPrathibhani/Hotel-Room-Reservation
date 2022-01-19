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
import java.util.ResourceBundle;

public class AnnualIncomeWindowController implements Initializable {
    public ComboBox cbxYearOfAnnual;

    public void searchOnAction(ActionEvent actionEvent) throws IOException {
        String years = cbxYearOfAnnual.getSelectionModel().getSelectedItem().toString();

        if(years.equals("2021")){
            URL resource = getClass().getResource("../view/annual2021Report.fxml");
            Parent load = FXMLLoader.load(resource);
            Scene scene = new Scene(load);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
    }
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> list1 = FXCollections.observableArrayList("2021");
        cbxYearOfAnnual.setItems(list1);
    }
}
