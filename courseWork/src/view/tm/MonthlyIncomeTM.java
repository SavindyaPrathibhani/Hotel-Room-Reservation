package view.tm;

public class MonthlyIncomeTM {
    private String head;
    private double cost;

    public MonthlyIncomeTM() {
    }

    public MonthlyIncomeTM(String head, double cost) {
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
        return "MonthlyIncomeTM{" +
                "head='" + head + '\'' +
                ", cost=" + cost +
                '}';
    }
}
