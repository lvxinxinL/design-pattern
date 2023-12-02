package patterns.builder.demo1;

/**
 * 指挥者类：调用具体建造者来按顺序构建产品
 * @author Ghost
 * @version 1.0
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {// 传入建造者对象，指定建造方法
        this.builder = builder;
    }

    public Bike construct() {// 按顺序构建产品
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
