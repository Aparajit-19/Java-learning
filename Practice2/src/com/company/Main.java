package com.company;

public class Main {

    public static void main(String[] args) {
    }



    //METHOD OVERLOADING-
    public static void method () {
        int c = method(1,2);
        System.out.println(c);
    }
    public static int method (int a) {
        return 0;
    }
    public static void method (String a) {
    }
    public static int method (int a, int b) {
        int c = a + b;
        return c;
    }
    public static int method (int a, String b) {//static method
        return 0;
    }
    public static int method (String b, int a) {
        return 0;//rem
    }



    public void method1 () {//yeh static method nahi hai
    }
}
//-Here method return type is void(nothing return from method), int and soon....
//-Return type change karke bhi method overloading kar sakte hai...(see above)
