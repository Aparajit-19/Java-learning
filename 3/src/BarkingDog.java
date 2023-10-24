public class BarkingDog {

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {

        if (hourOfDay >= 0 && hourOfDay < 8 && barking || hourOfDay == 23 && barking ) {
            return true;
        }
        else {
                return false;
        }
    }
}
