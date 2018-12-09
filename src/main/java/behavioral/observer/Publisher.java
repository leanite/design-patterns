package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notify(int value) {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }
}
