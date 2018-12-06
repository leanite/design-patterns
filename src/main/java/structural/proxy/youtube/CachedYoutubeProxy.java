package structural.proxy.youtube;

import java.util.ArrayList;
import java.util.List;

public class CachedYoutubeProxy implements YoutubeService{

    private YoutubeService service;
    private Video cachedVideo;
    private List<Video> cachedVideoList;
    private boolean clearCache;

    public CachedYoutubeProxy(YoutubeService service) {
        this.service = service;
        this.cachedVideo = null;
        this.cachedVideoList = new ArrayList<>();
        this.clearCache = false;
    }

    @Override
    public List<Video> listVideos() {
        if (cachedVideoList.isEmpty() || clearCache)
            cachedVideoList = service.listVideos();

        return cachedVideoList;
    }

    @Override
    public Video getVideoInfo(String id) {
        if (cachedVideo == null || clearCache)
            cachedVideo = service.getVideoInfo(id);

        return cachedVideo;
    }

    @Override
    public void downloadVideo(String id) {
        if (!downloadExists(id) || clearCache)
            service.downloadVideo(id);
    }

    private boolean downloadExists(String id) {
        return cachedVideoList.stream().anyMatch(video -> video.getId().equals(id));
    }
}
