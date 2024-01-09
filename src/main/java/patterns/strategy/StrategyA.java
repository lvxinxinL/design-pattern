package patterns.strategy;


/**
 * 春节促销策略（具体策略类）
 * @author Ghost
 * @version 1.0
 */
public class StrategyA implements Strategy {
    @Override
    public void show() {
        System.out.println("春节促销活动：买一送一");
    }
}
