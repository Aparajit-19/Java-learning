package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min=0;
        int max=0;
        boolean first = true;//boolean flag with 2 choice T or F

        while (true){ //Loop hai ghumghum ke yahi aayega.....max loop me manle 3 ho gaya toh agle loop me number jo check hoga woh max 3 manke hoga same with min also

        System.out.print("Enter the number:");

        boolean check = scanner.hasNextInt();//scanner.hasNextInt(); ka matlab hai ki scanner naam ka var me jo input dala hai woh int hai ya nahi

            if (check){
                int number = scanner.nextInt();//1st input checked in line 16 and now it stored here ....in var name number

                if (first){
                    first = false;
                    max=number;
                    min=number;
                }

                if (number > max){
                    max = number;
                }
                if (number < min){
                    min = number;
                }
            }
             else {
                 break;
            }
        }
        System.out.println("min= " + min + ", max = " + max);

    scanner.close();
    }
}
//* min iss case me hamesha 0 aayega.....par hume inputs me se min chunna hai isliye 11 and from 22-26 is added to tackle this
