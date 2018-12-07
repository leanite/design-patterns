package structural.facade;

public class MainUsage {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        converter.convertVideo("video.ogg", "mp4");
    }
}
