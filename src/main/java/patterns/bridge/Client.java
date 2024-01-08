package patterns.bridge;

/**
 * @author Ghost
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        OperatingSystem system = new Windows(new AviFile());
        system.play("mp3");
    }
}
