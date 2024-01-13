package patterns.command;

/**
 * 接收者（实现者）类：厨师类，执行命令的对象
 * @author Ghost
 * @version 1.0
 */
public class SeniorChef {

    public void cook(String dishName, int num) {
        System.out.println("厨师准备吧 " + num +" 份 " +dishName);
    }

}
