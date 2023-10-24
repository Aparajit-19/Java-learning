//ALWAYS WRITE CODE LINE BY LINE. I.E WHAT IT PRINTS AT WHAT LINE . REFER THIS CODE.
//Refer WhileAnddoWhileChallenge3, as both projects are same but one print 14 and other not which is happen due to the order of puting some cond before other.

                                                                //PART B - IMP, REVISE IT

package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        int startNumber = 5;
        int finishNumber = 20;
        while (startNumber <= finishNumber) {
            startNumber++;
            if (!isEvenNumber(startNumber)) {
                continue;
            }
            count++;
            System.out.println("Even number " + startNumber);
            if (count == 5) {
                System.out.println("Total no. of even no. is " + count);
                break;
            }

        }
    }

    public static boolean isEvenNumber (int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

