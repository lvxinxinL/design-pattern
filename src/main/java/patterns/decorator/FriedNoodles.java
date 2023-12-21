package patterns.decorator;

/**
 * 具体构件类：炒面类
 * @author Ghost
 * @version 1.0
 */
public class FriedNoodles extends FastFood{
    public FriedNoodles() {
        super(12, "炒面");
    }

    @Override
    public double cost() {
        return getPrice();
    }
}
