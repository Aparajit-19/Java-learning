package com.company;

public class Main {

    public static void main(String[] args) {

        int myVariable = 50;// int myVariable = 50; is caomplete a statement also called assigning statement
        myVariable++; //  myVariable++; is statement
        myVariable--;
        System.out.println("This is a test"); //  System.out.println("This is a test"); is a statement

          //SAME THING IN DIFFERENT WAY

        System.out.println("This is another still more.");
        System.out.println("This is" +
                        "another"  +
                            "still more.");
        System.out.println("This is" + "another"  + "still more.");

        //SAME THING IN DIFFERENT WAY

        int myVariable1 = 50;myVariable1++; System.out.println("This is another one");    //not recommended

        int myVariable12 = 50;
        myVariable12++;
        System.out.println("This is another one");

                                //IMP - WHITESPACE is space between variables name and type and assigning value and semicolon and so on.......space ke concept pata hai to make a code more readable and understandable
        int                                 myVariable123 =       //see this hahaha
                50
                 ;

        //IMP - IDENTING (IDENTATION) is to arrange all lines of code like that so it be more readable and understandable and also to understand the logical flow

            int myFirst = 5;
            if ( myFirst == 5) {                        //see line 36 and 37, how it wriiten, here we clearly understand how logic flow
                System.out.println("hurrah!");
            }
    }
}
 //IMP - if by chance whole code not arrange properly like poor whitespace and poor identing, follow these steps..................[ code(sabse upar file,edit wali line ) > reformat code]