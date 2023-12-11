package patterns.proxy.jdk_proxy;

/**
 * 真实主题类：车站实现接口的卖票功能
 * @author Ghost
 * @version 1.0
 */
public class TrainStation implements SellTickets {
    @Override
    public void sellTicket() {
        System.out.println("火车站卖票");
    }
}
