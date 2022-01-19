package model;

public class Customers {
    private String id;
    private String name;
    private String contactNo;
    private String address;
    private String dateIn;
    private String dateOut;
    private String meal;
    private String room;
    private String email;

    public Customers(String id, String name, String contactNo, String address, String dateIn, String dateOut, String meal, String room,String email) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.meal = meal;
        this.room = room;
        this.email= email;
    }

    public Customers() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public String getDateOut() {
        return dateOut;
    }

    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", address='" + address + '\'' +
                ", dateIn='" + dateIn + '\'' +
                ", dateOut='" + dateOut + '\'' +
                ", meal='" + meal + '\'' +
                ", room='" + room + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
