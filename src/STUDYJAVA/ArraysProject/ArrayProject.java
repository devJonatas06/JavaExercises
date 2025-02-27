package STUDYJAVA.ArraysProject;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayProject {
    public static void main(String[] args) {
        Integer[] numeros = getRandomArray(10);
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println(Arrays.toString(numeros));

    }

    private static Integer[] getRandomArray(int len) {
        Random random = new Random();
        Integer[] newint = new Integer[len];
        for (int i = 0; i < len; i++) {
            newint[i] = random.nextInt(101);
        }
        return newint;
    }
}