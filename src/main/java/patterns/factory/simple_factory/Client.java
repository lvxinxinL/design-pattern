package patterns.factory.simple_factory;

/**
 * 测试
 * @author Ghost
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        // 点咖啡
//        coffeeStore.orderCoffee("american");
        coffeeStore.orderCoffee("latte");
    }
}
