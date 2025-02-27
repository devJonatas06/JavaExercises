package STUDYJAVA.exercises.ControlFLow;



public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }
   public static int getLargestPrime(int number){
       if (number < 2) {
           return -1;

       }
       int largestPrime = -1;

       while( number % 2 == 0 ){
           largestPrime = 2;
           number /= 2;
       }

       for (int i = 3; i  * i <= number;  i+= 2) {
           while (number % i == 0){
               largestPrime = i;
               number /= i;
           }
       }
       if (number > 2){
           largestPrime = number;
       }
       return largestPrime;
   }
}
