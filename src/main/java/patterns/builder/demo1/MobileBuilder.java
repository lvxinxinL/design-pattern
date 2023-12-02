package patterns.builder.demo1;

/**
 * 具体建造者：建造摩拜单车
 * @author Ghost
 * @version 1.0
 */
public class MobileBuilder extends Builder{

    /**
     * 建造自行车框架
     */
    public void buildFrame() {
        bike.setFrame("碳纤维");
    }

    /**
     * 建造自行车座椅
     */
    public void buildSeat() {
        bike.setSeat("牛皮");
    }

    public Bike createBike() {
        return bike;
    }
}
