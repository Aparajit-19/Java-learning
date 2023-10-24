//computer works line by line......



public class SharedDigit {

    public static boolean hasSharedDigit (int first, int second) {

        if (first < 10 || first > 99) {
            return false;
        }
        if (second < 10 || second > 99) {
            return false;
        }
        int lastDigit = 0;
        int firstDigit = 0;
        int lastDigit1 = 0;
        int firstDigit1 = 0;

        lastDigit = first % 10;
        firstDigit = first / 10;


        lastDigit1 = second % 10;
        firstDigit1 = second / 10;

        if (lastDigit == lastDigit1 || lastDigit == firstDigit1) {
            return true;
        }
        if (firstDigit == firstDigit1 || firstDigit == lastDigit1) {
            return true;
        }
        return false;//Leaving all conditions you defined above under this method, ..........if any conditions left besides these defined conditions, is return with false.
    }//*Baat kar raha hu inn defined conditions ki ...........agar yeh tune true ke liye check kiya hai or agar false hue to return false ....false dega...
    //* Work similarly when int taken
}
