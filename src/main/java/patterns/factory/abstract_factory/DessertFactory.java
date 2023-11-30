package patterns.factory.abstract_factory;

/**
 * 抽象工厂类
 * @author Ghost
 * @version 1.0
 */
public interface DessertFactory {
    Coffee createCoffee();
    Dessert createDessert();
}
