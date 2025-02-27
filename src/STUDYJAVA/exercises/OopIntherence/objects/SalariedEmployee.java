package STUDYJAVA.exercises.OopIntherence.objects;

public class SalariedEmployee extends Employee{
    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double payCheck = annualSalary / 12;
        double adjustedPay = (isRetired) ? 0.9 * payCheck : payCheck;
        return (int) adjustedPay;
    }
    public void retire(){
        terminate("01/01/2027");
        isRetired = true;
    }
}
