package patterns.adapter.class_adapter;

/**
 * 目标接口
 *
 * @author Ghost
 * @version 1.0
 */
public interface TFCard {

    String readTF();

    void writeTF(String msg);

}
