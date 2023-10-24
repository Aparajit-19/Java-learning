package com.company;
public class Main {
    public static void main(String[] args) {

        int[] myIntArray;
        myIntArray = new int[10]; //-Array declared (1)
        myIntArray[0] = 0;
        myIntArray[1] = 1;
        myIntArray[2] = 2;
        myIntArray[3] = 3;
        myIntArray[4] = 4;
        myIntArray[5] = 5;
        myIntArray[6] = 6;
        myIntArray[7] = 7;
        myIntArray[8] = 8;
        myIntArray[9] = 9;
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[1]);
        System.out.println(myIntArray[2]);
        System.out.println(myIntArray[3]);
        System.out.println(myIntArray[4]);
        System.out.println(myIntArray[5]);
        System.out.println(myIntArray[6]);
        System.out.println(myIntArray[7]);
        System.out.println(myIntArray[8]);
        System.out.println(myIntArray[9]);

                                            System.out.println("******************");

        int[] myIntArray1 = new int[10]; //-Array declared (2)
        myIntArray1[0] = 0;
        myIntArray1[1] = 1;
        myIntArray1[2] = 2;
        myIntArray1[3] = 3;
        myIntArray1[4] = 4;
        myIntArray1[5] = 5;
        myIntArray1[6] = 6;
        myIntArray1[7] = 7;
        myIntArray1[8] = 8;
        myIntArray1[9] = 9;
        System.out.println(myIntArray1[0]);// rem
        System.out.println(myIntArray1[1]);
        System.out.println(myIntArray1[2]);
        System.out.println(myIntArray1[3]);
        System.out.println(myIntArray1[4]);
        System.out.println(myIntArray1[5]);
        System.out.println(myIntArray1[6]);
        System.out.println(myIntArray1[7]);
        System.out.println(myIntArray1[8]);
        System.out.println(myIntArray1[9]);

                                            System.out.println("******************");

        int[] myIntArray2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; //-Array declared (3)
        System.out.println(myIntArray2[0]);
        System.out.println(myIntArray2[1]);
        System.out.println(myIntArray2[2]);
        System.out.println(myIntArray2[3]);
        System.out.println(myIntArray2[4]);
        System.out.println(myIntArray2[5]);
        System.out.println(myIntArray2[6]);
        System.out.println(myIntArray2[7]);
        System.out.println(myIntArray2[8]);
        System.out.println(myIntArray2[9]);

                                            System.out.println("******************");

        int[] myIntArray3 = new int[10];
        for (int i = 0; i < 10; i++) { //-Here, at place of i<10 if we write i<myIntArray3.length, we get same result as what we get with i<10. What it means (i<myIntArray3.length) is written in comments below.
            myIntArray3[i] = i * 1; //-Array declared (4)
        }
        System.out.println(myIntArray3[0]);
        System.out.println(myIntArray3[1]);
        System.out.println(myIntArray3[2]);
        System.out.println(myIntArray3[3]);
        System.out.println(myIntArray3[4]);
        System.out.println(myIntArray3[5]);
        System.out.println(myIntArray3[6]);
        System.out.println(myIntArray3[7]);
        System.out.println(myIntArray3[8]);
        System.out.println(myIntArray3[9]);

                                            System.out.println("******************");

        printArray(myIntArray);
    }

        //-(1), (2), (3) & (4) are the same thing but written in different way.
        //-(1), (2), (3) & (4) are the 4 ways to declare an array.
        //- Same way is used to declare array of different data types.
        //- i<myIntArray3.length :  It means i is smaller than this array (myIntArray3) length. Here, this array length is 10 (i.e., of 10 elements or slots)
        //- Same concept (jo hum abhi tak use karte hue aa rahe the) array ke saath bhi use hoga.

        public static void printArray (int[] array){ //-Rem
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }


}












