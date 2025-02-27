package STUDYJAVA.Polymorphism.Cars.Aplication;
import STUDYJAVA.Polymorphism.Cars.Car;
import STUDYJAVA.Polymorphism.Cars.CarPoweredCar;
import STUDYJAVA.Polymorphism.Cars.ElectricCar;
import STUDYJAVA.Polymorphism.Cars.hybridCar;

public class  CarTest {
    public static void main(String[] args) {
        Car car = new Car("1999 Black Corvett");
        runRace(car);
        Car Ferrari = new CarPoweredCar("2022 Blue Ferrari 296 Gts",
                15.9, 6);
        runRace(Ferrari);
        Car Tesla = new ElectricCar("2022 Red Tesla Model 3",
            569,80);
        runRace(Tesla);
        Car ferrarihybrid = new hybridCar("2020 Black Ferrari SF90 Stradale",
                18,8,8);
        runRace(ferrarihybrid);
    }

    public static void runRace(Car car){
        car.starEngine();
        car.drive();
    }
}
