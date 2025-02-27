package STUDYJAVA.exercises.ExpressionsStretementsMore;

public class EqualSumChecker {

    public static boolean hasEqualSum(int num1, int num2, int num3) {
        // Verifica se a soma dos dois primeiros números é igual ao terceiro
        return (num1 + num2) == num3;
    }

    public static void main(String[] args) {
        System.out.println("Test 1: " + hasEqualSum(1, 1, 2));
        System.out.println("Test 1: " + hasEqualSum(1, 3, 2));
        System.out.println("Test 1: " + hasEqualSum(1, 6, 7));
        System.out.println("Test 1: " + hasEqualSum(10,10, 20));
    }
}

