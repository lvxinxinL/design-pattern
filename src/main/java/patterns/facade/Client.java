package patterns.facade;

/**
 * @author Ghost
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        facade.say("打开家电");
        System.out.println("============================");
        facade.say("关闭家电");
    }
}
