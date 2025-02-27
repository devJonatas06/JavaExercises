package STUDYJAVA.exercises.ControlFLow;

public class IsEvenNumber {
    public static void main(String[] args) {
        int number = 5;
        int oddcount = 0;
        int evencount = 0;

        while (number <= 20) {

            if (IsEvenOrnot(number)) {
                System.out.println("Number " + number + " is even.");
                evencount++; // Conta o número par
            } else {
                oddcount++; // Conta o número ímpar
            }

            if (evencount >= 5) {
                break; // Sai do loop quando encontrar 5 números pares
            }

            number++; // Incrementa o número para verificar o próximo
        }

        System.out.println("Total Even numbers found = " + evencount);
        System.out.println("Total Odd numbers found = " + oddcount);
    }


    public static boolean IsEvenOrnot(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}