package STUDYJAVA.exercises.ControlFLow;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(54782));
        System.out.println(getEvenDigitSum(54562));
        System.out.println(getEvenDigitSum(78569));
    }

    public static int getEvenDigitSum(int number){
        if (number < 0) {
            return -1;

        }
        int sum = 0;
        while (number > 0 ){
            int getlastdigit = number % 10;
            if (getlastdigit % 2 == 0) {
                sum += getlastdigit;
            }
            number = number  / 10;
        }
        return sum;
    }
}
