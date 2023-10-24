                 //SAME AS READING USER INPUT CHALLENGE PROJECT(WHERE WE DO WITH FOR LOOP) BUT HERE WE DO WITH WHILE LOOP
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //IN WHILE LOOP, WE HAVE TO DO THIS 11-12 IF WE WANT TO USE IT INSIDE LOOP
        int counter = 0;//we want increment inside loop so we declare outside
        int sum = 0;//if we want to use var inside while loop for addn or any other things then we have to declare outside the loop

        //while (true) { //IF WE USE 14 INSTEAD OF 15, WE HAVE TO USE BREAK STATEMENT 25-27
        while (counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                //if(counter == 10) {    ////IF WE USE 14 INSTEAD OF 15, WE HAVE TO USE 25-27
                //break;
                //}
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); // handle end of line (enter key)
        }

        System.out.println("sum = " + sum);
        scanner.close();

    }
}
//* while (true){   //it means we create a while loop which is endless......
//  }

