package com.company;

public class Main {

    public static void main(String[] args) {

        char value = 'C';
        switch (value) {
            case 'A': case 'B': case 'C': case 'D': case 'E': //rem single quotes
                System.out.println(value + " was Found");
                break;
            default:
                System.out.println("Not found");
                break;
            }

                                                    //COMPARE BELOW 3 EXAMPLES

        String month = "January"; //see, variable name month, value is capital J(January) and in case it is january(small j), hence show not sure as output
        switch(month) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }

        String month1 = "JanUary";
        switch(month.toLowerCase()) { ////THIS METHOD CONVERT ALL letters of month1 variable to lowercase
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }

        String month12 = "JANUaRY";
        switch(month.toUpperCase()) { //THIS METHOD CONVERT ALL letters of month12 variable to uppercase
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
                                                //QUESTION
// Create a new switch statement using char instead of int
// create a new char variable
// create a switch statement testing for
// A, B, C, D, or E
// display a message if any of these are found and then break
// Add a default which displays a message saying not found