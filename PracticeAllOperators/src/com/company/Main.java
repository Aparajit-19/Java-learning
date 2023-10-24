package com.company;

public class Main {

    public static void main(String[] args) {

                                                    //BEST WAY, REMEMBER IT//

        double myFirstDoubleValue = 20.00d;  //if you use 20, double save it as int and perform operations like int so use 20.00 and with this you not necessary used d or use d no problem in that
        double mySecondDoubleValue = 80.00d;
        double myFinalDoubleValue = (myFirstDoubleValue + mySecondDoubleValue) * 100.00d;
        System.out.println(myFinalDoubleValue);

        double remainder = myFinalDoubleValue % 40.00d;
        System.out.println(remainder);

        boolean myFirstBoolean = remainder == 0.00d ? true : false;
        System.out.println(myFirstBoolean);

        if (!myFirstBoolean) {
            System.out.println("Got some remainder");
        }






    }
}
