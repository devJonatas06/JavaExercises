package STUDYJAVA.exercises.ExpressionsStretementsMore;

public class Jogador {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(2000);
        displayhighscoreposition("Jonata", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayhighscoreposition("Jenha", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayhighscoreposition("Lunna", highScorePosition);

        highScorePosition = calculateHighScorePosition(20);
        displayhighscoreposition("Marina", highScorePosition);

    }

    public static void displayhighscoreposition(String playerName, int HighScorePosition) {
        System.out.println(playerName + " Managed to get Into Position " +
                HighScorePosition + " On The High Score List");
    }

    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if(playerScore >= 1000){
            position =  1;
        } else if (playerScore >= 500 ) {
            position =  2;
        } else if (playerScore >=100){
            position =  3;
        }
        return position;
    }
}