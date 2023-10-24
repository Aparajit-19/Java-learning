                                                        //VERY VERY IMP.
package com.company;
import java.util.Scanner; //-Later onn understanding part
public class Main{

    public static void main(String[] args){
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }
    public static int[] getIntegers(int array){
        Scanner scanner = new Scanner(System.in);

        int[] enteredArray = new int[array];
        System.out.println("Enter the number's you want to sort: \r");

        for(int i=0; i < enteredArray.length; i++){
            enteredArray[i] = scanner.nextInt(); //-Imp
        }

        return enteredArray;
    }

    public static void printArray(int[] array){
        for( int i=0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];
        for(int i=0; i<array.length; i++){
            sortedArray[i] = array[i];
        }

        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i =0; i<sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1]; //-RHS me hamesha value hoti hai and LHS me hamesha variable name hota hai
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
