package STUDYJAVA.exercises.ControlFLow;

public class digitSumChallenger {

    public static int sumDigits(int number){
        if (number < 0) {
            return -1;
        }
        if (number < 10){
            return number;
        }
        int sum = 0;
        while (number > 0 ){
           sum += number % 10;
           number /= 10;

    }
        return sum;
}

    public static void main(String[] args) {
        System.out.println(sumDigits(9));
        System.out.println(sumDigits(113));
    }
}
