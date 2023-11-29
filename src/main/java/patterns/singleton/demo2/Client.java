package patterns.singleton.demo2;

/**
 * 访问单例类
 * @author Ghost
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
//        Singleton singleton = new Singleton();// 外部不能创建 singleton 对象
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println("instance1 == instance2?: " + (instance1 == instance2));// true
    }
}
