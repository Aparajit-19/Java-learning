                    //CLEAN WAY OF CODE OF METHODS PROJECT - but with minor change as both uses same method

package com.company;

//Rem this line has their own curly braces within all java methods written
public class Main {

    //IST JAVA METHOD (starting from here) - Rem certain method have their own curly braces within all code written.
    public static void main (String[] args) {

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

        }

    //2ND JAVA METHOD (starting from here)
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        //Rem code block have their own curly braces
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}