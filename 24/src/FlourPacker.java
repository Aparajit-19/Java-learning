public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int a = (bigCount * 5);
        int b = (smallCount * 1);
        int c = (bigCount * 5) + (smallCount * 1);

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (smallCount == 0) {
            if (a == goal) {
                return true;
            }
        }
        if (bigCount == 0) {
            if (b >= goal) {
                return true;
            }
        }
        if (a != 0 && b != 0) {
            if (c >= goal) {
                if (a <= goal || (a % goal == 0) )  {
                    return true;
                }
            }
        }
        if (a != 0 && b != 0) {
            if (c >= goal) {
                for (int i = 1; i <= bigCount; i++) {
                    for (int j = 1; j <= smallCount; j++) {//FOR i=1, FIRSTLY 2ND LOOP FULLY COMPLETES THEN FOR i=2 AGAIN 2ND LOOP FULLY COMPLETES AND SO ON....
                        if ((i * 5) + (j * 1) == goal) {
                            return true;
                        }
                    }
                }
            }
        }


        return false;
    }
}
