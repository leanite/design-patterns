package behavioral.observer;

public class HexadecimalObserver implements Observer{
    @Override
    public void update(int value) {
        System.out.println("Hexadecimal: " + Integer.toHexString(value));
    }
}
