package patterns.proxy.jdk_proxy;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 创建代理对象的工厂类
 * @author Ghost
 * @version 1.0
 */
public class ProxyFactory {

    // 要代理的对象
    TrainStation station = new TrainStation();

    /**
     * 获取代理对象
     * @return
     */
    public SellTickets getProxyObject() {
        return (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),// 获取类加载器，用来加载代理类
                station.getClass().getInterfaces(),// 获取代理类实现的接口
                // 代理对象的调用处理程序，执行接口中的方法就会执行 invoke() 方法
                new InvocationHandler() {
                    /**
                     * 代理对象执行的对应接口中的方法实际上就是 invoke() 方法
                     * @param proxy 代理对象，就是 proxyObject 对象，在 invoke 方法中基本不用
                     *
                     * @param method 对接口中的方法进行封装的 method 对象
                     *
                     * @param args 调用（目标）方法的实际参数
                     *
                     * @return 方法的返回值
                     * @throws Throwable
                     */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代售点收取一定的服务费用");// 增强被代理对象的方法
                        // 执行目标对象的相应方法
                        Object obj = method.invoke(station, args);
                        return obj;
                    }
                }
        );
    }

}
