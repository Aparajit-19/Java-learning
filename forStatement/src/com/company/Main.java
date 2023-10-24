package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.00d, 2.00d));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.00d, 3.00d));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.00d, 4.00d));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.00d, 5.00d));
        System.out.println("****************************"); //Just used to separete things

        //FOR STATEMENT - AN ALTERNATIVE FOR AVOIDING ABOVE CASE
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }
        System.out.println("****************************");
        // CHALLENGE BASED ON FOR STATEMENT
        // QUESTION-1

        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.

        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.00d, i)); //here i is in int which is convert into double
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.00d, i)));
            //line 17 and 18 are same but use of [String.format("%.2f",] will convert 700.0000000000000000001 to 700.00 that is 2 decimal places.
        }

        System.out.println("****************************");

        // QUESTION - 2
        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%


        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.00d, i));
        }
        System.out.println("**********************");


    }

    public static double calculateInterest (double amount, double interestRate) {
         return  (amount * (interestRate / 100.00d));
    }

}