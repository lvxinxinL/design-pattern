package patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题类（具体被观察者）：微信公众号
 * @author Ghost
 * @version 1.0
 */
public class SubscriptionSubject implements Subject{
    // 定义集合存储观察者对象
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : observerList) {
            observer.update(message);
        }
    }
}
