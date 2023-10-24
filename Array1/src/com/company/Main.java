package com.company;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in); //-On execution, here it not takes any input in console. Here, it only declared. It takes input on line 30.
    //-Object name scanner declared of Scanner class.
    //-System.in: It takes input in the console.
    //-System.out: It gives output in the console.
    //-Line 6 is declared inside the class but outside of method, constructor or block so, it is accessible anywhere in the class(Same concept
    // is used as what used with instance/static var.
    //-It is private so, it is accessible in this class only.
    //-If it is public then it is accessible in other class also.

    public static void main(String[] args){
        int[] myIntegers = getIntegers(5); //-Understandable

        for (int i=0; i<myIntegers.length; i++){
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers (int number){ //-int[]: It means array returns from this method.
            System.out.println("Enter " + number + " integer values.\r"); //-\r: It takes the input from next line.
        int[] values = new int[number]; //-Array declared

        for (int i=0; i<values.length; i++){
            values[i] = scanner.nextInt(); //-nextInt(): It reads the int value from the user. //-Here input is taken. //-scanner.nextInt(): It means here input is taken of type int.
        }

        return values;
    }

    public static double getAverage (int[] array){ //-int[] array: It means par. taken in this method is array of type int.
        int sum = 0;
        for (int i= 0; i<array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double) array.length; //Casting.
    }

}
