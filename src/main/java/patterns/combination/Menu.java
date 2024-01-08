package patterns.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单：树枝节点
 * @author Ghost
 * @version 1.0
 */
public class Menu extends MenuComponent{

    // 菜单可以包含子菜单和子菜单项
    private List<MenuComponent> menuComponentList = new ArrayList<>();

    public Menu(String name, int level) {
        super(name, level);
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }
}
