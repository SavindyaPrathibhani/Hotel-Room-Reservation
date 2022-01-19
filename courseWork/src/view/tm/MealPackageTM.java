package view.tm;

import javafx.scene.control.Button;


public class MealPackageTM {
    private String meal;
    private double price;
    private Button btn;

    public MealPackageTM() {
    }

    public MealPackageTM(String meal, double price, Button btn) {
        this.meal = meal;
        this.price = price;
        this.btn = btn;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "MealPackageTM{" +
                "meal='" + meal + '\'' +
                ", price=" + price +
                ", btn=" + btn +
                '}';
    }
}
