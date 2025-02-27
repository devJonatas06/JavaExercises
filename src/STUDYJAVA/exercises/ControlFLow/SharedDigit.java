package STUDYJAVA.exercises.ControlFLow;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
           return false;
        }
        int num1firstdigit = num1 / 10;
        int num1lastdigit = num1 % 10;

        int num2firstdigit = num2 / 10;
        int num2lastdigit = num2 % 10;

        if (num1firstdigit == num2firstdigit || num1firstdigit == num1lastdigit
        || num1lastdigit == num2firstdigit || num1lastdigit == num2lastdigit) {
            return true;

        }
        return false;
    }
}