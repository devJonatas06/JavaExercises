package STUDYJAVA.exercises.ControlFLow;
import java.util.Scanner;

public class ThePrimeNumClallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of prime numbers");
        int numberofprimes = scanner.nextInt();

        System.out.println(" Enter the Starting range: ");
        int start = scanner.nextInt();

        System.out.println(" Enter the ending range: ");
        int end = scanner.nextInt();

        int count = 0;
        for (int i = start; count < numberofprimes && i <= end; i++) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " Is a prime number");
                count++;
            }
        }
        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number);
        for (int divisor = 2; divisor <= sqrt; divisor += 2) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}




