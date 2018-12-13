package behavioral.visitor;

import java.util.Arrays;
import java.util.List;

public class MainUsage {
    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        List<Shape> shapes = Arrays.asList(dot, circle, rectangle);

        JsonExportVisitor exportVisitor = new JsonExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }
}
