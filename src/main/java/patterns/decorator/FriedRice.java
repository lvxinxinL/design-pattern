package patterns.decorator;

/**
 * 具体构件类：炒饭类
 * @author Ghost
 * @version 1.0
 */
public class FriedRice extends FastFood{
    public FriedRice() {
        super(10, "炒饭");
    }

    @Override
    public double cost() {
        return getPrice();
    }
}
