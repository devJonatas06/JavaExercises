package STUDYJAVA.exercises.OopIntherence.objects;

public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return 48 * hourlyPayRate;
    }
    public double getDoublePay(){
        return 2 * collectPay();
    }
}
