package STUDYJAVA.exercises.ControlFLow;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(21,22,23));
    }
    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }
        int num1lastdigit = num1 % 10;
        int num2lastdigit = num2 % 10;
        int num3lastdigit = num3 % 10;

        return (num1lastdigit == num2lastdigit ||
                num1lastdigit == num3lastdigit ||
                num2lastdigit == num3lastdigit);

    }
}

