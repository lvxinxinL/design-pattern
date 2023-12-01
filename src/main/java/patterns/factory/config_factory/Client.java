package patterns.factory.config_factory;

/**
 * 测试类
 * @author Ghost
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 根据名称从咖啡工厂中获取咖啡对象
//        Coffee coffee = CoffeeFactory.createCoffee("american");// 美式咖啡
        Coffee coffee = CoffeeFactory.createCoffee("latte");// 拿铁咖啡
        System.out.println(coffee.getName());
    }
}
