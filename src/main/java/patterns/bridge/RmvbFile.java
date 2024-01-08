package patterns.bridge;

/**
 * 具体实现化角色：Rmvb 视频文件
 * @author Ghost
 * @version 1.0
 */
public class RmvbFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("Rmvb 视频文件：" + fileName);
    }
}
