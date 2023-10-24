package com.company;

public class Main {

    public static void main(String[] args) {

        double kilometers = (100.00d * 1.609344);  // 1 mile = 1.609344 km, [kilometers = (100.00d * 1.609344)] this part is actual expression

        int highScore = 50; //highScore = 50 is exp
        if (highScore == 50) { //highScore == 50 is exp
            System.out.println("This is an expression"); //"This is an expression" is exp



            // In the following code that I will type below, write down what parts of the code
             // are expressions.
            int score = 100; // score = 100  is exp
            if (score > 99) { //score > 99 is exp
                System.out.println("You got the high score"); //"You got the high score" is exp
                score = 0; // score = 0 is exp
            }

        }
    }
}
//Keywords are reserved words
//keywords are highlighted in blue by intellij
//false, true and null are also keywords
//keywords cannot use as variables, methods, class names and so on
//without data type everything in statement is expression i.e kilometers = (100.00d * 1.609344) (not semicolon)
//with data type and semicolon it's called statement i.e. double kilometers = (100.00d * 1.609344);

