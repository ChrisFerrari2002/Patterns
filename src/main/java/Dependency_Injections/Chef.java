package Dependency_Injections;

public class Chef {
    private Food food;
    private boolean hasFinished;

    public Chef(Food food) {
        this.food = food;
    }

    public void cook() {
        food.text();
        hasFinished = food.prepareFood();
        getPay(100, "Hai ricevuto");
    }

    public boolean isHasFinished() {
        return hasFinished;
    }

    public void getPay(int pay, String message) {
        System.out.println(message + " " + pay);
    }
}
