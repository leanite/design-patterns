package behavioral.visitor;

public interface Shape {
    void draw();
    String accept(Visitor visitor);
}
