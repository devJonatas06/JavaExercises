package STUDYJAVA.ArraysProject;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        int count = readInteger();
        int [] numbers = readElements(count);
        int minValue = findMin(numbers);
        System.out.println("The minimum value is: " + minValue);
    }

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = scanner.nextInt();
        return number;
    }

    public static int [] readElements(int size){
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[size];
        System.out.println("Enter "+ size + " numbers: ");
        for (int i = 0; i <size ; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    private  static int findMin(int [] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array  [i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
