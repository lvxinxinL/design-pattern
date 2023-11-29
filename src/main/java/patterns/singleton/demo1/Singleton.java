package patterns.singleton.demo1;

/**
 * 饿汉式方式一：静态成员变量
 * @author Ghost
 * @version 1.0
 */
public class Singleton {

    // 1、私有的构造方法，外部无法创建对象
    private Singleton(){}

    // 2、私有的本类成员变量，外部无法直接访问
    private static final Singleton singleton = new Singleton();

    // 3、提供公共访问方法，供外部获取本类对象
    public static Singleton getInstance() {
        return singleton;
    }
}
