//Working of if's and switch statements is same.
//Switch statement works in same way as that of if's.
//You easily rem switch with help of if's statements.
//break statement is used to close a particular case.
//Without break it print all the things without seeing the cases as it sees all cases as one case.
//There is no need of break statement in default and curly braces in else but for concise, we do....reason-as code finishes on that statement and computer goes on next line of code hence no problem
//Switch statement is used with only 4 primitive data types name as- byte, char, int and short and also string which is supported after JDK version 7.
package com.company;

public class Main {

    public static void main(String[] args) {

                                                // IF....ELSE IF....ELSE STATEMENTS
        int value = 4;
        if ( value == 1 ) {
            System.out.println("Value was 1");
        }
        else if ( value ==2 ) {
            System.out.println("Value was 2");
        }
        else {
            System.out.println("Was not 1 or 2");
        }
                                                          //SWITCH STATEMENTS
        int switchValue = 5;
        switch (switchValue) { //rem this
            case 1: //same as that of .....if ( value == 1 ) {.......and rem semicolon
                System.out.println("Value was 1");
                break; //it is used to complete a particular case or mean to say that move to second case, same as that of.........}

            case 2: //same as that of.....else if ( value ==2 ) {
                System.out.println("Value was 2");
                break; //same as that of.......}

            case 3: case 4: case 5: //Shortcut , it means if switchValue == 3 or 4 or 5 print this...and this
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break; //Very imp

            default: // same as that of.............else {......means if all above cases are false then it valid ....working is same as that of else.
                System.out.println("Was not 1 or 2");
                break; //same as that of...... }

        }
    }
}
