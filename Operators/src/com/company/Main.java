package com.company;

public class Main {

    public static void main(String[] args) {

        //IMPORTANT CONCEPT - computer work step by step

        int result = 1 + 2; //1 + 2 = 3 , =(equal sign) is assignment operator used to assign the variable name a value not value a variable name
        // * matlab iss variable name ko yeh value di gayi hai jo memory me save hogi na ki iss value ko woh variabe name diya gaya hai
        System.out.println(" 1 + 2 = " + result);

        System.out.println(" 3 - 1 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result = result - 1;
        System.out.println(" 3 - 1 = " + result);


        System.out.println("previousResult = " + previousResult);

        previousResult = result;
        System.out.println(previousResult);

        System.out.println(" 3 - 1 = " + result);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println(" 20 / 5 = " + result) ;

        //remainder or modulus or modulo operator, sign is %
        result = result % 3; // the remainder of 4 divided 3 is 1 is output
        System.out.println( " 4 % 3 = " + result);

        //result = result +1; can also be written as result++,  ;
        result++;
        System.out.println(result);//2 output

        result--;
        System.out.println(result);//1 is output

        //result = result +2; is also written as
        result += 2;
        System.out.println(result);// 3 is output

        //result = result * 10 can also be written as
        result *= 10;
        System.out.println(result);//30 output

        //result = result / 3 is also written as
        result /=3;
        System.out.println(result);//// 10 output

        //result = result  - 2 is also written as
        result -=2;System.out.println(result);



    }
}
