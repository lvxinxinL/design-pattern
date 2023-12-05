package patterns.proxy.static_proxy;

/**
 * 代理类（代售点）：代理真实对象（火车站）
 * @author Ghost
 * @version 1.0
 */
public class ProxyPoint implements SellTickets{

    private TrainStation trainStation = new TrainStation();// 真实对象

    public void sellTicket() {
        // 代售点增强功能
        System.out.println("代售点收取服务费用");

        // 调用真实对象的售票方法
        trainStation.sellTicket();
    }
}
