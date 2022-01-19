package controller;

import com.jfoenix.controls.JFXTextField;
import db.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import model.Customers;
import model.MealPackage;
import view.tm.CustomersTM;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ReserveRoomWindowController implements Initializable {
    public JFXTextField txtId;
    public JFXTextField txtName;
    public JFXTextField txtContact;
    public JFXTextField txtDateIn;
    public JFXTextField txtDateOut;
    public JFXTextField txtAddress;
    public ComboBox cbxSelectMeal;
    public ComboBox cbxSelectRoom;
    public JFXTextField txtEmail;


    public void reserveOnAction(ActionEvent actionEvent) {

        Customers c1 = new Customers(
                txtId.getText(),
                txtName.getText(),
                txtContact.getText(),
                txtAddress.getText(),
                txtDateIn.getText(),
                txtDateOut.getText(),
                txtEmail.getText(),
                cbxSelectMeal.getSelectionModel().getSelectedItem().toString(),
                cbxSelectRoom.getSelectionModel().getSelectedItem().toString()
        );
        Database.customersTable.add(c1);

    }


    public void detailsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/CustomersDetails.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> list1 = FXCollections.observableArrayList("local meals", "Chinese meals","French meals");
        cbxSelectMeal.setItems(list1);
        ObservableList<String> list2 = FXCollections.observableArrayList("Single", "Double","Triple","Quad");
        cbxSelectRoom.setItems(list2);
    }
}
