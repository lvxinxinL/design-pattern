package patterns.singleton.demo1;

/**
 * 访问单例类
 * @author Ghost
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
//        Singleton instance = new Singleton();// 外部不能创建该类对象
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance1 == instance2);// true 获取到的是同一个对象
    }
}
