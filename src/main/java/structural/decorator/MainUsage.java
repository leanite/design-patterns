package structural.decorator;

public class MainUsage {

    public static void main(String[] args) {
        Notifier stack = new DefaultNotifier();

        stack = new FacebookDecorator(stack);
        stack = new SMSDecorator(stack);
        stack = new SlackDecorator(stack);

        stack.send("Hello!");
    }
}
