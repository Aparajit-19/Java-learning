package com.company;

//Rem this line has their own curly braces within all java methods written
public class Main {

    //IST JAVA METHOD (starting from here) - Rem certain method have their own curly braces within all code written.
    public static void main (String[] args) {
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

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
// * Here from line 13 to 18(part A) and line 20 to 27(part B), same text, if we want to change in B but my mistake as text is same change in A throughs error
//* To conquer this error, concept of methods use....how it use.....refer Method project
//* Method and Methods2 projects are same but only have difference in way of writing or arranging in better way......i.e.use of methods
