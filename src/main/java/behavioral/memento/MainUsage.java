package behavioral.memento;

public class MainUsage {
    public static void main(String[] args) {
        Image image = new Image(0,0, 800, 600);
        History history = new History();

        System.out.println(image);
        history.save(image);

        ImageEditor.resize(image);
        history.save(image);
        System.out.println(image);

        ImageEditor.fillBackground(image, "Red");
        history.save(image);
        System.out.println(image);

        image = history.restore(0);
        System.out.println(image);

        image = history.restore(1);
        System.out.println(image);
    }
}
