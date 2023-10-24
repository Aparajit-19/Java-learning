public class AreaCalculator {

        public static double area (double radius) { //double likha hai static ke baad means method double data type me value return karega and likha hai means karwana hee padega.........void me koi value return nahi hoti toh sirf return ya kuch likh bhi matt, sab chalta hai
                if (radius >= 0) {
                        double area_of_circle = (radius * radius * Math.PI);  //Math.PI is use for pi....the way of writing pi
                        return area_of_circle ;
                }
                else {
                        return -1.0d;
                }
        }

        public static double area (double x, double y) {
                if (x>=0 && y>=0){
                        double area_of_rectangle = (x * y);
                        return area_of_rectangle;
                }
                else {
                        return -1.0d;
                }
        }
}
