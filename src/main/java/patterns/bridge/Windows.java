package patterns.bridge;

/**
 * 扩展抽象化角色：Windows 系统
 * @author Ghost
 * @version 1.0
 */
public class Windows extends OperatingSystem{

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
        System.out.println("Windows 系统播放：" + fileName);
    }
}
