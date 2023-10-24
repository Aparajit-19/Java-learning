package com.company;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
    }

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in); //-Kind of instance var. or object declared {For more refer Java mas. > Java mas. 2 > Con. >
                                                 // Static vs instance methods & Static vs instance methods }.
        System.out.println("Enter the number of elements:");
        int theNumberOfElements = scanner.nextInt();
        scanner.nextLine();
        return theNumberOfElements;
    }

    private static int[] readElements(int theNumberOfElements){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[theNumberOfElements];
        for(int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for(int i=1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

}
