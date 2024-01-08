package patterns.facade;

/**
 * 外观角色：智能语音控制助手
 * @author Ghost
 * @version 1.0
 */
public class SmartAppliancesFacade {
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    /**
     * 通过语音控制所有智能家电的开关
     * @param message
     */
    public void say(String message){
        if (message.contains("打开")) {
            on();
        } else if (message.contains("关闭")) {
            off();
        } else {
            System.out.println("我暂时还听不懂...");
        }
    }

    /**
     * 打开所有智能家电
     */
    private void on() {
        light.on();
        tv.on();
        airCondition.on();
    }

    /**
     * 关闭所有智能家电
     */
    private void off() {
        light.off();
        tv.off();
        airCondition.off();
    }
}
