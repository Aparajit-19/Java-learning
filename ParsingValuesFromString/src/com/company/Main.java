package com.company;

public class Main {

    public static void main(String[] args) {

        String numberAsString = "2018"; //String assigning value is written in double quotes and ......is all text whether it is no.(i.e. 2018 is text not number)
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println( "number = " + number); //print 2018 as string value 2018 is able to convert into int value 2018.

        numberAsString += 1;
        number += 1;
        System.out.println(numberAsString);//20181
        System.out.println(number );//2019

        //REM IT- UNDERSTAND BY PUTTING 2018 AS 2018a

        numberAsString = "2018"; //"2018a" acceptable in string
        number = Integer.parseInt(numberAsString);
        System.out.println(number);//error as 2018a cannot convert into int or same in all other cases like cannot convert into double also.......

        //OTHER EXAPLES-
        numberAsString = "2018.125";
        double name = Double.parseDouble(numberAsString);
        System.out.println(name);








    }
}
