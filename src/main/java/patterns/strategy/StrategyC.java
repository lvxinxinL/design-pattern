package patterns.strategy;


/**
 * 圣诞节促销策略（具体策略类）
 * @author Ghost
 * @version 1.0
 */
public class StrategyC implements Strategy {
    @Override
    public void show() {
        System.out.println("圣诞节促销活动：全场八折");
    }
}
