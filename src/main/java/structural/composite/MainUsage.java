package structural.composite;

public class MainUsage {

    public static void main(String[] args) {
        CompoundGraphic allGraphics = new CompoundGraphic();

        allGraphics.addGraphic(new Dot(2f, 3f));
        allGraphics.addGraphic(new Circle(1.7f, 8.6f, 5f));
        allGraphics.addGraphic(new Dot(1.7f, 8.6f));
        allGraphics.addGraphic(new Circle(7f, 5.1f, 8.4f));

        CompoundGraphic otherGraphics = new CompoundGraphic();
        otherGraphics.addGraphic(new Dot(1f, 5f));
        otherGraphics.addGraphic(new Circle(2.7f, 4.3f, 6f));

        allGraphics.addGraphic(otherGraphics);
        allGraphics.draw();
    }
}
