package patterns.factory.simple_factory;

/**
 * @author Ghost
 * @version 1.0
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {

        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();// 创建简单工厂
        Coffee coffee = simpleCoffeeFactory.createCoffee(type);// 调用生产咖啡的方法

        coffee.addSugar();
        coffee.addMilk();
        System.out.println(coffee.getName());
        return coffee;
    }
}
