package structural.facade;

import java.io.File;

public class AudioMixer {
    public static File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}