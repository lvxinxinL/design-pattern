package patterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 请求者类：持有命令对象，发出命令，要求命令对象执行命令
 * @author Ghost
 * @version 1.0
 */
public class Waiter {
    private List<Command> commandList = new ArrayList<>();

    public void setCommand(Command cmd) {
        // 将命令对象存储到 list 集合中
        commandList.add(cmd);
    }

    // 发起命令：下单
    public void orderUp() {
        System.out.println("服务员下单：" + "大厨，来新单啦...");
        for (Command command : commandList) {
            if (command != null) {
                command.execute();
            }
        }
    }
}
