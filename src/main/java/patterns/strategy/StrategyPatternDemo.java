package patterns.strategy;

/**
 * 访问类
 * @author Ghost
 * @version 1.0
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        // 春节期间，使用春节促销策略
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.sale();
        System.out.println("===========================");

        // 中秋节期间，使用中秋节促销策略
        salesMan.setStrategy(new StrategyB());
        salesMan.sale();
        System.out.println("===========================");

        // 圣诞节期间，使用圣诞节促销策略
        salesMan.setStrategy(new StrategyC());
        salesMan.sale();
        System.out.println("===========================");
    }
}
