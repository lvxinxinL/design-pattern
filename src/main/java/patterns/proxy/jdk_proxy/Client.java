package patterns.proxy.jdk_proxy;

/**
 * 通过 JDK 动态代理访问目标对象
 * @author Ghost
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 获取创建代理对象的工厂类
        ProxyFactory factory = new ProxyFactory();
        // 通过工厂中的方法获取代理对象
        SellTickets proxyObject = factory.getProxyObject();
        // 调用代理对象的方法
        proxyObject.sellTicket();
    }
}
