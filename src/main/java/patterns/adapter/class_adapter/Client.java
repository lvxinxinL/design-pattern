package patterns.adapter.class_adapter;

/**
 * 访问类，使用计算机类的方法读取数据
 * @author Ghost
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建计算机类
        Computer computer = new Computer();

        // 使用计算机类中的方法读取 SD 卡的数据
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("======================");

        // 使用该计算机类中的方法读取 TF 卡的数据
        // 定义适配器类
        String msg1 = computer.readSD(new SDAdapterTF());
        System.out.println(msg1);
    }
}
