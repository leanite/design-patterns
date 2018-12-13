package behavioral.state;

public class Package {

    private PackageState state = new OrderedState();

    public void setState(PackageState state) {
        this.state = state;
    }

    public void previousState() {
        state.previousState(this);
    }

    public void nextState() {
        state.nextState(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}