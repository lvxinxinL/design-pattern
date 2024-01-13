package patterns.command;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 订单类
 * @author Ghost
 * @version 1.0
 */
public class Order {

    private int dinningTableNum;// 餐桌号码
    private Map<String, Integer> dishMap = new HashMap<>();// 订单菜品名称、份数

    public int getDinningTableNum() {
        return dinningTableNum;
    }

    public void setDinningTableNum(int dinningTableNum) {
        this.dinningTableNum = dinningTableNum;
    }

    public Map<String, Integer> getDishMap() {
        return dishMap;
    }

    public void setDish(String name, int num) {
        dishMap.put(name, num);
    }
}
