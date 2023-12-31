                              //ANOTHER WAY OF WRITING CODE OF METHODSPRACTICE
package com.company;

public class Main {

    public static void main(String[] args) {

            int highScorePosition = calculateHighScorePosition(1500);
            displayHighScorePosition("Tim", highScorePosition);

            highScorePosition = calculateHighScorePosition(900);
            displayHighScorePosition("Bob", highScorePosition);

            highScorePosition = calculateHighScorePosition(400);
            displayHighScorePosition("Percy", highScorePosition);

            highScorePosition = calculateHighScorePosition(50);
            displayHighScorePosition("Gilbert", highScorePosition);

            highScorePosition = calculateHighScorePosition(1000);
            displayHighScorePosition("Louise", highScorePosition);

            highScorePosition = calculateHighScorePosition(500);
            displayHighScorePosition("Carol", highScorePosition);

            highScorePosition = calculateHighScorePosition(100);
            displayHighScorePosition("Frank", highScorePosition);
        }

        public static void displayHighScorePosition(String playerName, int highScorePosition) {
            System.out.println(playerName + " managed to get into position "
                    + highScorePosition + " on the high score table");
        }

        public static int calculateHighScorePosition(int playerScore) {
            if(playerScore >= 1000) {
                return 1;
            } else if(playerScore >= 500 && playerScore < 1000 ) {
                return 2;
            } else if(playerScore >= 100 && playerScore < 500) {
                return 3;
            } else {
                return 4;
            }
        }
    }


    }
}
