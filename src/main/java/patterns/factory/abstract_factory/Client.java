package patterns.factory.abstract_factory;

/**
 * 客户端点单
 * @author Ghost
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建美式风味甜品工厂（美式和提拉米苏）
//        AmericanDessertFactory factory = new AmericanDessertFactory();
        // 创建意式风味甜品工厂（拿铁和抹茶慕斯）
        ItalyDessertFactory factory = new ItalyDessertFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();
    }
}
