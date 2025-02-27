package STUDYJAVA.exercises.ControlFLow;

public class sum3and5challenge {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0 ;
        System.out.println(" Numbers Divisible by 3 and 5: ");

        for (int i = 1; i < 1000; i++) {
             if (i % 3 == 0 && i % 5 == 0 ) {
                System.out.println(i);
                sum += i;
                count ++;
                if(count ==5){
                    break;
                }
            }
        }
        System.out.println("Sum of the First  5 numbers Divisible by 3 and 5 is: "+ sum);
    }
}
