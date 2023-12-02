package patterns.builder.demo1;

/**
 * 访问类：使用指挥者根据不同的创建方法完成产品的创建
 * @author Ghost
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建指挥者对象
//        Director director = new Director(new MobileBuilder());
        Director director = new Director(new OfoBuilder());
        // 让指挥者指挥具体的建造者按顺序完成产品的构建
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
