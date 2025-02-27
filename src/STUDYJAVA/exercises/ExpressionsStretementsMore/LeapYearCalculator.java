package STUDYJAVA.exercises.ExpressionsStretementsMore;

public class LeapYearCalculator {
    public static boolean isLeapYear(int year) {
        // Verifica se o ano está no intervalo válido (1 a 9999)
        if (year < 1 || year > 9999) {
            return false;  // Retorna falso se o ano não estiver no intervalo válido
        }

        // Verifica se o ano é divisível por 4, mas não por 100, ou se é divisível por 400
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // Se o ano é divisível por 100, verifica se é divisível por 400
                if (year % 400 == 0) {
                    return true;  // O ano é divisível por 400, então é um ano bissexto
                } else {
                    return false;  // O ano não é divisível por 400, então não é bissexto
                }
            } else {
                return true;  // O ano é divisível por 4, mas não por 100, então é um ano bissexto
            }
        } else {
            return false;  // O ano não é divisível por 4, então não é bissexto
        }
    }

    public static void main(String[] args) {
        // Testes
        System.out.println(isLeapYear(-1600));  // Esperado: false, fora do intervalo
        System.out.println(isLeapYear(1600));   // Esperado: true, ano bissexto
        System.out.println(isLeapYear(2017));   // Esperado: false, ano não bissexto
        System.out.println(isLeapYear(2000));   // Esperado: true, ano bissexto
        System.out.println(isLeapYear(1700));   // Esperado: false, ano não bissexto
        System.out.println(isLeapYear(2400));   // Esperado: true, ano bissexto
    }
}


