package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WatchStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
    void updateFunc() {
        System.out.println("This class changed");
        notifyObservers();
    }
}
