                //WHENEVER WE DO METHOD OVERLOADING WITH SAME METHODS, DIFFERENTIATE ALL METHODS WITH ARGUMENT
package com.company;

public class Main { //SAB METHODS CLASS KE CURLY BRACES KE ANDAR HOTA HAI

    public static void main(String[] args) { //same method exact to exact declare nahi kar sakte....//this method is imp for running of code

        int newScore = calculateScore("Aparajit", 500); //string value double quotes me aati hai ....//this called 1st method..//iss method se int value return hue hai matlab naya variable int me declare hoga
        System.out.println("New score is " + newScore);
        calculateScore(75); //this called 2nd method
        calculateScore();//this called 3rd method
    }

    public static int calculateScore (String playerName, int score) { //yaha par static ke baad int likha hua hai matlab iss method se int value return hogi method ke bahar, agar void likha hota toh kuch nahi return hota
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000; //agar int likha hai toh kuch na kuch int value return karni hee hogi
    }

    public static int calculateScore (int score) { //hum same method kai baar declare kar sakte hai sirf parameter or argument change karke
        System.out.println("Unnamed player scored " + score + " points ");
        return score * 1000;
    }

    public static int calculateScore () { // iss baar bina kisi parameter ke kiya hai
        System.out.println(" No player name, no playr score. ");
        return 0; //agar int likha hai toh kuch na kuch int value return karni hee hogi

        //whole same method but changing only data type not make method unique
    }
}
