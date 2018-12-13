package behavioral.memento;

public class ImageMemento {
    private int width;
    private int height;
    private String backgroundColor;
    private String state;

    public ImageMemento(int width, int height, String backgroundColor, String state) {
        this.width = width;
        this.height = height;
        this.backgroundColor = backgroundColor;
        this.state = state;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getState() {
        return state;
    }
}
