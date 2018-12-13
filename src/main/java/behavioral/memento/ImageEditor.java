package behavioral.memento;

public class ImageEditor {
    public static void resize(Image image) {
        int newWidth = image.getWidth() / 2;
        int newHeight = image.getHeight() / 2;

        image.setWidth(newWidth);
        image.setHeight(newHeight);
        image.setState("Resized");
    }

    public static void fillBackground(Image image, String color) {
        image.setBackgroundColor(color);
    }

    public static void selectImage(Image image) {
        image.setState("Selected");
    }
}
