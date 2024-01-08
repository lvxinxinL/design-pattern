package patterns.bridge;

/**
 * 实现化角色：视频文件
 * @author Ghost
 * @version 1.0
 */
public interface VideoFile {
    // 解码功能
    void decode(String fileName);
}
