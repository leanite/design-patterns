package behavioral.strategy;

public interface PaymentStrategy {
    void pay(int amount);

    enum Type {
        CREDIT_CARD, PAYPAL
    }
}
