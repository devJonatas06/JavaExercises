package STUDYJAVA.exercises.tests;
import STUDYJAVA.exercises.ExpressionsStretementsMore.SpeedConverter;

public class SpeedConverterTestes {
    public static void main(String[] args) {

        SpeedConverter.printConversion(1.5);      // Output: 1.5 km/h = 1 mi/h
        SpeedConverter.printConversion(10.25);   // Output: 10.25 km/h = 6 mi/h
        SpeedConverter.printConversion(-5.6);    // Output: Invalid Value
        SpeedConverter.printConversion(25.42);   // Output: 25.42 km/h = 16 mi/h
        SpeedConverter.printConversion(75.114);  // Output: 75.114 km/h = 47 mi/h
    }
}
