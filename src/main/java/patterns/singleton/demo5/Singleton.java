package patterns.singleton.demo5;

/**
 * 懒汉式方式四：静态内部类
 * @author Ghost
 * @version 1.0
 */
public class Singleton {
    // 1、私有构造方法
    private Singleton() {}

    // 2、定义静态内部类
    private static class SingletonHolder {
        // 3、在静态内部类中声明并初始化外部对象
        // 静态内部类只会加载一次，
        private static final Singleton INSTANCE = new Singleton();
    }

    // 4、提供访问方法
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;// 通过类名调用属性就会加载静态内部类，初始化INSTANCE，只会初始化一次
    }
}
