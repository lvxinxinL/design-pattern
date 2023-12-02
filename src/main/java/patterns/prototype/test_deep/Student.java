package patterns.prototype.test_deep;

import java.io.Serializable;

/**
 * 学生类：三好学生奖状属性
 * @author Ghost
 * @version 1.0
 */
public class Student implements Cloneable, Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
