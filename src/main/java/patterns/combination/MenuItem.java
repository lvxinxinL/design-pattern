package patterns.combination;

/**
 * 菜单项：叶子节点
 * @author Ghost
 * @version 1.0
 */
public class MenuItem extends MenuComponent{

    public MenuItem(String name, int level) {
        super(name, level);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}
