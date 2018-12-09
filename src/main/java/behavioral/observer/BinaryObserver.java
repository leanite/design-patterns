package behavioral.observer;

public class BinaryObserver implements Observer{
    @Override
    public void update(int value) {
        System.out.println("Binary: " + Integer.toBinaryString(value));
    }
}
