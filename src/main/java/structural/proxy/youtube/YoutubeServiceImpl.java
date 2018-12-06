package structural.proxy.youtube;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class YoutubeServiceImpl implements YoutubeService {

    private List<Video> videos;

    public YoutubeServiceImpl() {
        videos = Arrays.asList(
                new Video("abc", "blink-182 live", 200),
                new Video("def", "Green Day live", 200),
                new Video("uvw", "Lagwagon live", 200),
                new Video("xyz", "Less Than Jake live", 200));
    }

    @Override
    public List<Video> listVideos() {
        return videos;
    }

    @Override
    public Video getVideoInfo(String id) {
        return videos.stream()
                .filter(video -> video.getId().equals(id))
                .findFirst().get();
    }

    @Override
    public void downloadVideo(String id) {
        System.out.println("Downloading video "+id+" ...");
    }
}
