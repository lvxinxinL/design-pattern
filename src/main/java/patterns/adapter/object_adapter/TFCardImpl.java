package patterns.adapter.object_adapter;

/**
 * 目标接口实现类
 *
 * @author Ghost
 * @version 1.0
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg = "TFCard read...";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write...");
    }
}
