package patterns.factory.factory_method;

/**
 * 咖啡店：点咖啡
 * @author Ghost
 * @version 1.0
 */
public class CoffeeStore {

    public CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory){
        this.coffeeFactory = coffeeFactory;
    }

    // 点咖啡
    public Coffee orderCoffee() {
        // 通过具体咖啡工厂生产对应的咖啡
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addSugar();
        coffee.addMilk();
        System.out.println("您点的" + coffee.getName() + "已完成");
        return coffee;
    }
}
