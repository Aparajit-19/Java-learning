package com.company;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicodeChar = '\u0044';         /////learn to use unicode ie { /u(back slash and u use karne se error aa rha tha) horizontal , vertical i.e horl ke last digit hatake vertl milake likh dena} /////unicode is for all which found in laptop keyboard to which not found
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        //example to use boolean//

        boolean isCustomerOverTwentyOne = true;//this is way in boolean
        // here we put variable name like question and assign true or false on our requirement, and it makes more sense  

    }
}
