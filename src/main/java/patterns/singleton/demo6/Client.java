package patterns.singleton.demo6;

/**
 * 访问单例类
 * @author Ghost
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        System.out.println(instance1 == instance2);// true
    }
}
