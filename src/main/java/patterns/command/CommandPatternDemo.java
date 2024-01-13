package patterns.command;

/**
 * 访问类
 * @author Ghost
 * @version 1.0
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        // 第一个订单
        Order order1 = new Order();
        order1.setDinningTableNum(1);
        order1.setDish("西红柿炒鸡蛋", 1);
        order1.setDish("可乐", 1);

        // 第二个订单
        Order order2 = new Order();
        order2.setDinningTableNum(2);
        order2.setDish("辣椒炒肉", 2);
        order2.setDish("酸奶", 2);

        Waiter waiter = new Waiter();
        // 要求完成多个命令
        waiter.setCommand(new OrderCommand(new SeniorChef(),order1));
        waiter.setCommand(new OrderCommand(new SeniorChef(),order2));
        // 发起命令：将命令传递给命令对象（命令对象中调用了接收者来处理请求 / 命令）
        waiter.orderUp();
    }
}
