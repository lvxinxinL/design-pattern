package patterns.factory.factory_method;

/**
 * 具体工厂：生产美式咖啡
 * @author Ghost
 * @version 1.0
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    // 生产咖啡的细节
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
