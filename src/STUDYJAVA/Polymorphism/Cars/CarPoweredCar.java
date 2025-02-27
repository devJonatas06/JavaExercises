package STUDYJAVA.Polymorphism.Cars;

public class CarPoweredCar extends Car{
    private double avgKmPerLiter;
    private int cylinders;

    public CarPoweredCar(String description) {
        super(description);
    }

    public CarPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void starEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up , Ready!! %n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
    }
}
