package STUDYJAVA.exercises.OopIntherence.objects;

public class Car {
    private String make = "Fusca";
    private String model = "turbo";
    private String color = "black";
    private int doors = 2;
    private boolean corvertible = true;

    public void describleCar(){
        System.out.println(doors + "-Door "+
                color + " "+
                make + " "+
                model + " "+
                (corvertible ? " Convertible ": " "));
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isCorvertible() {
        return corvertible;
    }

    public void setCorvertible(boolean corvertible) {
        this.corvertible = corvertible;
    }
}

