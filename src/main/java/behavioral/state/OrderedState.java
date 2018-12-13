package behavioral.state;

public class OrderedState implements PackageState {

    @Override
    public void nextState(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void previousState(Package pkg) {
        System.out.println("The package is in its initial state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Package ordered, not delivered to the office yet.");
    }
}