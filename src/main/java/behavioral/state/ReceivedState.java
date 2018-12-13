package behavioral.state;

public class ReceivedState implements PackageState {

    @Override
    public void nextState(Package pkg) {
        System.out.println("This package was already received by a client.");
    }

    @Override
    public void previousState(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package received.");
    }
}