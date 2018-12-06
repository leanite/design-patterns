package structural.proxy.youtube;

public class Video {

    private String id;
    private String name;
    private int length;

    public Video(String id, String name, int length) {
        this.id = id;
        this.name = name;
        this.length = length;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", length=" + length +
                '}';
    }
}
