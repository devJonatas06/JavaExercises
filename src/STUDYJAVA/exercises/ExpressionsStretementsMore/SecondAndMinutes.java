package STUDYJAVA.exercises.ExpressionsStretementsMore;

public class SecondAndMinutes {
    public static void main(String[] args){
        System.out.println(GetDurationString(-7777));
        System.out.println(GetDurationString(-77,90));
        System.out.println(GetDurationString(68,59));
        System.out.println(GetDurationString(7000));



    }
    public  static String GetDurationString(int second){
        if (second < 0 ) {
            return "Invalid data for second(" + second
                    + "), must be a positive integer volue";
        }
            int minute = second / 60;
            return GetDurationString(second / 60, second % 60);

    }

    public  static String GetDurationString(int minutes, int second){
        if (minutes < 0  ){//minutes > 59 ) {
            return "Invalid data for minute(" + minutes
                    + "), must be a positive integer volue";
        }
        if (second < 0 || second > 59 ) {
            return "Invalid data for second(" + second
                    + "), must be a between 0 and 59";
            
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours + "H " + remainingMinutes + "m " + second +"s" ;
    }
}