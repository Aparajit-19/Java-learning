package com.company;

public class Main {

    public static void main(String[] args) {

            int newValue = 50;
            if (newValue == 50) {
                System.out.println("Ths is true");
            }

                    //REMEMBER IMP CONCEPT
                                             //wrong way
                                        boolean isCar = false;
                                        if (isCar = true) {
                                            System.out.println("This is not supposed to happen");
                                        }

                                             //right way

                                        boolean isCar1 = false;
                                        if (isCar1 == true) {
                                            System.out.println("This is not supposed to happen");
                                        }

                                        boolean isCar12 = false;
                                        if (isCar12) {
                                            System.out.println("This is not supposed to happen");
                                        }

                                        boolean isCar123 = false;
                                        if (isCar1 != true) {
                                            System.out.println("This is not supposed to happen");
                                        }



                                        boolean isCar1234 = false;
                                        if (!isCar1234) {
                                            System.out.println("This is not supposed to happen");
                                        }

    }
}
