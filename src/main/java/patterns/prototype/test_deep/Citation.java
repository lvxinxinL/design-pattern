package patterns.prototype.test_deep;

import java.io.Serializable;

/**
 * 奖状类：具体原型类
 * @author Ghost
 * @version 1.0
 */
public class Citation implements Cloneable, Serializable {

    private Student stu;

    public Citation() {
        System.out.println("创建三号学生奖状...");
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    /*private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    // 重写 clone() 方法
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show() {
        System.out.println(stu.getName() + "同学，恭喜你获得三好学生奖状");
    }

}
