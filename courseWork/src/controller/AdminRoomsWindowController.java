package controller;

import com.jfoenix.controls.JFXTextField;
import db.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.MealPackage;
import model.Rooms;
import view.tm.RoomsTM;

import java.nio.FloatBuffer;
import java.util.Optional;

public class AdminRoomsWindowController {
    public TableView<RoomsTM> tblAdminRooms;
    public TableColumn colRoomType;
    public TableColumn colDesc;
    public TableColumn colNoOfRooms;
    public TableColumn colCost;
    public TableColumn colOption;
    public JFXTextField txtRoomType;
    public JFXTextField txtDesc;
    public JFXTextField txtNoOfRooms;
    public JFXTextField txtCost;
    public Button btnAddRoom;

    public void initialize(){
        colRoomType.setCellValueFactory(new PropertyValueFactory("roomType"));
        colDesc.setCellValueFactory(new PropertyValueFactory("description"));
        colNoOfRooms.setCellValueFactory(new PropertyValueFactory("noOfRooms"));
        colNoOfRooms.setCellValueFactory(new PropertyValueFactory("noOfRooms"));
        colCost.setCellValueFactory(new PropertyValueFactory("costPerDay"));
        colOption.setCellValueFactory(new PropertyValueFactory("btn"));

        loadAllRooms();
        tblAdminRooms.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            setData(newValue);
        });
    }

    private void setData(RoomsTM tm) {
        btnAddRoom.setText("Update Rooms");
        txtRoomType.setText(tm.getRoomType());
        txtDesc.setText(tm.getDescription());
        txtNoOfRooms.setText(String.valueOf(tm.getNoOfRooms()));
        txtCost.setText(String.valueOf(tm.getCostPerDay()));
    }

    private void loadAllRooms() {
        ObservableList<RoomsTM> obList = FXCollections.observableArrayList();
        for (Rooms r : Database.roomsTable
             ) {
               Button btn = new Button("Delete");
               RoomsTM tm = new RoomsTM(r.getRoomType(),r.getDescription(),r.getNoOfRooms(),r.getCostPerDay(), btn);
               obList.add(tm);

            btn.setOnAction((e)->{

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Do you want to Delete?", ButtonType.YES, ButtonType.NO);
                Optional<ButtonType> buttonType = alert.showAndWait();
                if (buttonType.get().equals(ButtonType.YES)) {
                    Database.roomsTable.remove(r);
                    obList.remove(tm);
                }
            });
        }
        tblAdminRooms.setItems(obList);
    }

    public void addRoomOnAction(ActionEvent actionEvent) {
        if(btnAddRoom.getText().equals("Add Room")){

            Rooms r1 = new Rooms(
                    txtRoomType.getText(),
                    txtDesc.getText(),
                    Integer.parseInt(txtNoOfRooms.getText()),
                    Double.parseDouble(txtCost.getText())
            );
            Database.roomsTable.add(r1);
            loadAllRooms();

        }else{
            // update
        }

    }
}
