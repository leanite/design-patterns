package structural.proxy.youtube;

import java.util.List;

public interface YoutubeService {
    List<Video> listVideos();
    Video getVideoInfo(String id);
    void downloadVideo(String id);
}
