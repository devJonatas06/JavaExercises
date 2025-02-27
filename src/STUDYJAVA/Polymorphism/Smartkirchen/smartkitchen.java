package STUDYJAVA.Polymorphism.Smartkirchen;

public class smartkitchen {
    private CoffeeMaker brewMaster;
    private refrigerator iceBox;
    private DishWasher dishWasher;


    public smartkitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new refrigerator();
        dishWasher = new DishWasher();
    }

    public void setkitchenState(boolean CoffeeFlag, boolean fridgeFlag,
                                boolean dishWasherFlag){
        brewMaster.setHasWorkToDo(CoffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);

    }
    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.dishWasher();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }
}
