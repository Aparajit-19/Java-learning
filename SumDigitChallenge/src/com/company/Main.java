                                                         //QUESTION - VERY IMP
/*
Write a method with the name sumDigits that has one int parameter called number.

        If parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.

        The numbers from 0-9 have 1 digit so we dont want to process them, also we dont want to process negative numbers, so also return -1 for negative numbers.

        For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.

        Calling the method sumDigits(1) should return -1 as per requirements described above.

        Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid and invalid values passed as arguments.

        Hint:
        Use n % 10 to extract the least-significant digit.
        Use n = n / 10 to discard the least-significant digit.
        The method needs to be static like other methods so far in the course.

                                                                 Tip:
                                                                 Create a project with the name DigitSumChallenge.

*/


package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 32123 is " + sumDigits(32123));

    }



    public static int sumDigits (int number) {

        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while (number > 0) { //loop starts

            int digit = number % 10; //1 % 10 = 1...refer java masterclass folder
            sum += digit;

            number /= 10;// 1/10 = 0.1 but 0 is taken as it is int so decimal part ignored.
        }//loop ends
        return sum;
    }
}


