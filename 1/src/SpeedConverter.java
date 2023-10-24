public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {  //value jo return hogi method se vo jis data type ki hogi vo data type hume static ke baad likhna hota hai, agar kuch bhi return nahi karna toh hum void use karte hai

        if (kilometersPerHour < 0) {
            return -1;
        } else {
            long milesPerHour = Math.round(kilometersPerHour / 1.609d);  //12, 13 also be written like [ return Math.round(kilometersPerHour * 1.609d);]
            return milesPerHour; // concept of (Math.round(kilometersPerHour * 1.609d) is that it converts the value in double i.e kilometersPerHour * 1.609d to nearest value in long
        }
    }

    public static void printConversion (double kilometersPerHour) {
         if (kilometersPerHour >= 0) {
             long milesPerHour = toMilesPerHour(kilometersPerHour);//Math.round(kilometersPerHour / 1.609d) yeh bhi likh sakte hai
             System.out.println(kilometersPerHour + "km/h = " + milesPerHour + "mi/h");
         }
         else {
             System.out.println("Invalid value");
         }

    }
}
