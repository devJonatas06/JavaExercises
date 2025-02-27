package STUDYJAVA.exercises.ControlFLow;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221)); // true
        System.out.println(isPalindrome(707));   // true
        System.out.println(isPalindrome(11212)); // false
    }

    public static boolean isPalindrome(int number){
        int originalNumber = number;
        number = Math.abs(number);
        int reverse = 0;

        while (number > 0 ){
            int lastdigit = number % 10;
            reverse = reverse * 10 + lastdigit;
            number = number  / 10;
        }
        return originalNumber == reverse || originalNumber == -reverse;
    }
}
