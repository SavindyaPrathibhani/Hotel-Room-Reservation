package controller;

import db.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customers;
import model.MealPackage;
import view.tm.CustomersTM;
import view.tm.MealPackageTM;

import java.util.Optional;

public class CustomersDetailsController {
    public TableView<CustomersTM> tblCustomer;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colContact;
    public TableColumn colAddress;
    public TableColumn colDateIn;
    public TableColumn colDateOUt;
    public TableColumn colMeal;
    public TableColumn colRoomType;
    public TableColumn colEmail;


    public void initialize(){
        colId.setCellValueFactory(new PropertyValueFactory("id"));
        colName.setCellValueFactory(new PropertyValueFactory("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory("address"));
        colContact.setCellValueFactory(new PropertyValueFactory("contactNo"));
        colDateIn.setCellValueFactory(new PropertyValueFactory("dateIn"));
        colDateOUt.setCellValueFactory(new PropertyValueFactory("dateOut"));
        colMeal.setCellValueFactory(new PropertyValueFactory("meal"));
        colRoomType.setCellValueFactory(new PropertyValueFactory("room"));
        colEmail.setCellValueFactory(new PropertyValueFactory("email"));


        loadAllCustomers();


    }

    public void loadAllCustomers() {
        ObservableList<CustomersTM> obList = FXCollections.observableArrayList();
        for (Customers c : Database.customersTable
        ) {
            CustomersTM tm = new CustomersTM(c.getId(),c.getName(),c.getContactNo(),c.getAddress(),c.getDateIn(),c.getDateOut(),c.getMeal(),c.getRoom(),c.getEmail());
            obList.add(tm);
        }
        tblCustomer.setItems(obList);
    }

}
