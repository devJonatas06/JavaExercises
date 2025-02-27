package STUDYJAVA.ArraysProject;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayProjectWithScanner {
    public static void main(String[] args) {
        int number[] = getIntegers(3);
        int sortedNumbers[] = sortIntegers(number);
        printArray(sortedNumbers);

    }

    public static int[] getIntegers(int len) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Ellement " + i + ": ");
            number[i] = scanner.nextInt();
        }
        scanner.close();
        return number;
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        for (int i = 0; i < sortedArray.length / 2; i++) {
            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[sortedArray.length - 1 - i];
            sortedArray[sortedArray.length - 1 - i] = temp;
        }
        return sortedArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}
