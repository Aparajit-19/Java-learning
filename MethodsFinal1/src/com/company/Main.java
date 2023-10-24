                  //ANOTHER WAY OF WRITING OF METHODSFINAL BUT HAVE RETURN AT LAST WITH VOID IN 2ND METHOD
                  //CLEAN WAY OF CODE OF METHODS PROJECT - but with minor change as both uses same method

package com.company;

//Rem this line has their own curly braces within all java methods written
public class Main {

    //IST JAVA METHOD (starting from here) - Rem certain method have their own curly braces within all code written.
    public static void main (String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);

    }

    //2ND JAVA METHOD (starting from here)
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        //Rem code block have their own curly braces
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return ;
        }
         //return ; idar bhi likh sakte hai//
    }
}
//* Par void use hua hai 2nd method me toh return likh ya matt likh koi farak nahi padta.....read from link given in java masterclass folder
//* return -1; nahi likhna hota hai void ke case me.
//* void value return nahi karta bhale hee return likh le........jaise Methodsfinal 2 me variable declare kiya hai by assigning method waisa void me nahi kar sakte because error throw ka deda void ke case me.

