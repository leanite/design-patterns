package behavioral.strategy;

public class PayPalStrategy implements PaymentStrategy {

    private String username;
    private String password;

    public PayPalStrategy(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + "$ paid using PayPal.");
    }
}