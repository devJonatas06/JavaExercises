package STUDYJAVA.exercises.tests;

import STUDYJAVA.exercises.ExpressionsStretementsMore.MegaBytesConverter;

public class MegaBytesConverterTEST {

    public static void main(String[] args) {

        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);  // Deve imprimir: 2500 KB = 2 MB and 452 KB
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);  // Deve imprimir: 5000 KB = 4 MB and 904 KB
        MegaBytesConverter.printMegaBytesAndKiloBytes(0);     // Deve imprimir: 0 KB = 0 MB and 0 KB


        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024); // Deve imprimir: Invalid Value
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1);    // Deve imprimir: Invalid Value


        MegaBytesConverter.printMegaBytesAndKiloBytes(1024);  // Deve imprimir: 1024 KB = 1 MB and 0 KB
        MegaBytesConverter.printMegaBytesAndKiloBytes(2048);  // Deve imprimir: 2048 KB = 2 MB and 0 KB
    }
}