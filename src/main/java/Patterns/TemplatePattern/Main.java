package Patterns.TemplatePattern;

public class Main {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        Beverage coffee = new Coffee();

        System.out.println("Making tea...");
        tea.prepareRecipe();

        System.out.println("Making coffee...");
        coffee.prepareRecipe();
    }
}
