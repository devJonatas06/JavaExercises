package STUDYJAVA.exercises.ExpressionsStretementsMore;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        // Multiplicar ambos os números por 1000 e convertê-los para inteiros
        int num1Rounded = (int) (num1 * 1000);
        int num2Rounded = (int) (num2 * 1000);

        // Comparar os dois inteiros arredondados
        return num1Rounded == num2Rounded;
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756777, -3.175)); // Esperado: true
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176)); // Esperado: false
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0)); // Esperado: true
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123)); // Esperado: false
    }
}
