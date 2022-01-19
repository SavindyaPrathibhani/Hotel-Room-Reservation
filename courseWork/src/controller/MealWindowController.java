package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import db.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.MealPackage;
import view.tm.MealPackageTM;

import java.util.Optional;

public class MealWindowController {
    public TableView<MealPackageTM> tblMeals;
    public TableColumn colMeal;
    public TableColumn colPrice;
    public TableColumn colOption;
    public JFXTextField txtMeal;
    public JFXTextField txtPrice;
    public JFXButton btnSave;

    public void initialize(){
        colMeal.setCellValueFactory(new PropertyValueFactory("meal"));
        colPrice.setCellValueFactory(new PropertyValueFactory("price"));
        colOption.setCellValueFactory(new PropertyValueFactory("btn"));

        loadMealPackage();

        tblMeals.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            setData(newValue);
        });
    }

    private void setData(MealPackageTM tm) {
        btnSave.setText("Update Meal");
        txtMeal.setText(tm.getMeal());
        txtPrice.setText(String.valueOf(tm.getPrice()));
    }

    private void loadMealPackage() {
        ObservableList<MealPackageTM> obList = FXCollections.observableArrayList();
        for (MealPackage m : Database.mealsTable
             ) {
            Button btn =new Button("Delete");
            MealPackageTM tm = new MealPackageTM(m.getMeal(), m.getPrice(), btn);
            obList.add(tm);

            btn.setOnAction((e)->{

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Do you want to Delete?", ButtonType.YES, ButtonType.NO);
                Optional<ButtonType> buttonType = alert.showAndWait();
                if (buttonType.get().equals(ButtonType.YES)) {
                    Database.mealsTable.remove(m);
                    obList.remove(tm);
                }
            });
        }
        tblMeals.setItems(obList);
    }


    public void btnAddMealOnAction(ActionEvent actionEvent) {

        if(btnSave.getText().equals("Add New Meal")){

            MealPackage m1 = new MealPackage(
                    txtMeal.getText(),
                    Double.parseDouble(txtPrice.getText())
            );
            Database.mealsTable.add(m1);
            loadMealPackage();

        }else{
            //update
        }


    }
}
