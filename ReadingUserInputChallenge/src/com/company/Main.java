package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number #" + i + ":");
            boolean checkInputs = scanner.hasNextInt();

            if (checkInputs) {
                int numbers = scanner.nextInt();
                sum += numbers;
                //continue;//if checkInputs is true 17-18 executes and loop continues(i.e from this line, move to the 12 line without going down and again starts)

            } else {
                System.out.println("Invalid number");
                i--;
                //break; //if checkInputs is false, else taken into consideration and print Invalid no. and also break the loop at this point(i.e. the use of break keyword)

            }

            scanner.nextLine();
//Another use of nextLine() method in place of taking string input in console is used to returns the lines that was skipped.

        }
        System.out.println("Sum of all the inputs is " + sum);
        scanner.close();
    }
}
