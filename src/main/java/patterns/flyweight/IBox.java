package patterns.flyweight;

/**
 * 享元对象（具体享元角色）
 * @author Ghost
 * @version 1.0
 */
public class IBox extends AbstractBox{
    @Override
    public String getShape() {
        return "I";
    }
}
