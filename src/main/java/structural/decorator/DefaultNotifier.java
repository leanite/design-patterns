package structural.decorator;

public class DefaultNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("E-mail notification:");
        System.out.println(message);
        System.out.println();
    }
}
