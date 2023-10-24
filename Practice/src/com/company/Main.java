package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10;
        if (myValue == 10) { //(myValue) sirf likhne ka matlab hai is myValue is equals to true ?par yaha hame puchna hai is myValue equals to 10? hence error
            System.out.println("Hello dear!");
        }

                                      // YEH 3 SAME HAI
        boolean myBoolean = true;
        if (myBoolean) {
            System.out.println(" hii ");
        }

        boolean myBoolean1 = true;
        if (myBoolean1 == true) {
            System.out.println(" hii ");
        }

        boolean myBool = true;
        if (myBool != false) {
            System.out.println("BABY");
        }
                                    //YEH 3 SAME HAI

        boolean myBoo = true;    // same variable name bhale type dusra ho nahi repeat kar sakte ek var name ek project me ek hee hona chahiye
        if (myBoo == false) {
            System.out.println("hey");
        }

        boolean myBoo1 = true;
        if(!myBoo1) {
            System.out.println("hey");
        }

        boolean myBool1 = true;
        if (myBool1 != true) {
            System.out.println("BABY");
        }

                                    //IMP CONCEPT//

        boolean my_Bool1 = true;    //myBool1 , my_Bool1 alag alag var name hai
        if (my_Bool1 = true) {
            System.out.println("HAHAHA");
        }

        boolean my_Bool12 = true;    //myBool1 , my_Bool1 alag alag var name hai
        if (my_Bool12 = false) {
            System.out.println("HAHAHA");
        }









    }
}