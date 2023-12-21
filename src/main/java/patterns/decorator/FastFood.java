package patterns.decorator;

/**
 * 抽象构件类：快餐类
 * @author Ghost
 * @version 1.0
 */
public abstract class FastFood {

    private double price;
    private String description;

    public FastFood(double price, String description) {
        this.price = price;
        this.description = description;
    }

    public FastFood() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}
