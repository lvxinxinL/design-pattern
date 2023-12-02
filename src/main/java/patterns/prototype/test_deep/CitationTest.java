package patterns.prototype.test_deep;

import java.io.*;

/**
 * 访问类：使用具体原型类 Citation 类的 clone() 方法复制原型对象
 * @author Ghost
 * @version 1.0
 */
public class CitationTest{
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Citation citation1 = new Citation();// 创建原型对象
        Student stu1 = new Student();// 创建张三学生对象
        stu1.setName("张三");
        citation1.setStu(stu1);

        // 获取对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/a.txt"));
        // 写对象
        oos.writeObject(citation1);
        // 关闭资源
        oos.close();

        // 获取对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
        // 读取对象
        Citation citation2 = (Citation) ois.readObject();
        citation2.getStu().setName("李四");
        // 关闭资源
        ois.close();

        citation1.show();
        citation2.show();
    }
}
