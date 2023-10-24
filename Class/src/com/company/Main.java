package com.company;

public class Main {

    public static void main(String[] args) {//main method is imp for code to run


        Car bmw = new Car();//NEW OBJECT DECLARED - 1ST OBJECT........rem the way that you have to use class and then initialize using new like this this otherwise it shows error
        Car audi = new Car();//NEW OBJECT DECLARED - 2ND OBJECT


//        /*bmw.model = "Carrera"; //bmw.model = "Carrera"; tab hoga jab model field car class ka public hoga

        //WRITING bmw. [Itna likhne ke baad intellij apne public class me se options dega kuch add karne ke liye agar tune apne CAR class ke sabhi fields private rakhe toh.

        //bmw.model = "Carrera"; This is one way but this is wrong as it voilate the rule of encapsulation. The solution is to declare a method in CAR class jo uss private field ko yaha par access karva dega.

        //bmw.model = "Carrera"; means object bmw banaya ja raha hai jisme model field(public hona chahiye) use kiya hai Carrera naam ka


        bmw.setModel("Carrera");//as carrera is string so double quotes....rem
        // LINE 11 AND 20 HAS SAME MEANS

        System.out.println("Model is " + bmw.getModel());//rem

        bmw.setModel("911");
        System.out.println("Model is " + bmw.getModel());


    }
}
//Process finished with exit code 0.....MEANS CODE EXECUTES WITH NO ERROR
// Process finished with exit code (something other than 0) ....means have some error or something is wrong