public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {

        first = (int) (first * 1000.00d);
        second = (int) (second * 1000.00d);

        if (first == second) {
            return true;
        }
        else {
            return false;
        }
    }
}
