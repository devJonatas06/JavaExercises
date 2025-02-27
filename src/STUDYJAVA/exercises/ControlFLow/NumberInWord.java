package STUDYJAVA.exercises.ControlFLow;

public class NumberInWord {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            printNumberinWord(i);

        }
    }
    public static void printNumberinWord(int number) {
        switch (number) {
            case 0:
                System.out.println(number+ " ZER0");
                break;
            case 1:
                System.out.println(number+" ONE");
                break;
            case 2:
                System.out.println(number+" TWO");
                break;
            case 3:
                System.out.println(number+" THREE");
                break;

            case 4:
                System.out.println(number+" FOUR");
                break;
            case 5:
                System.out.println(number+" FIVE");
                break;
            case 6:
                System.out.println(number+" SIX");
                break;
            case 7:
                System.out.println(number+" SEVEN");
                break;
            case 8:
                System.out.println(number+" EIGHT");
                break;
            case 9:
                System.out.println(number+" NINE");
                break;
            default:
                System.out.println(number+" OTher");
                break;

        }
    }
}