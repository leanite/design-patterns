package behavioral.strategy;

public class CreditCardStrategy implements PaymentStrategy {

    private String ownerName;
    private String cardNumber;
    private String cvv;
    private String expirationDate;

    public CreditCardStrategy(String ownerName, String cardNumber, String cvv, String expirationDate) {
        this.ownerName = ownerName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount +"$ paid with credit card");
    }
}