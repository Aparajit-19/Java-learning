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
                                                        //ISKI BAAT KAR RAHA HU 17-20 & 21
                    if (count == 5) {
                        System.out.println("Total no. of even no. is " + count);
                        break;
                    }
                    System.out.println("Even number " + startNumber);

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

