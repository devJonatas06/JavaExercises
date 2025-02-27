package STUDYJAVA.exercises.ControlFLow;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        return (year % 4 == 0  && year % 100 != 0) || (year % 400 == 0);

    }public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }
        switch (month){
            case 1: //janeiro
            case 3: //Março
            case 5: // maio
            case 7: // Julho
            case 8:  // agosto
            case 10: // outubro
            case 12: // dezembro
                return 31;
            case 4: // abril
            case 6: //junho
            case 9: // Setembro
            case 11: // novembro
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1;

        }

        }

    public static void main(String[] args) {
        test();

    }

    public static void test() {
        System.out.println("Testando isLeapYear:");
        System.out.println("Ano -1600: " + isLeapYear(-1600)); // false
        System.out.println("Ano 1600: " + isLeapYear(1600));   // true
        System.out.println("Ano 2017: " + isLeapYear(2017));   // false
        System.out.println("Ano 2000: " + isLeapYear(2000));   // true

        System.out.println("\nTestando getDaysInMonth:");
        System.out.println("Janeiro de 2020: " + getDaysInMonth(1, 2020)); // 31
        System.out.println("Fevereiro de 2020: " + getDaysInMonth(2, 2020)); // 29
        System.out.println("Fevereiro de 2018: " + getDaysInMonth(2, 2018)); // 28
        System.out.println("Mês inválido -1 em 2020: " + getDaysInMonth(-1, 2020)); // -1
        System.out.println("Ano inválido -2020 no mês 1: " + getDaysInMonth(1, -2020)); // -1
    }


}
