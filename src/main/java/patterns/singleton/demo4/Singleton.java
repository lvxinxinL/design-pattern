package patterns.singleton.demo4;

/**
 * 懒汉式方式二：双重检查锁
 * @author Ghost
 * @version 1.0
 */
public class Singleton {

    // 1、私有构造方法
    private Singleton() {}

    // 2、声明单例对象
    private static volatile Singleton instance;

    // 3、提供访问方法
    public static Singleton getInstance() {
        // 第一次判断：只有第一次创建instance，instance == null 时才需要抢占锁，不是第一次创建的直接返回instance
        if(instance == null) {
            synchronized (Singleton.class) {
                // 抢到锁之后第二次判断
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
