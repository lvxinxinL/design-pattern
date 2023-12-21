package patterns.decorator;

/**
 * 具体装饰者类：培根类
 * @author Ghost
 * @version 1.0
 */
public class Bacon extends Garnish{
    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
    }

    public double cost() {
        return getPrice() + getFastFood().cost();
    }

    public String getDescription() {
        return super.getDescription() + getFastFood().getDescription();
    }
}
