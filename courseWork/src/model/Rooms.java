package model;

public class Rooms {
    private String roomType;
    private String description;
    private int noOfRooms;
    private double costPerDay;

    public Rooms(String roomType, String description, int noOfRooms, double costPerDay) {
        this.roomType = roomType;
        this.description = description;
        this.noOfRooms = noOfRooms;
        this.costPerDay = costPerDay;
    }

    public Rooms() {
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

    @Override
    public String toString() {
        return "Rooms{" +
                "roomType='" + roomType + '\'' +
                ", description='" + description + '\'' +
                ", noOfRooms=" + noOfRooms +
                ", costPerDay=" + costPerDay +
                '}';
    }
}
