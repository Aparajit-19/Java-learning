//System.out.print(); allows what coming next to write , prints in same line (9-17)
//System.out.println();allows what coming next to write , prints in next line
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);//able to use multiple times...

        System.out.print("Enter your year of birth:" );
        int yearOfBirth = scanner.nextInt();//it means var of name scanner will take value of type int (nextInt()).
        int age = 2022 - yearOfBirth;
        System.out.println("Your age is " + age);


        System.out.print("Enter your name: " );
        scanner.nextLine();//necessary to write as it is used to return next line characters
        String name  = scanner.nextLine();
//scanner.nextLine();//it means var of name scanner will take value of type string (nextLine()) in console and then returns here.
//String name  = scanner.nextLine();//it means value returned and save in new var called name of type string as string value returned

        System.out.println("Your name is " + name);

        System.out.println("So you are " + name + " and you are " + age + "years old");

        scanner.close();//closes
//All code in between of  [Scanner scanner = new Scanner(System.in);] &  [scanner.close();]
//It means iske bahar scanner var not accessed.
    }
}

                                                        //2 USE OF scanner.nextLine();
//1.) Ist use is - read line 21-23.
//2.) 2nd use is - read line 20.
       //MORE EXPLANATION OF 2ND USE- nextLine() method is used returns the lines that was skipped.



