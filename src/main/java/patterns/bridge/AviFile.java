package patterns.bridge;

/**
 * 具体实现化角色：Avi 视频文件
 * @author Ghost
 * @version 1.0
 */
public class AviFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("Avi 视频文件：" + fileName);
    }
}
