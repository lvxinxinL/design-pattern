package patterns.adapter.object_adapter;

/**
 * 计算机类
 *
 * @author Ghost
 * @version 1.0
 */
public class Computer {

    // 从 SD 卡中读取数据
    public String readSD(SDCard sdCard) {
        if(sdCard == null) {
            throw new NullPointerException("sd card can not be null");
        }
        return sdCard.readSD();
    }
}
