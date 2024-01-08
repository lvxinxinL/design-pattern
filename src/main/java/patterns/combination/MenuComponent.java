package patterns.combination;

/**
 * 菜单组件：包含子菜单和子菜单项，属于抽象根节点
 * @author Ghost
 * @version 1.0
 */
public abstract class MenuComponent {
    protected String name;
    protected int level;

    public MenuComponent(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public abstract void print();

}
