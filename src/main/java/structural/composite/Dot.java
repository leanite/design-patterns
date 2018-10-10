package structural.composite;

public class Dot implements Graphic {

    protected float x;
    protected float y;

    public Dot(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Dot ("+x+", "+y+")");
    }
}
