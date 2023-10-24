

public class LastDigitChecker {

    public static boolean hasSameLastDigit (int x, int y, int z) {

        if (x >= 10 && x <= 1000 && y >= 10 && y <= 1000 && z >= 10 && z <= 1000) {// doing this to keep x, y and z in range at the same time
            int a = x % 10;
            int b = y % 10;
            int c = z % 10;

            if (a == b || a == c) {
                return true;
            }
            if (b == a || b == c) {
                return true;
            }
            if (c == a || c == b) {
                return true;
            }
        }
        return false;

        }



    public static boolean isValid (int a) {//'a' variable is already defined in above method....par yeh naya method hai toh hum same name ka dubara declare kar sakte hai

        if ( a >= 10 && a <= 1000) {//defined to put 'a' in range
            return true;
        }
        else
            return false;

    }
}

