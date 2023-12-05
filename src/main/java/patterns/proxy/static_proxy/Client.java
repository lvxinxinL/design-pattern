package patterns.proxy.static_proxy;

/**
 * 访问类：通过代理类访问真实对象
 * @author Ghost
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sellTicket();
    }
}
