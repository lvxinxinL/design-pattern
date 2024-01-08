package patterns.flyweight;

import javax.swing.*;
import java.util.HashMap;

/**
 * 享元工厂：负责创建和管理享元对象，将工厂设计为单例
 * @author Ghost
 * @version 1.0
 */
public class BoxFactory {

    // 使用 HashMap 来存储对象
    private HashMap<String, AbstractBox> map;

    // 私有化构造函数，在构造函数中进行初始化
    private BoxFactory() {
        map = new HashMap<String, AbstractBox>();
        map.put("L", new LBox());
        map.put("O", new OBox());
        map.put("I", new IBox());
    }

    // 获取本类对象
    public static BoxFactory getInstance() {
        return factory;
    }
    private static BoxFactory factory = new BoxFactory();

    // 根据名称获取 box 对象
    public AbstractBox getBox(String name) {
        return map.get(name);
    }
}
