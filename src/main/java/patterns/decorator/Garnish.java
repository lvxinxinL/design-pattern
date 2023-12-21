package patterns.decorator;

/**
 * 抽象装饰者类
 * @author Ghost
 * @version 1.0
 */
public abstract class Garnish extends FastFood{

    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood, double price, String description) {
        super(price, description);
        this.fastFood = fastFood;
    }
}
