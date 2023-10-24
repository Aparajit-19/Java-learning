package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 0; //Variable declared outside of code block can be access inside a code block but variable declared inside of code block cannot be access outside of code block as it vanishes after that particular code block. The same is true with conditions.
        for (int i = 2; i < 10; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Prime no. = " + i );
                if (count == 3) {
                    System.out.println("exiting for loop");
                    break; //It used to exit particular loop in between if this con (count == 3) is reached.
                }
            }
        }
    }
    public static boolean isPrime (int n) {//method to check prime no.
        if(n == 1) {
            return false;
        }
        for(int i=2; i <= n/2; i++) { //n/2 ki jagah (long) Math.sqrt(n)
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

//QUESTION - 3

// Create a for statement using any range of numbers
// Determine if the number is a prime number using the isPrime method
// if it is a prime number, print it out AND increment a count of the
// number of prime numbers found
// if that count is 3 exit the for loop
// hint:  Use the break; statement to exit


