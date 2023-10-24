public class GreatestCommonDivisor {

//(int first, int second) method getGreatestCommonDivisor ke hai........
    public static int getGreatestCommonDivisor (int first, int second) {//Yeh declared var and iss method me declared var sirf issi method me access(in use) honge iske bahar nahi......iske bahar i.e dusre method me same name ka naya var hum use kar sakte hai

        if ( first < 10 || second < 10) {
            return -1;
        }
        int i = 1;
        int gcd = 0;
        while ( i <= first && i <= second) {
            i++;

            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
            if (first % i != 0 && second % i == 0 || (first % i == 0 && second % i != 0)){
                continue;
            }
        }

        return gcd;
    }

}
//
//*Ek particular method me declare hue sabhi var sirf ussi method me access hote hai...


