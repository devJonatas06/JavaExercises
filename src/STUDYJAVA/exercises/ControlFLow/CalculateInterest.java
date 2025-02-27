package STUDYJAVA.exercises.ControlFLow;

public class CalculateInterest {
    public static void main(String[] args) {
        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            double interestAmount = calculateinterestt(10000.0, rate);
            if(rate > 9.0){
                break;
            }
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }
    }
    public static double calculateinterestt(double amount, double interestRate){
        return (amount *(interestRate / 100));
    }
}
