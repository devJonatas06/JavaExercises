package STUDYJAVA.exercises.tests;


public class BarkingDogTest {
    public static void main(String[] args) {
        // Teste 1: Cachorro latindo às 1h (antes das 8h)
        System.out.println(shouldWakeUp(true, 1));  // Esperado: true

        // Teste 2: Cachorro não latindo às 2h
        System.out.println(shouldWakeUp(false, 2)); // Esperado: false

        // Teste 3: Cachorro latindo às 8h (hora limite)
        System.out.println(shouldWakeUp(true, 8));  // Esperado: false

        // Teste 4: Cachorro latindo às 23h (depois das 22h)
        System.out.println(shouldWakeUp(true, 23)); // Esperado: true

        // Teste 5: Hora inválida (-1)
        System.out.println(shouldWakeUp(true, -1)); // Esperado: false
    }

    // Método shouldWakeUp
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;  // Hora inválida
        }
        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;  // Deve acordar se latir fora do intervalo das 8h-22h
        }
        return false;  // Não deve acordar se estiver dentro do intervalo ou não latindo
    }
}