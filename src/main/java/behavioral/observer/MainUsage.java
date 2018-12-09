package behavioral.observer;

import java.util.Scanner;

public class MainUsage {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        publisher.subscribe(new HexadecimalObserver());
        publisher.subscribe(new OctalObserver());
        publisher.subscribe(new BinaryObserver());

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");

        publisher.notify(scan.nextInt());
    }
}
