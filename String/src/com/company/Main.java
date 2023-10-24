package com.company;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string"; //rem double quotes............//////this variable name is discarded by intellij automatically
        System.out.println(" myString is equal to " + myString);
        myString = myString + ", and this is more. ";//////REMEMMBER,,,,,,,,,//////new statement is declare on this variable name
        System.out.println(" myString is equal to " + myString);

        myString = myString + " \u00A9 2019";// REM UNICODE AISE ADD KARTE HAI
        System.out.println(" myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95"; //rem string treat all things as text and thats why not do any maths dirty works also things are in double quotes, so they treat as string literal
        System.out.println(numberString );

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;//on adding whole no. in string will treat whole no. as text see in output.....//add hota hai par asee nahi.....
        System.out.println("LastString is equal to " + lastString);//output is new string
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;//on adding whole no. in string will treat no. as text see in output
        System.out.println("LastString is equal to " + lastString);



    }
}
