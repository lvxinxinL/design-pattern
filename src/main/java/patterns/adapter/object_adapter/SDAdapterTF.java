package patterns.adapter.object_adapter;

/**
 * 适配器类（转换器）
 * @author Ghost
 * @version 1.0
 */
public class SDAdapterTF implements SDCard {

    // 声明目标接口对象
    private TFCard tfCard;

    // 在构造函数中初始化 tfCard 对象
    public SDAdapterTF(TFCardImpl tfCardImpl) {
        tfCard = tfCardImpl;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        tfCard.writeTF(msg);
    }
}
