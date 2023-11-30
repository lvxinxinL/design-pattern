package patterns.factory.static_simple_factory;

/**
 * 简单咖啡工厂，处理生产咖啡的细节
 * @author Ghost
 * @version 1.0
 */
public class SimpleCoffeeFactory {

    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if(type.equals("american")) {
            coffee = new AmericanCoffee();
        } else if(type.equals("latte")) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("您点的咖啡已售空或不存在");
        }

        return coffee;
    }


}
