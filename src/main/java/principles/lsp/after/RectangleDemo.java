package principles.lsp.after;

/**
 * 测试类
 * 里氏代换原则：任何基类可以出现的地方，子类一定可以出现
 * @author Ghost
 * @version 1.0
 */
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
        printLengthAndWidth(rectangle);
    }

    // 扩宽的方法
    public static void resize(Rectangle rectangle) {
        while(rectangle.getWidth() < rectangle.getLength()) {
            rectangle.setWidth(rectangle.getLength() + 1);
        }
    }

    // 打印长和宽
    public static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }
}
