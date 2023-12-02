package patterns.builder.demo1;

/**
 * 具体建造者：建造 ofo 单车
 * @author Ghost
 * @version 1.0
 */
public class OfoBuilder extends Builder{

    @Override
    public void buildFrame() {
        bike.setFrame("铝合金");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("塑料");
    }

    public Bike createBike() {
        return bike;
    }
}
