package view.tm;

import javafx.scene.control.Button;

public class RoomsTM {
    private String roomType;
    private String description;
    private int noOfRooms;
    private double costPerDay;
    private Button btn;

    public RoomsTM(String roomType, String description, int noOfRooms, double costPerDay, Button btn) {
        this.roomType = roomType;
        this.description = description;
        this.noOfRooms = noOfRooms;
        this.costPerDay = costPerDay;
        this.btn = btn;
    }

    public RoomsTM() {
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}
