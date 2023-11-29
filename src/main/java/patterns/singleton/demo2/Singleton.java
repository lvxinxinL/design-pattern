package patterns.singleton.demo2;

/**
 * 饿汉式方式二：静态代码块
 * @author Ghost
 * @version 1.0
 */
public class Singleton {
    // 1、私有化构造方法，外部无法创建对象
    private Singleton() {}

    // 2、声明私有的单例对象
    private static Singleton singleton;

    // 3、在静态代码块中初始化单例对象
    static {
        singleton = new Singleton();
    }

    // 4、提供公共访问方法，供外部访问本类对象
    public static Singleton getInstance() {
        return singleton;
    }
}
