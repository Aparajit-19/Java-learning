package com.company;

public class Main {

    public static void main(String[] args) {

             int topScore = 100;
             if (topScore == 100) {
                 System.out.println("You got the high score!"); ///rem particular case ka particular code block particular case me hee rahna chahiye
             }

                 int topScore1 = 100;
                 if (topScore1 != 100) {//! means not equal yeh variable name 100 ke equal nahi hai?
                     System.out.println("You got the high score!");
                 }

                     int topScore12 = 100;
                     if (topScore12 > 100) {// >(greater than) means yeh variable name is  greater than 100?
                         System.out.println("You got the high score!");
                     }

                     int topScore123 = 100;
                     if (topScore123 >= 100) {// >=(greater than or equal to) means yeh variable name is  greater than or equal to 100?
                         System.out.println("You got the high score!");
                     }

                        int topScore1234 = 100;
                        if (topScore1234 < 100) {// >=(less than) means yeh variable name is  less than 100?
                            System.out.println("You got the high score!");
                        }

                        int topScore12345 = 100;
                        if (topScore12345 <= 100) {// >=(less than or equal to) means yeh variable name is  less than or equal to 100?
                            System.out.println("You got the high score!");
                        }

                        int topScore123456 = 80;
                        if (topScore123456 < 100) {
                            System.out.println("You got the high score!");
                        }

                        int secondTopScore = 60;
                        if (topScore > secondTopScore && topScore < 100){//&& is two ampersand known as logical and operator
                            System.out.println("Greater than second top score and less than 100"); //neeche wala print hoga ya nahi depend karta hai condition i.e in this case (topScore > secondTopScore && topScore < 100) ke T or F par agar T hoga toh print hoga agar F hua toh nahi hoga
                        }

                        int secondTopScore11111 = 60;
                        if ((topScore > secondTopScore11111) && (topScore < 100)){//we also add () as see in this line
                            System.out.println("Greater than second top score and less than 100");
                        }

                        //logical OR operator
                        if ((topScore > 90) || (secondTopScore <= 90)){
                            System.out.println("Either or both of the conditions are true");
                        }



    }
}
