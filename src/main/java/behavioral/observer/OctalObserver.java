package behavioral.observer;

public class OctalObserver implements Observer{
    @Override
    public void update(int value) {
        System.out.println("Octal: " + Integer.toOctalString(value));
    }
}
