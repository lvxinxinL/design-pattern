package patterns.factory.abstract_factory;

/**
 * 具体工厂：意大利风味甜品工厂
 * 生产拿铁咖啡和抹茶慕斯
 * @author Ghost
 * @version 1.0
 */
public class ItalyDessertFactory implements DessertFactory{

    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
