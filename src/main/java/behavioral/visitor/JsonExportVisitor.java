package behavioral.visitor;

import java.util.List;

public class JsonExportVisitor implements Visitor {

    public String export(List<Shape> shapes) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for(Shape shape : shapes) {
            sb.append("\n");
            sb.append(shape.accept(this));
            sb.append(",");
        }

        sb.deleteCharAt(sb.length()-1);
        sb.append("\n]");
        return sb.toString();
    }

    @Override
    public String visitDot(Dot dot) {
        return "{\n" +
                "  \"class\": \"" + dot.getClass().getSimpleName()+"\",\n" +
                "  \"id\": \""+ dot.getId() +"\",\n" +
                "  \"x\": "+ dot.getX() +",\n" +
                "  \"y\": "+ dot.getY() +"\n" +
                "}";
    }

    @Override
    public String visitCircle(Circle circle) {
        return "{\n" +
                "  \"class\": \"" + circle.getClass().getSimpleName()+"\",\n" +
                "  \"id\": \""+ circle.getId() +"\",\n" +
                "  \"x\": "+ circle.getX() +",\n" +
                "  \"y\": "+ circle.getY() +",\n" +
                "  \"radius\": "+ circle.getRadius() +"\n" +
                "}";
    }

    @Override
    public String visitRectangle(Rectangle rectangle) {
        return "{\n" +
                "  \"class\": \"" + rectangle.getClass().getSimpleName()+"\",\n" +
                "  \"id\": \""+ rectangle.getId() +"\",\n" +
                "  \"x\": "+ rectangle.getX() +",\n" +
                "  \"y\": "+ rectangle.getY() +",\n" +
                "  \"width\": "+ rectangle.getWidth() +",\n" +
                "  \"height\": "+ rectangle.getHeight() +"\n" +
                "}";
    }
}
