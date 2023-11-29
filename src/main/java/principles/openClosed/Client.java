package principles.openClosed;

/**
 * 测试类
 * @author Ghost
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 1. 创建搜狗输入法对象
        SouGouInput souGouInput = new SouGouInput();
        // 2. 创建默认皮肤对象
//        DefaultSkin defaultSkin = new DefaultSkin();
        // 2. 创建Ghost皮肤对象
        GhostSkin ghostSkin = new GhostSkin();
        // 3. 设置输入法的皮肤
        souGouInput.setSkin(ghostSkin);
        // 4. 显示皮肤
        souGouInput.display();
    }
}
