package STUDYJAVA.exercises.ExpressionsStretementsMore;

public class TeenNumberChecker {

    // Método para verificar se algum dos 3 números está no intervalo de 13 a 19
    public static boolean hasTeen(int num1, int num2, int num3) {
        return (isTeen(num1) || isTeen(num2) || isTeen(num3));
    }

    // Método para verificar se um número está no intervalo de 13 a 19
    public static boolean isTeen(int num) {
        return num >= 13 && num <= 19;
    }
}
