package patterns.adapter.object_adapter;

/**
 * 适配者类
 *
 * @author Ghost
 * @version 1.0
 */
public class SDCardImpl implements SDCard {


    @Override
    public String readSD() {
        String msg = "SDCard read...";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write..." + msg);
    }
}
