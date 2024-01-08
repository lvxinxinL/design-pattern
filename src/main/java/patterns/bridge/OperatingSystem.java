package patterns.bridge;

/**
 * 抽象化角色：操作系统
 * @author Ghost
 * @version 1.0
 */
public abstract class OperatingSystem {
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
