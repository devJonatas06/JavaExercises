package STUDYJAVA.Polymorphism.Cars;

public class hybridCar extends Car {
    private double avgKmPerCharge;
    private int cylinders;
    private int batterySize;

    public hybridCar(String description) {
        super(description);
    }

    public hybridCar(String description, double avgKmPerCharge,int cylinders, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void starEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up. %n", cylinders);
        System.out.printf("Hybrid -> switch %d kWh battery on , Ready!! %n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid-> usage under the average: %.2f %n", avgKmPerCharge);
    }
}


