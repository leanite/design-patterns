package structural.decorator;

public class FacebookDecorator extends NotifierDecorator {

    public FacebookDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendFacebookNotification(message);
    }

    private void sendFacebookNotification(String message) {
        System.out.println("Facebook notification:");
        System.out.println(message);
        System.out.println();
    }
}
