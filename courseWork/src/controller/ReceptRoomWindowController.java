package controller;

import db.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Rooms;
import view.tm.RoomsTM;

import java.util.Optional;

public class ReceptRoomWindowController {
    public TableView<RoomsTM> tblReceptRooms;
    public TableColumn colRoomTypes;
    public TableColumn colRoomNo;
    public TableColumn colCost;
    public TableColumn colSelect;
    public TableColumn colRoomDesc;

    public void initialize(){
        colRoomTypes.setCellValueFactory(new PropertyValueFactory("roomType"));
        colRoomDesc.setCellValueFactory(new PropertyValueFactory("description"));
        colRoomNo.setCellValueFactory(new PropertyValueFactory("noOfRooms"));
        colCost.setCellValueFactory(new PropertyValueFactory("costPerDay"));
        colSelect.setCellValueFactory(new PropertyValueFactory("btn"));

        loadAllRooms();

    }

    private void loadAllRooms() {
        ObservableList<RoomsTM> obList = FXCollections.observableArrayList();
        for (Rooms r : Database.roomsTable
        ) {
            Button btn = new Button("Select");
            RoomsTM tm = new RoomsTM(r.getRoomType(),r.getDescription(),r.getNoOfRooms(),r.getCostPerDay(), btn);
            obList.add(tm);

            btn.setOnAction((e)->{
                        if(btn.getText().equals("Select")) {
                            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Do you want to Select this Room?", ButtonType.YES, ButtonType.NO);
                            Optional<ButtonType> buttonType = alert.showAndWait();
                            if (buttonType.get().equals(ButtonType.YES)) {
                                btn.setText("In Maintenance");
                            }
                        }else{
                            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Do you want to Remove the selection?", ButtonType.YES, ButtonType.NO);
                            Optional<ButtonType> buttonType = alert.showAndWait();
                            if (buttonType.get().equals(ButtonType.YES)) {
                                btn.setText("Select");
                            }
                        }
            });
        }
        tblReceptRooms.setItems(obList);
    }

}
