package com.company;
import java.util.Scanner; //-Cover in later part.

public class Main{

    private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[10]; //-Concept of line 6 is also applicable here.

    public static void main(String[] args){
        System.out.println("Enter 10 integers:");
        getInput(); //-Calling getInput() method.
        printArray(baseData);
        resizeArray();
        System.out.println("Enter 12 integers:");
        getInput();
        printArray(baseData);
    }

    private static void getInput(){
        for(int i = 0; i < baseData.length; i++){
        baseData[i] = s.nextInt();
        }
    }

    private static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " "); //-It is used to display the results on the monitor. It displays the result on the console and retains the
                                        // cursor in the same line.
        }
        System.out.println(); //-It also displays the result on the console but moves the cursor to the next line.
    }

    private static void resizeArray(){
        int[] original = baseData; //-Refer L-102 for more.
        baseData = new int[12];
        for (int i = 0; i < original.length; i++) {
        baseData[i] = original[i];
        }
    }

}
