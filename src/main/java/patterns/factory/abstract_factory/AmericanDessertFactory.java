package patterns.factory.abstract_factory;

/**
 * 具体工厂：美式风味甜品工厂
 * 生产美式咖啡和提拉米苏
 * @author Ghost
 * @version 1.0
 */
public class AmericanDessertFactory implements DessertFactory{

    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    public Dessert createDessert() {
        return new Tiramisu();
    }
}
