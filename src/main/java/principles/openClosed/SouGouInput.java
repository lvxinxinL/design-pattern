package principles.openClosed;

/**
 * 搜狗输入法
 * @author Ghost
 * @version 1.0
 */
public class SouGouInput {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}
