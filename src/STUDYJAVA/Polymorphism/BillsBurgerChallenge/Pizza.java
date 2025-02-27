package STUDYJAVA.Polymorphism.BillsBurgerChallenge;

public class Pizza extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Pizza(String name, double price) {
        super("PIZZA", name, price);
    }

    @Override
    public double getAdjustedPrice() {
        double adjustedPrice = getBasePrice();
        switch (getSize().toUpperCase()) {
            case "SMALL" -> adjustedPrice -= 3.0;
            case "LARGE" -> adjustedPrice += 8.0;
        }
        adjustedPrice += (extra1 == null ? 0 : extra1.getAdjustedPrice());
        adjustedPrice += (extra2 == null ? 0 : extra2.getAdjustedPrice());
        adjustedPrice += (extra3 == null ? 0 : extra3.getAdjustedPrice());
        return adjustedPrice;
    }

    public double getExtraPrice(String toppingName) {
        return switch (toppingName.toUpperCase()) {
            case "PEPPERONI", "CHEESE" -> 1.5;
            case "BACON", "HAM", "SALAMI", "CHOCOLATE CRUST" -> 2.0;
            case "CHICKEN CATUPIRY", "SUN-DRIED MEAT CRUST",
                 "PORTUGUESE", "FOUR CHEESE", "MOZZARELLA" -> 5.0;
            default -> 0.0;
        };
    }

    public void addToppingPizza(String extra1, String extra2, String extra3) {
        if (extra1 != null) {
            this.extra1 = new Item("TOPPING", extra1, getExtraPrice(extra1));
        }
        if (extra2 != null) {
            this.extra2 = new Item("TOPPING", extra2, getExtraPrice(extra2));
        }
        if (extra3 != null) {
            this.extra3 = new Item("TOPPING", extra3, getExtraPrice(extra3));
        }
    }
}
