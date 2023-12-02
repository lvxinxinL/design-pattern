package patterns.prototype.demo;

/**
 * 访问类：使用具体原型类中的 clone() 复制对象
 * @author Ghost
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType realizeType = new RealizeType();// 创建原型对象
        RealizeType clone = realizeType.clone();// 复制原型对象，并没有调用 RealizeType 的构造函数说明新对象不是new出来的
        System.out.println("原型对象对象和克隆出来的对象是否是同一个对象？" + (realizeType == clone));// false
    }
}
