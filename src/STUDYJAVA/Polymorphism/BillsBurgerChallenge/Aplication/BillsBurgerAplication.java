package STUDYJAVA.Polymorphism.BillsBurgerChallenge.Aplication;
import STUDYJAVA.Polymorphism.BillsBurgerChallenge.MealOrder;
public class BillsBurgerAplication {
    public static void main(String[] args) {
        MealOrder regularMeal1 = new MealOrder();
        regularMeal1.addBurgerToppings("BACON", "CHEESE", "MAYO");
        regularMeal1.setDrinkSize("LARGE");
        regularMeal1.printItemizedList();

        MealOrder secondMeal = new MealOrder("BigBurger", "Pepsi", "Chili", null);
        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();

        MealOrder mealWithPizza = new MealOrder("Regular", "Coke", "Fries", "Margherita");
        mealWithPizza.addBurgerToppings("BACON", "CHEESE", "MAYO");
        mealWithPizza.setDrinkSize("LARGE");
        mealWithPizza.addPizzaToppings("CHOCOLATE CRUST", "PEPPERONI", null);
        mealWithPizza.setPizzaSize("LARGE");
        mealWithPizza.printItemizedList();
    }
}
