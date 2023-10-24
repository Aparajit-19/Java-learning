package com.company;
import java.util.Scanner; // later part

public class Main{

    private static Scanner scanner = new Scanner(System.in);
            //-In line 6, we use static keyword so that main method which is always static and other methods that we are going to create in static
            // can access this scanner var. directly without any prob. {refer for better understanding Java mas. > Java mas. 2 > Con. > Static vs
            // instance methods}.
            //-In line 6, we use private keyword so that other class not access it.

    public static void main(String[] args){
        System.out.println("Enter the count:");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);
    }

    private static int[] readIntegers(int count){
        int[] array = new int[count];
        for(int i=0; i<array.length; i++){
            System.out.println("Enter the number:");
            int number = scanner.nextInt();
            scanner.nextLine(); //-scanner.nextLine();: we're doing this to make sure that the enter key being pressed only once we've entered the
                                // number and they can then continue to enter more numbers {i.e. to overcome the prob. of skipping of enter key}.
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for(int i=1; i<array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

}
//CHALLENGE QUES.-
/*
    -Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
    -The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
    -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
    -In the main() method read the count from the console and call the method readIntegers() with the count parameter.
    -Then call the findMin() method passing the array returned from the call to the readIntegers() method.
    -Finally, print the minimum element in the array.
    Tips:
            -Assume that the user will only enter numbers, never letters
            -For simplicity, create a Scanner as a static field to help with data input
            -Create a new console project with the name 'MinElementChallenge'.
*/

