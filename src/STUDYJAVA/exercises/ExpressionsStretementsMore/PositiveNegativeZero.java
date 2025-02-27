package STUDYJAVA.exercises.ExpressionsStretementsMore;
public class PositiveNegativeZero {
    public static void main(String[] args) {
        PositiveNegativeZero.checkNumber(5);   // Output: positive
        PositiveNegativeZero.checkNumber(-3);  // Output: negative
        PositiveNegativeZero.checkNumber(0);   // Output: zero

    }

    public static void checkNumber(int number) {
            if (number > 0) {
                System.out.println("positive");
            } else if (number < 0) {
                System.out.println("negative");
            } else {
                System.out.println("zero");
            }
        }
    }