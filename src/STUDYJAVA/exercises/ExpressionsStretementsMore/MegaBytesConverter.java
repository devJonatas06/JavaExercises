package STUDYJAVA.exercises.ExpressionsStretementsMore;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024; // Calculate full megabytes
            int remainingKiloBytes = kiloBytes % 1024; // Calculate remaining kilobytes
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}

