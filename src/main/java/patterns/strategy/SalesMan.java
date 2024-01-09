package patterns.strategy;

/**
 * 环境类：管理策略
 * @author Ghost
 * @version 1.0
 */
public class SalesMan {

    private Strategy strategy;

    // 在创建促销员对象时指定促销策略
    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public void sale() {
        strategy.show();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }
}
