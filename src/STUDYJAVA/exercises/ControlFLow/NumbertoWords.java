package STUDYJAVA.exercises.ControlFLow;

public class NumbertoWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int reversedNumber = reverse(number);
            int numDigitCount = getDigitCount(number);
            int revNumDigitCount = getDigitCount(reversedNumber);
            int diffCount = numDigitCount - revNumDigitCount;

            while (reversedNumber > 0){
                switch (reversedNumber%10) {
                    case 0 -> System.out.println("Zero");
                    case 1 -> System.out.println("One");
                    case 2 -> System.out.println("Two");
                    case 3 -> System.out.println("Three");
                    case 4 -> System.out.println("Four");
                    case 5 -> System.out.println("Five");
                    case 6 -> System.out.println("Six");
                    case 7 -> System.out.println("Seven");
                    case 8 -> System.out.println("Eight");
                    case 9 -> System.out.println("Nine");
                }
                reversedNumber /= 10;
            }

            while (diffCount > 0) {
                System.out.println("Zero");
                diffCount--;
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse*10 + number%10;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        } else {
            int count = 0;
            while (number > 0) {
                count++;
                number /= 10;
            }
            return count;
        }
    }
}


