package patterns.factory.factory_method;

/**
 * 具体工厂：生产拿铁咖啡
 * @author Ghost
 * @version 1.0
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    // 生产拿铁咖啡的细节
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
