package STUDYJAVA.exercises.ControlFLow;
import java.util.Scanner;

 public class printSquareStar {
    public static void printSquareStar(int number) {

        // Check if the number is less than 5
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        // Outer loop to iterate through each row
        for (int i = 0; i < number; i++) {
            // Inner loop to iterate through each column in the current row
            for (int j = 0; j < number; j++) {
                // Check if the position should have a star
                if (i == 0 || i == number - 1 || j == 0 || j == number - 1 || i == j || j == number - i - 1) {
                    System.out.print("*"); // Print star
                } else {
                    System.out.print(" "); // Print space
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

