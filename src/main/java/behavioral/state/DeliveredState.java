package behavioral.state;

public class DeliveredState implements PackageState {

    @Override
    public void nextState(Package pkg) {
        pkg.setState(new ReceivedState());
    }

    @Override
    public void previousState(Package pkg) {
        pkg.setState(new OrderedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package delivered to post office, not received yet.");
    }
}