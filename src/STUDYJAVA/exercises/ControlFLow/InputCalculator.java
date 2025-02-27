package STUDYJAVA.exercises.ControlFLow;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            sum += number;
            count++;

        }
        long average = (count > 0) ? Math.round((double) sum /count) : 0;
        System.out.println("SUM = "+sum+ " AVG = " + average);
        scanner.close();
    }
}
