package patterns.singleton.demo3;

/**
 * 懒汉式方式一：线程不安全 & 安全
 * @author Ghost
 * @version 1.0
 */
public class Singleton {
    // 1、私有化构造函数
    private Singleton() {}
    // 2、声明私有变量
    private static Singleton instance;
    // 3、提供访问方法
    public static synchronized Singleton getInstance() {// 加上同步锁，保证线程安全
        if(instance == null) {// 第一次调用才创建，已经创建过了就直接返回之前的对象
            instance = new Singleton();// 初始化一次单例对象
        }
        return instance;
    }
}
