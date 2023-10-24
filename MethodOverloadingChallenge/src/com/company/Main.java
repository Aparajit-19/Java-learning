package com.company;

public class Main {

    public static void main(String[] args) {

        double check2 = calcFeetAndInchesToCentimeters(157);
        System.out.println("check2 = " + check2);

        double check3 = calcFeetAndInchesToCentimeters(6,0);
        System.out.println("check3 = " + check3);


    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches){
        if (feet >= 0 && inches >=0 && inches <= 12){
            double centimeters = (30.48d  * feet + 2.54d * inches) ;
            return centimeters;
    }
        else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {  //See concept of same variable name inside of particular method have no issue with same variable name of other method.
        if (inches >= 0) {
            double feet = (int) (inches / 12);
            System.out.println("ft= " + feet);
            inches = (inches % 12);
            System.out.println("in = " + inches);
            double check1 = calcFeetAndInchesToCentimeters(feet, inches);
            System.out.println(feet + " ft " + inches + " in = " + check1 + " cm ");
            return check1;
        }
        else {
            return -1;
        }
    }
}


//QUESTION
// Create a method called calcFeetAndInchesToCentimeters
// It needs to have two parameters.
// feet is the first parameter, inches is the 2nd parameter
//
// You should validate that the first parameter feet is >= 0
// You should validate that the 2nd parameter inches is >=0 and <=12
// return -1 from the method if either of the above is not true
//
// If the parameters are valid, then calculate how many centimetres
// comprise the feet and inches passed to this method and return
// that value.
//
// Create a 2nd method of the same name but with only one parameter
// inches is the parameter
// validate that its >=0
// return -1 if it is not true
// But if its valid, then calculate how many feet are in the inches
// and then here is the tricky part
// call the other overloaded method passing the correct feet and inches
// calculated so that it can calculate correctly.
// hints: Use double for your number datatypes is probably a good idea
// 1 inch = 2.54cm  and one foot = 12 inches
// use the link I give you to confirm your code is calculating correctly.
// Calling another overloaded method just requires you to use the
// right number of parameters.

