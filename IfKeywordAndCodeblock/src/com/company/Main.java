package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;


        //REMEMBER {}.CURLY BRACES OF IF, ELSE , AND ELSE IF

                                                // if

                            if (score == 4000) //HERE IF COND (score == 4000) IS T OR F THEN ONLY 1 STATEMENT PRINT OR NOT PRINT . IT IS DUE TO ABSENCE OF CODEBLOCK
                                     System.out.println("Your score was 5000");
                                     System.out.println("This was executed"); //koi farak nahi par raha line 17 ke T or F hone se yeh print hoga koi code block nahi hai
//WITHOUT CODE BLOCK I.E. {},IMPACT OF LINE 17 IS ONLY ON LINE 18 I.E ONLY SINGLE STATEMENT IS EXECUTED WHICH IS LINE 18 IN THIS CASE

                            if ( gameOver == true){
                                System.out.println("Your score was 5000");
                                System.out.println("This was executed");
                            }

                                               // if....else

                            if (score > 6000) { //(score > 6000) is cond.......- learn the way i.e use of code block
                                        System.out.println("hey"); //if cond is true then print this
                                    }
                                    else {
                                        System.out.println("hello");}// if false..... print this


                                                // if....else if........else

                                    if (score > 5000 && score > 1000) {
                                        System.out.println("appu");
                                    } else if ( score == 5000) {
                                        System.out.println("sonu");
                                    } else {
                                        System.out.println("aparajit");}

              //concept used in if....else if...else    //code> comment with line comment
//        if (condition1) {
//            // block of code to be executed if condition1 is true
//        } else if (condition2) {
//            // block of code to be executed if the condition1 is false and condition2 is true
//        } else {
//            // block of code to be executed if the condition1 is false and condition2 is false
//        }

                               //code> comment with block comment
                                   /* int time = 22;
                                    if (time < 10) {
                                        System.out.println("Good morning.");
                                    } else if (time < 20) {
                                        System.out.println("Good day.");
                                    } else {
                                        System.out.println("Good evening.");  // Outputs "Good evening."
                                    }*/

        // IMP CONCEPT OF DECLARING VARIABLE INSIDE CODE BLOCK
        if (gameOver == true){
            int finalScore = score + (levelCompleted * bonus); //we access variable declared outside of code block but cant access new variable declared inside code block to outside the code block. the reason is new variable declared inside code block is within the scope of if statement only.
            System.out.println("Your final score was = " + finalScore);
        }

        /*int savedFinalScore = finalScore;*/          //here finalScore is in red as it throws errror

        /*concept used - line which is under codeblock where new variable declared of name finalScore vanishes or deleted once line 67 executed hence
                declaring something connecting this variable throws error*/
        if (gameOver == true) {
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            int finalScore = score +(levelCompleted * bonus);   //yaha humne same variable name diya hai fir bhi error nahi aarraha, reason hai woh line delete ho gayi execution ke baad
            System.out.println("Your final score was = " + finalScore);
        }

        //imp - agar variable data type ke saath ek baar declare ho gaya hai......to fir uski new assigning value jo under if statement ke scope me hue hai usko hum bahar if statement ke scope ke baahar access kar sakte hai par jo fresh new variable data type ke saath if statement ke scope ke andar matlab code block ke andar declare hua hai usko bahar access nahi kar sakte

        if (score == 10000)
            System.out.println("dude");

      /*  if (secondScore == 11600)             //error
            System.out.println("dud");*/





    }
}
