package STUDYJAVA.Polymorphism.BillsBurgerChallenge;

public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item side;
    private Pizza pizza;

    public MealOrder() {
        this("regular", "coke", "fries", null);
    }

    public MealOrder(String burgerType, String drinkType, String sideType, String pizzaType) {
        if (burgerType != null) {
            this.burger = new Burger(burgerType, 4.0);
        }
        if (drinkType != null) {
            this.drink = new Item("drink", drinkType, 2.00);
        }
        if (sideType != null) {
            this.side = new Item("side", sideType, 1.50);
        }
        if (pizzaType != null) {
            this.pizza = new Pizza(pizzaType, 15.0);
        }
    }

    public double getTotalPrice() {
        double total = 0.0;
        if (burger != null) {
            total += burger.getAdjustedPrice();
        }
        if (drink != null) {
            total += drink.getAdjustedPrice();
        }
        if (side != null) {
            total += side.getAdjustedPrice();
        }
        if (pizza != null) {
            total += pizza.getAdjustedPrice();
        }
        return total;
    }

    public void printItemizedList() {
        if (burger != null) {
            burger.printItem();
        }
        if (drink != null) {
            drink.printItem();
        }
        if (side != null) {
            side.printItem();
        }
        if (pizza != null) {
            pizza.printItem();
        }

        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        if (burger != null) {
            burger.addToppings(extra1, extra2, extra3);
        }
    }

    public void addPizzaToppings(String extra1, String extra2, String extra3) {
        if (pizza != null) {
            pizza.addToppingPizza(extra1, extra2, extra3);
        }
    }

    public void setPizzaSize(String size) {
        if (pizza != null) {
            pizza.setSize(size);
        }
    }

    public void setDrinkSize(String size) {
        if (drink != null) {
            drink.setSize(size);
        }
    }
}
