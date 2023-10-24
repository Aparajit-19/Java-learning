public class Main {

    public static void main(String[] args) {
        Calculator.printSum(5, 10);//If we want to call static method of diff. class in diff. class then this way is used.
        printHello();//If we want to call static method in class and this class(in which we want to call) is same as class in which static method
        // is present, then this way is used.
        Main.printHello();//If we want to call static method in class and this class(in which we want to call) is same as class in which static method
        // is present, then this way is also used.

        //6-7 & 8-9......Both way is correct
        //-Agar mera method baad me defined hua hai tab bhi hum usse pahle call kar sakte hai (defined karne ke baad)....saath hee kahi bhi kar sakte hai
        // (defined karne ke baad).....ex- line 6 and 17.
        //Static methods access other static methods and static variables directly.

  }

    public static void printHello() {
        System.out.println("Hello"); //rem
   }
}
