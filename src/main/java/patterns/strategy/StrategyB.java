package patterns.strategy;


/**
 * 中秋节促销策略（具体策略类）
 * @author Ghost
 * @version 1.0
 */
public class StrategyB implements Strategy {
    @Override
    public void show() {
        System.out.println("中秋节促销活动：满 200 减 50");
    }
}
