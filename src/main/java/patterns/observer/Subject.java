package patterns.observer;

/**
 * 抽象主题类（被观察者）
 * @author Ghost
 * @version 1.0
 */
public interface Subject {

    /**
     * 添加订阅者
     * @param observer
     */
    void attach(Observer observer);

    /**
     * 删除订阅者
     * @param observer
     */
    void detach(Observer observer);

    /**
     * 通知订阅者
     * @param message
     */
    void notify(String message);

}
