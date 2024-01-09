package patterns.template;

/**
 * 抽象类：定义模板方法和模板方法中的步骤
 * @author Ghost
 * @version 1.0
 */
public abstract class AbstractClass {

    // 定义模板方法：不允许子类重写（final）
    public final void cook() {
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    // 1. 相同步骤
    public void pourOil() {
        System.out.println("倒油");
    }

    public void heatOil() {
        System.out.println("热油");
    }

    // 3. 倒入蔬菜
    public abstract void pourVegetable();

    // 4. 倒入调料
    public abstract void pourSauce();

    // 5. 相同步骤
    public void fry() {
        System.out.println("翻炒菜品");
    }
}
