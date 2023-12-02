package patterns.prototype.demo;

/**
 * 具体原型类
 * @author Ghost
 * @version 1.0
 */
public class RealizeType implements Cloneable{
    public RealizeType() {
        System.out.println("创建具体原型对象...");
    }

    // 重写 Cloneable 接口中的 clone() 方法
    protected RealizeType clone() throws CloneNotSupportedException {
        System.out.println("复制具体原型对象...");
        return (RealizeType) super.clone();
    }
}
