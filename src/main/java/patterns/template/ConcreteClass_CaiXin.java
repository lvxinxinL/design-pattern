package patterns.template;

/**
 * 菜心类
 * @author Ghost
 * @version 1.0
 */
public class ConcreteClass_CaiXin extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("倒入的蔬菜是 菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("倒入的调料是 蒜蓉");
    }
}
