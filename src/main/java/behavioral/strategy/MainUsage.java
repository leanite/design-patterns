package behavioral.strategy;

import java.util.Arrays;
import java.util.List;

public class MainUsage {
    public static void main(String[] args) {
        PaymentStrategy.Type paymentType = PaymentStrategy.Type.PAYPAL;
        PayPalStrategy payPalPayment = new PayPalStrategy("leanite", "123456");
        CreditCardStrategy creditCardPayment =
                new CreditCardStrategy("Leandro", "5555666677778888", "123", "12/2055");

        List<Item> items = Arrays.asList(
                new Item("iPhone", 400),
                new Item("iPad", 500),
                new Item("iAmExpensive", 800));
        Order order = new Order(items);

        switch (paymentType) {
            case PAYPAL:
                order.pay(payPalPayment);
                break;
            case CREDIT_CARD:
                order.pay(creditCardPayment);
                break;
        }
    }
}
