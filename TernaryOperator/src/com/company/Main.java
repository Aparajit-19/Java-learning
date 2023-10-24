package com.company;

public class Main {

    public static void main(String[] args) {

        boolean isCar = false;

        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println( "was car is true" );
        }

        boolean wasCar1 = !isCar ? true : false;
        if (wasCar1) {
            System.out.println( "was car is true" );
        }

        isCar = true;
        boolean wasCar11 = isCar ? true : false;
        if (wasCar11) {
            System.out.println( "new" );
        }



    }
}
