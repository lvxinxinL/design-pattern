package patterns.template;

/**
 * 包菜类
 * @author Ghost
 * @version 1.0
 */
public class ConcreteClass_BaoCai extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("倒入的蔬菜是 包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("倒入的调料是 辣椒");
    }
}
