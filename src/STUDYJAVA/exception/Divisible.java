package STUDYJAVA.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class IdadeInvalidaException extends Exception{
    public IdadeInvalidaException(String mensagem){
        super(mensagem);
    }

}

public class Divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Digite sua idade");
                int i = scanner.nextInt();
                int validarIdade = ValidarIdade(i);
                System.out.println("Idade valida: " + validarIdade);
                System.out.println("Digite  o primeiro numero");
                double num1 = scanner.nextDouble();
                System.out.println("Digite  o segundo numero");
                double num2 = scanner.nextDouble();

                double resultado = divisao(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            } catch (IdadeInvalidaException e) {
                System.out.println("Erro de idade: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Por favor digite  um numero valido. ");
                scanner.next();
            }
        }
        scanner.close();
    }

    /**
     * @param a
     * @param b divisor deve ser maior que 0
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */

    public static double divisao(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, nao pode ser zero");
        }
        return a / b;
    }

    public static int ValidarIdade(int idade) throws IdadeInvalidaException {
        if (idade <= 0 || idade >= 130) {
            throw new IdadeInvalidaException("Argumento ilegal, nao pode ser zero");
        }
        return idade;
    }
}

