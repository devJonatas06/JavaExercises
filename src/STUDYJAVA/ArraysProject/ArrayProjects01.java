package STUDYJAVA.ArraysProject;
import java.util.Arrays;
import java.util.Random;

public class ArrayProjects01 {
    public static void main(String[] args) {
        int[] number = getRandomNumbers(10);
        System.out.println("Números gerados: " + Arrays.toString(number));
        Arrays.sort(number);
        ReverseNumbers(number);
        System.out.println("Números ordenados de forma decrescente: " + Arrays.toString(number));
    }

    public static int[] getRandomNumbers(int len) {
        Random random = new Random();
        int[] number = new int[len];
        for (int i = 0; i < len; i++) {
            number[i] = random.nextInt(10000);
        }
        return number;
    }

    public static void ReverseNumbers(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}

