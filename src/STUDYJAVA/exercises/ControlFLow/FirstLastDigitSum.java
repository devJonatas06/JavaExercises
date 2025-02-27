package STUDYJAVA.exercises.ControlFLow;

    public class FirstLastDigitSum {
        public static void main(String[] args) {
            System.out.println(sumFirstAndLastDigit(48489));

        }
        public static  int sumFirstAndLastDigit(int number){
            if (number < 0) {
                return -1;
            }
            int lastdigit = number % 10;
            int firstdigit = number;

            while (firstdigit >= 10){
                firstdigit /= 10;
            }
            return firstdigit+ lastdigit;


        }
    }

