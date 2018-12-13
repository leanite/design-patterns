package behavioral.state;

public class MainUsage {
    public static void main(String[] args) {
        Package pkg = new Package();
        pkg.previousState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        System.out.println();
        pkg.nextState();
        pkg.printStatus();
    }
}
