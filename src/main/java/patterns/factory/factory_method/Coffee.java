package patterns.factory.factory_method;

/**
 * 咖啡类
 * @author Ghost
 * @version 1.0
 */
public class Coffee {
    private String name;

    public void addSugar() {
        System.out.println("加糖");
    }

    public void addMilk() {
        System.out.println("加奶");
    }

    public String getName() {
        return name;
    }
}
