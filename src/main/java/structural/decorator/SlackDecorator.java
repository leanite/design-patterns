package structural.decorator;

public class SlackDecorator extends NotifierDecorator {

    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSlackNotification(message);
    }

    private void sendSlackNotification(String message) {
        System.out.println("Slack notification:");
        System.out.println(message);
        System.out.println();
    }
}
