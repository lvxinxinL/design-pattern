package patterns.prototype.test_shallow;

import java.io.Serializable;

/**
 * 访问类：使用具体原型类 Citation 类的 clone() 方法复制原型对象
 * @author Ghost
 * @version 1.0
 */
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation1 = new Citation();// 创建原型对象
        Student stu1 = new Student();// 创建张三学生对象
        stu1.setName("张三");
        citation1.setStu(stu1);

        Citation citation2 = citation1.clone();// 复制原型对象
        Student stu2 = citation2.getStu();
        stu2.setName("李四");

        System.out.println("浅克隆得到的 stu1 和 stu2 是同一个对象吗？" + (stu1 == stu2));// true

        citation1.show();
        citation2.show();
    }
}
