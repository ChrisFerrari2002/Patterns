package Patterns.ObserverPattern;

public class Display implements Observer {
    private Subject watchStation;
    public Display(Subject watchStation) {
        this.watchStation = watchStation;
        watchStation.addObserver(this);
    }
    @Override
    public void update() {
        System.out.println("Watch station changed");
    }
}
