package patterns.adapter.class_adapter;

/**
 * 适配器类（转换器）
 * @author Ghost
 * @version 1.0
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{


    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        writeTF(msg);
    }
}
