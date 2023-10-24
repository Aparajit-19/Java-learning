                                                    //DIFFERENT APPROACH
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                int min= 2147483647;//we also use Integer.MAX_VALUE instaed of this no.
                int max= -2147483648;//we also use Integer.MIN_VALUE instaed of this no

                while (true){

                    System.out.print("Enter the number:");

                    boolean check = scanner.hasNextInt();

                    if (check){
                        int number = scanner.nextInt();

                        if (number > max){
                            max = number;
                        }
                        if (number < min){
                            min = number;
                        }
                    }
                    else {
                        break;
                    }
                }
                System.out.println("min= " + min + ", max = " + max);

                scanner.close();
            }
        }