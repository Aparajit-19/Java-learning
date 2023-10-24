package com.company;

public class Main {
    public static void main(String[] args) {

       checkNumber(5); //rem yeh bhi under method hee hoga
        checkNumber(-1);
        checkNumber(0);
        checkNumber(1678);
    }

    public static void checkNumber (int number){ //checkNumber is method name, int number is method parameter or argument with data type int and number as variable name

        if (number > 0) {
            System.out.println("positive");
        }
            else if (number < 0) {
            System.out.println("negative");
        }
              else {
            System.out.println("zero");
        }
    }
}
