package patterns.builder.demo1;

/**
 * 产品类
 * @author Ghost
 * @version 1.0
 */
public class Bike {

    private String frame;// 车架
    private String seat;// 车座

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
