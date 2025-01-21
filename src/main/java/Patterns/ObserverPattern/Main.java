package Patterns.ObserverPattern;

public class Main {
    public static void main(String[] args) {
        WatchStation watchStation = new WatchStation();
        Display display = new Display(watchStation);

        watchStation.updateFunc();
    }
}
