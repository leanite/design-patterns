package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class MainUsage {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(20);
        circle.setRadius(15);
        shapes.add(circle);

        Circle anotherCircle = circle.typedClone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        shapes.add(rectangle);

        Rectangle anotherRectangle =  rectangle.typedClone();
        shapes.add(anotherRectangle);

        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }
    }
}
