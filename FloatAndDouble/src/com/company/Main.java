package com.company;

public class Main {

    public static void main(String[] args) {

            float myMinFloatValue = Float.MIN_VALUE;
            float myMaxFloatValue = Float.MAX_VALUE;
            System.out.println("Float minimum value = " + myMinFloatValue);
            System.out.println("Float maximum value = " + myMaxFloatValue);

           double myMinDoubleValue = Double.MIN_VALUE;
           double myMaxDoubleValue = Double.MAX_VALUE;
           System.out.println("Double minimum value = " + myMinDoubleValue);
           System.out.println("Double maximum value = " + myMaxDoubleValue);

           int myIntValue = 5;
           float myFloatValue = 5;//default is double by intellij same concept of that previous 4 primitive data types, *refer word document for the basics of these 2.
           System.out.println(myFloatValue);
           double myDoubleValue = 5;// both float and double store integer as decimal see in output
           System.out.println(myDoubleValue);


        int myIntValue1 = 5;
        float myFloatValue1 = 5f;
        System.out.println(myFloatValue1);
        double myDoubleValue1 = 5d;
        System.out.println(myDoubleValue1);

        int myIntValue11 = 5;
        float myFloatValue11 = 5.25f;//we also use (float) instead of f
        System.out.println(myFloatValue11);
        double myDoubleValue11 = 5.25d;
        System.out.println(myDoubleValue11);

        int myIntValue12 = 5 / 2;// here output will be no. before decimal as int not handle decimal
        System.out.println(myIntValue12);
        float myFloatValue12 = 5f/ 2;// here we also add f with 2
        //if we remove f and then proceed then maths occur like int. and .0 add in context of float
        System.out.println(myFloatValue12);
        double myDoubleValue12 = 5 / 2;// here we also add d with 2, //if we remove d and then proceed then maths occur like int. and .0 add in context of double
        System.out.println("1=" + myDoubleValue12);

        int myIntValue111 = 5 / 3;
        System.out.println(myIntValue111);
        float myFloatValue111 = 5f / 3;
        System.out.println(myFloatValue111);
        double myDoubleValue111 = 5d / 3;// more precise then float
        System.out.println(myDoubleValue111);

        int myIntValue123 = 5;
        float myFloatValue123 = 5f;
        System.out.println(myFloatValue123);
        double myDoubleValue123 = 5.00 / 3.00;//best to use decimals
        System.out.println("2=" + myDoubleValue123);
        //rem line 54 and 41

        //challenge//

        double P1 = 200.00d;
        double P2 = P1 * 0.45359237d;
        System.out.println("P2=" + P2);

        double IMP = 3_000_000.4_567_890d;// rem
        System.out.println(IMP);








     


           







    }
}
