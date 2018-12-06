package structural.proxy.youtube;

public class MainUsage {
    public static void main(String[] args) {
        YoutubeService service = new YoutubeServiceImpl();
        CachedYoutubeProxy proxy = new CachedYoutubeProxy(service);

        proxy.downloadVideo("ghj");
        System.out.println(proxy.getVideoInfo("abc"));
        System.out.println(proxy.listVideos());
    }
}
