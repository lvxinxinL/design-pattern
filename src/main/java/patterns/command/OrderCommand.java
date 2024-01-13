package patterns.command;

import java.util.Map;
import java.util.Set;

/**
 * 具体命令类：通过调用接收者来完成请求的处理
 * @author Ghost
 * @version 1.0
 */
public class OrderCommand implements Command{
    // 命令的接收者
    private SeniorChef receiver;
    // 订单
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDinningTableNum() + "桌的订单");
        Map<String, Integer> dishMap = order.getDishMap();
        Set<String> keySet = dishMap.keySet();
        for (String dishName : keySet) {
            receiver.cook(dishName, dishMap.get(dishName));
        }
        System.out.println(order.getDinningTableNum() + "桌的餐已备好，请上菜...");
    }
}
