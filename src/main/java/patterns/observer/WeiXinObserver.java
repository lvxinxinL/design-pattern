package patterns.observer;

/**
 * @author Ghost
 * @version 1.0
 */
public class WeiXinObserver implements Observer{

    private String name;// 微信用户名

    public WeiXinObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + message);
    }
}
