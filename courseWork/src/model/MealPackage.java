package model;

public class MealPackage {
    private String meal;
    private double price;

    public MealPackage() {
    }

    public MealPackage(String meal, double price) {
        this.meal = meal;
        this.price = price;
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

    @Override
    public String toString() {
        return "MealPackage{" +
                "meal='" + meal + '\'' +
                ", price=" + price +
                '}';
    }
}
