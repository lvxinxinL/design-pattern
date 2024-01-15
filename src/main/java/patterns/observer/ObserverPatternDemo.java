package patterns.observer;

/**
 * 访问类
 * @author Ghost
 * @version 1.0
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {

        // 创建微信公众号
        Subject subject = new SubscriptionSubject();

        // 订阅公众号
        subject.attach(new WeiXinObserver("孙悟空"));
        subject.attach(new WeiXinObserver("唐僧"));
        subject.attach(new WeiXinObserver("白龙马"));

        // 微信公众号更新，通知订阅者
        subject.notify("震惊！一大学生在期末复习时竟然……");

    }
}
