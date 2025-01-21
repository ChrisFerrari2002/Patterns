package Patterns.IteratorPattern;

public class Main {
    public static void main(String[] args) {
        ManagerColletion colletion = new ManagerColletion();
        Iterator it = colletion.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
