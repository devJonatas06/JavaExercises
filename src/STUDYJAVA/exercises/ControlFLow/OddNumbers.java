package STUDYJAVA.exercises.ControlFLow;

public class OddNumbers {
    public static boolean isOdd(int Number) {
        if (Number <= 0) {
            return false;
        }
        return Number % 2 != 0;
    }

    public static int SumOdd(int Start, int End) {
        if (Start <= 0 || End <= 0 || End < Start) {
            return -1;
        }

        int sum = 0;
        for (int i = Start; i <= End; i++) {
            if (isOdd(i)) {

            }

        }
        return sum;
    }
}
