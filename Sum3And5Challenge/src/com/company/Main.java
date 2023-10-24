//Here we defined sum outside of code block so we access its changes outside of code block and if it defined inside, we cant access.

package com.company;

public class Main {

    public static void main(String[] args) {
        int i;
        int count = 0;
        int sum = 0;
        for ( i=1; i<=1000; i++ ) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Number divisible by 3 and 5 = " + i);
                if ( count == 5) {
                    System.out.println("Sum = " + sum);
                    break;
                }
            }
        }/* System.out.println("Sum = " + sum);*///..........Yaha bhi likh sakte hai

    }
}

//QUESTION -
/*

    Create a for statement using a range of numbers from 1 to 1000 inclusive.

        Sum all the numbers that can be divided with both 3 and also with 5.

        For those numbers that met the above conditions, print out the number.

        break out of the loop once you find 5 numbers that met the above conditions.

        After breaking out of the loop print the sum of the numbers that met the above conditions.

        Note: Type all code in main method
*/

