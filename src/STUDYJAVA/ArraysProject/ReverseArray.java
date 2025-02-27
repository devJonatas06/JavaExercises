package STUDYJAVA.ArraysProject;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] array = new int[]{1,5,6,7,8,7,5,3,8,89,7,4,3,37,84};
        int [] arrayreverse = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(array));
        for (int i = 0, j  = arrayreverse.length  - 1 ; i < j; i++,j--) {
            int temp = arrayreverse[i];
            arrayreverse[i] = arrayreverse[j];
            arrayreverse[j] = temp;
        }
        System.out.println(Arrays.toString(arrayreverse));


    }


}
