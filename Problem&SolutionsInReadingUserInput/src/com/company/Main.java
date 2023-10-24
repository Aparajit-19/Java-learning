//CODE IS SAME AS PREVIOUS ONE BUT WHAT HAPPENED WHEN---WE FACE SUCH PROBLEMS(DOWN)-----THE SOLUTION IS BELOW

//PROBLEMS-
//1.) If we put negative number or letter or word as input(console) in - Enter your year of birth: {it throws an exception or wrong calculation}
//2.) If we put number as input(console) in -  Enter your name: {it accepted but as no. is consider as text but we don't want this}

//SOLUTION-
//Add conditions....
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your year of birth:");

        boolean hasNextInt = scanner.hasNextInt();//IT CHECK VALUE TAKEN BY CONSOLE IS INT OR NOT AND RETURN RESULT IN BOOLEAN
        if (hasNextInt) {//if hasNextInt is true then all things under code block moves` further

            int yearOfBirth = scanner.nextInt();
            int age = 2022 - yearOfBirth;

            System.out.print("Enter your name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            //If user put valid year of birth and has valid age then-

            if (age >= 0 && age <= 100) { //putting age in range.......i.e. when it lie in this range then

                System.out.println("So you are " + name + " and you are " + age + " years old");

            } else {//If age is not valid i.e not valid year of birth then-

                System.out.println("Invalid year of birth");
            }
        } else {//if hasNextInt is false then-
            System.out.println("Unable to parse year of birth");
        }


        scanner.close();
    }
}
