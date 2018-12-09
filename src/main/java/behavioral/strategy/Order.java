package behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class Order {

    List<Item> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public Order(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateTotalCost() {
        int total = 0;

        for(Item item : items) {
            total += item.getPrice();
        }

        return total;
    }

    public void pay(PaymentStrategy paymentMethod) {
        paymentMethod.pay(calculateTotalCost());
    }
}
