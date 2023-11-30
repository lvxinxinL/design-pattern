package patterns.factory.factory_method;

/**
 * 客户端：点咖啡
 * @author Ghost
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建咖啡店对象
        CoffeeStore store = new CoffeeStore();

        // 创建具体工厂，要点哪种咖啡就创建对应的具体工厂，将具体工厂传给咖啡店
//        CoffeeFactory coffeeFactory = new AmericanCoffeeFactory();
        CoffeeFactory coffeeFactory = new LatteCoffeeFactory();

        // 咖啡店根据具体的咖啡工厂来提供咖啡，生产咖啡的细节在具体工厂中
        store.setCoffeeFactory(coffeeFactory);
        store.orderCoffee();
    }
}
