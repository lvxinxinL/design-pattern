package patterns.factory.config_factory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 咖啡工厂类：根据配置文件创建对象
 * @author Ghost
 * @version 1.0
 */
public class CoffeeFactory {
    // 获取配置文件，并通过名称key获取对应的对象coffee，存储到容器中
    // 定义容器存储咖啡对象
    public static Map<String, Coffee> map = new HashMap<>();

    // 加载配置文件，只加载一次，写在静态代码块中
    static {
        Properties p = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            // 调用 p.load() 方法加载配置文件
            p.load(is);
            // 获取p读取到的配置文件中的集合
            Set<Object> keys = p.keySet();
            // 遍历keys，获取对应的全类名
            for (Object key : keys) {
                String className = p.getProperty((String) key);
                // 根据全类名，通过反射创建对象
                Class clazz = Class.forName(className);// 获取字节码对象
                Coffee coffee = (Coffee) clazz.newInstance();// 根据字节码对象使用无参构造方法创建咖啡对象
                // 将咖啡对象存储到容器中
                map.put((String) key, coffee);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // 根据名称获取对应的咖啡对象
    public static Coffee createCoffee(String name) {
        Coffee coffee = map.get(name);
        return coffee;
    }
}
