package patterns.decorator;

/**
 * 具体装饰者类：鸡蛋类
 * @author Ghost
 * @version 1.0
 */
public class Egg extends Garnish{
    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    public double cost() {
        return getPrice() + getFastFood().cost();
    }

    public String getDescription() {
        return super.getDescription() + getFastFood().getDescription();
    }
}
