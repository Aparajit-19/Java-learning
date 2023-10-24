package com.company;

//Rem this line has their own curly braces within all java methods written
public class Main {

    //IST JAVA METHOD (starting from here) - Rem certain method have their own curly braces within all code written.
    public static void main (String[] args) {
                boolean gameOver = true;
                int score = 800;
                int levelCompleted = 5;
                int bonus = 100;

                calculateScore();

                score = 10000;
                levelCompleted = 8;
                bonus = 200;

                if(gameOver) {
                    int finalScore = score + (levelCompleted * bonus);
                    System.out.println("Your final score was " + finalScore);
                }
    }

    //2ND JAVA METHOD (starting from here)
    public static void calculateScore() {
                boolean gameOver = true;
                int score = 800;
                int levelCompleted = 5;
                int bonus = 100;

                //Rem code block have their own curly braces
                if(gameOver) {
                    int finalScore = score + (levelCompleted * bonus);
                    finalScore += 1000;
                    System.out.println("Your final score was " + finalScore);
                }

    }



}




