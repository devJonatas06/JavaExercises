package STUDYJAVA.exercises.ControlFLow;

import java.util.Scanner;

public class ScannerClallenger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;

        System.out.println("input five numbers #" + number + ":");
        while (number < 5) {
            try {
                System.out.println("Enter a Numbr: ");
                int nextNumber = scanner.nextInt();

                if (nextNumber < 0) {
                    System.out.println("This Input Invalid");

                } else {
                    sum += nextNumber;
                    number++;
                }
            } catch(Exception e){
                System.out.println("Invalid number");
                scanner.nextLine();
                }
            }
            System.out.println("The total sum of the numbers is: " + sum); // Exibe a soma total
            scanner.close();
        }
    }



