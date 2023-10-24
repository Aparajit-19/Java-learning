//WHILE IS SAME AS THAT OF DO WHILE, ONLY DIFFERENCE IS OF WRITING CONDITION IN WHILE WE WRITE IT ON UPPER PART AND IN DO WHILE WE WRITE IT ON BOTTO.

//QUESTION- PART A

// Create a method called isEvenNumber that takes a parameter of type int
// Its purpose is to determine if the argument passed to the method is
// an even number or not.
// return true if an even number, otherwise return false;

//PART B

// Modify the while code above
// Make it also record the total number of even numbers it has found
// and break once 5 are found
// and at the end, display the total number of even numbers found

package com.company;

public class Main {

    public static void main(String[] args) {


        int startNumber = 5;
        int finishNumber = 20;
        while (startNumber <= finishNumber) { //while loop hai, while means jab
            startNumber++;
            if ( !isEvenNumber(startNumber)) {//Not true means false
                continue; //It is used to reverse back from this line to starting if continue is taken into consideration (read below points for understanding) and if continue is not taken into consideration that below print line execute.
            }
//Concept = If 'if cond' is true neeche wala print and 'if cond' is false neeche wala not print.
//[!isEvenNumber(startNumber)] = In easy way, it means number(startNumber) pass through this method(isEvenNumber() is false or not true.
//If [!isEvenNumber(startNumber)] cond is true(matlab passig no. false hai) continue will taken into consideration and if cond is false(passing no. true hai) not taken into consideration.
//[!isEvenNumber(startNumber)] = isEvenNumber(startNumber) == false
//If ( !isEvenNumber(startNumber)) cond is false then continue is not taken into consideration and sout line print.
//It means it print only even no.s as if odd no. is pass ( !isEvenNumber(startNumber)) this cond is true and hence continue is taken into consideration and when this happen continue reverse back the loop to starting, so only even no. prints
//If even no. is pass ( !isEvenNumber(startNumber)), this cond false and thats why continue not taken into consideration and hence sout prints no. which is even

            System.out.println("Even number " + startNumber);

            }
        }


    public static boolean isEvenNumber(int number) {//Yeh variable iss method ke liye declare hua hai hum dusre method me same name declare kar sakte hai

        if (number % 2 == 0) {
            return true;//even no.
        } else {
            return false; //means odd no.
        }
    }
}

