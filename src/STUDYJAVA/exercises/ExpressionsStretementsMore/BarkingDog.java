package STUDYJAVA.exercises.ExpressionsStretementsMore;

    public class BarkingDog {

        public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
            if (hourOfDay < 0 || hourOfDay > 23) {
                return false;  // Retorna false se a hora estiver fora do intervalo válido (0-23)
            }

            // Verifica se o cachorro está latindo antes das 8 horas ou depois das 22 horas
            if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
                return true;  // Retorna true se o cachorro estiver latindo e for antes de 8h ou depois de 22h
            }

            return false;  // Caso contrário, retorna false
        }
    }

