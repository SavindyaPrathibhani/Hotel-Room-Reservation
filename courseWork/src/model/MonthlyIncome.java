package model;

public class MonthlyIncome {
    private String head;
    private double cost;

    public MonthlyIncome() {
    }

    public MonthlyIncome(String head, double cost) {
        this.head = head;
        this.cost = cost;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "MonthlyIncome{" +
                "head='" + head + '\'' +
                ", cost=" + cost +
                '}';
    }
}
