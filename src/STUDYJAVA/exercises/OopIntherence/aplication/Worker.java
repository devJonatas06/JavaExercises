package STUDYJAVA.exercises.OopIntherence.aplication;

import STUDYJAVA.exercises.OopIntherence.objects.Employee;
import STUDYJAVA.exercises.OopIntherence.objects.HourlyEmployee;
import STUDYJAVA.exercises.OopIntherence.objects.SalariedEmployee;

public class Worker {
    public static void main(String[] args) {
        SalariedEmployee Jonatas = new SalariedEmployee("Jonatas", "27/07/2006", "01/01/2020",40000);
        System.out.println(Jonatas);
        System.out.println("Age = "+ Jonatas.getAge());
        System.out.println("Pay =" + Jonatas.collectPay());
        Jonatas.retire();
        System.out.println("OMYYYY you are retired and now recei ving = $" + Jonatas.collectPay());
        HourlyEmployee Jonattas = new HourlyEmployee("Jonaatass","27/07/2006","01/02/2015", 100 );
        System.out.println(Jonattas);
        System.out.println("Jonatas Paycheck = $" + Jonattas.collectPay());
        System.out.println("Overtime pay + $" + Jonattas.getDoublePay());



    }
}
