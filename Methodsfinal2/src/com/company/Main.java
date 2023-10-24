                   //ANOTHER WAY OF WRITING OF METHODSFINAL BUT HAVE RETURN AT LAST WITH INT IN 2ND METHOD
                   //CLEAN WAY OF CODE OF METHODS PROJECT - but with minor change as both uses same method

package com.company;

//Rem this line has their own curly braces within all java methods written
public class Main {

    //IST JAVA METHOD (starting from here) - Rem certain method have their own curly braces within all code written.
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


    }

    //2ND JAVA METHOD (starting from here)
    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {

        //Rem code block have their own curly braces
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore; //yeh value return hogi i.e finalScore ki jo value aae hai.......kaha return hogi yeh waha hogi jaha yeh method as assigning value di gayi hai
        }
        return -1; //yeh likhna jaruri hai because error aa jayega iske bina...yeh use isliye hota hai agar error aayega i.e invalid value to -1 return karega
    }
}
//* Here, value return hogi jisse hum new variable declare kar sakte hai by assigning method as value
////return 0,1, yehi return kar dega waha jaha method call kiya hai.
