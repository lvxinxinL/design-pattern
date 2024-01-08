package patterns.flyweight;

import javax.swing.*;

/**
 * 访问类
 * @author Ghost
 * @version 1.0
 */
public class FlyWeightPatternDemo {
    public static void main(String[] args) {
        AbstractBox iBox = BoxFactory.getInstance().getBox("I");
        iBox.display("红色");
        System.out.println("=======================");

        AbstractBox lBox = BoxFactory.getInstance().getBox("L");
        lBox.display("红色");
        System.out.println("=======================");

        AbstractBox oBox1 = BoxFactory.getInstance().getBox("O");
        oBox1.display("红色");
        AbstractBox oBox2 = BoxFactory.getInstance().getBox("O");
        oBox2.display("蓝色");
        System.out.println("oBox1 和 oBox2 是否是同一个对象？" + (oBox1 == oBox2));// true （是用一个对象，只是外部状态不同）


    }
}
