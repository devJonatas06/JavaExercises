package STUDYJAVA.exercises.ControlFLow;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(8));
        System.out.println(isPerfectNumber(10));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        int i = 1;
        while (i <= number / 2) {
            if (number % i == 0) {
                sum += i;
            }
            i++;
        }
        return sum == number;
    }
}

