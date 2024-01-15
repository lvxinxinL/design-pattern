package patterns.observer;

/**
 * 抽象观察者类
 * @author Ghost
 * @version 1.0
 */
public interface Observer {

    /**
     * 接收到主题对象的通知信息
     * @param message
     */
    void update(String message);

}
