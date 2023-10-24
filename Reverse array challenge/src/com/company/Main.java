                                    //VERY IMP(LOT OF THINGS I'M GOING TO LEARN FROM THIS PROJECT).
package com.company;
import java.util.Arrays; //Later part

public class Main{

    public static void main(String[] args){
        int[] array = {1,5,3,7,11,9,15}; //-{1,5,3,7,11,9,15}: Rem. curly brackets me hota hain
        System.out.println("Array = " + Arrays.toString(array)); //-Arrays.toString(array): It returns a string with the contents of the input
                                                                //  array {for more run the project and see}.
        reverse(array); //-Here, note one thing, this method call not returns anything here. This line of code actually reverse the array(as what
                        // this method create for).It means from next step, array var. which is {1,5,3,7,11,9,15} becomes {15, 9, 11, 7, 3, 5, 1}.
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    private static void reverse(int[] array){
        for(int i = 0; i < array.length / 2; i++){
        int temp = array[i];
        array[i] = array[array.length - 1 - i];
        array[array.length - 1 - i] = temp;
        }
    }

}
//Challenge ques.-
/*
    -Write a method called reverse() with an int array as a parameter.
    -The method should not return any value. In other words, the method is allowed to modify the array parameter.
    -In main() test the reverse() method and print the array both reversed and non-reversed.
    -To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
    -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
            Tip:
              -Create a new console project with the name 'ReverseArrayChallenge'.
*/
