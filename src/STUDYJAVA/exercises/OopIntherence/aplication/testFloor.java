package STUDYJAVA.exercises.OopIntherence.aplication;
import STUDYJAVA.exercises.OopIntherence.objects.Floor;
import STUDYJAVA.exercises.OopIntherence.objects.Carpet;
import STUDYJAVA.exercises.OopIntherence.objects.Calculator;


public class testFloor {
    public static void main(String[] args) {
        // Testando os valores
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

        // Outro teste com valores diferentes
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }
}
