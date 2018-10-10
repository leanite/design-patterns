package structural.composite;

public class Circle extends Dot {

    private float radius;

    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle "+ radius +" ("+ x +", "+ y +")");
    }
}
