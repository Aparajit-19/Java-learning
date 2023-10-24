package com.company;

public class Main {

    public static void main(String[] args) {

                    //IMPORTANT FIRST 2 EXAMPLES//

                    byte F1 = 127;
                    short F2 = 3454;
                    int F3 = 2147483647;
                    long F4 = (F1 +F2 + F3);     //ERROR IN RESULT - // here addition is done with taking int basics and here what happened overflow occur
        //as 1 is add on max value of int range which then convert into min value of int range and then maths occur
                    //*no problem with variable as it consider as int inspite of fact that it crosses int range and we have to add L
                    //*instead of L we use long
                    System.out.println("F4=" + F4);


                      byte L1 = 127;
                      short L2 = 3454;
                      long L3 = 2147483647;
                      long L4 = (L1 +L2 + L3);// no error
                      System.out.println("L4=" + L4); //here addition is done with taking long basics


                            byte FB1 = 127;//ek varaible name jo hum kisi bhi primitive data type ke liye dete hai repeat nahi ar sakte kisi or primitive data type ko leke
                            short FB2 = 3454;
                            int FB3 = 2147483647;
                            long FB4 = (FB1 + FB2 + 10L * FB3);//* with 10,error //* concept is same as used in above 1st examples
                             // with 10L here addition and multiplication is done with taking long basics
                            System.out.println("FB4=" + FB4);


                            float V1 = 564687478;//float even store integer but upto its range and therefore not give error and calculate upto 6-7
        // digits after decimal
        System.out.println(V1);
        float V2 = 2.54f; //on removing f it shows error as 2.54 is consider double and double range not fits in float hence error
        double V3 = 4444.4444444;// put d or not put d no matter intellij consider all decimal no. double /////////16-17 decimal

        //IMP

        int I1 = 120;
        System.out.println("I1 =" + I1 );
        I1 = I1 + 133;
        System.out.println(I1);


    }
    }
