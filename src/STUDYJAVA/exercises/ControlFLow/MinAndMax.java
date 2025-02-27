package STUDYJAVA.exercises.ControlFLow;
import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double max = 0;
        double min = 0;
        int loopcount = 0;
        while(true){
            System.out.println("Please enter number or caracter, or type 'exit' to exit ");
            String nextEntry = scanner.nextLine();
            if (nextEntry.equalsIgnoreCase("Exit")) {
                break;

            }
            try {
                double validNumber = Double.parseDouble(nextEntry);
                if (loopcount == 0 || validNumber < min) {
                    min = validNumber;

                } else {
                    max = validNumber;
                }
                loopcount++;
            }catch (NumberFormatException nfe){
                System.out.println("Invalid Input, please enter a valid number or input 'exit' for exit");

            }
        }
        if (loopcount > 0 ) {
            System.out.println("Min: " + min + " MAx: " + max);
        }else{
            System.out.println("Valid data Entered");
        }

    }
}
