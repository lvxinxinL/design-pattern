package patterns.flyweight;

/**
 * 抽象享元角色：定义内部状态
 * @author Ghost
 * @version 1.0
 */
public abstract class AbstractBox {

    /**
     * 获取 box 形状
     * @return 形状字符串
     */
    public abstract String getShape();

    /**
     * 显示 box 形状和颜色
     * @param color 外部状态（由外部进行传递）
     */
    public void display(String color) {
        System.out.println("形状：" + getShape() + "，颜色：" + color);
    }
}
