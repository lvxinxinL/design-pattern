package patterns.bridge;

/**
 * 扩展抽象化角色：Mac 系统
 * @author Ghost
 * @version 1.0
 */
public class Mac extends OperatingSystem {

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
        System.out.println("Mac 系统播放：" + fileName);
    }
}
