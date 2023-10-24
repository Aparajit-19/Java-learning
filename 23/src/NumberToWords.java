public class NumberToWords {

    public static void numberToWords (int number) { //iss method me jaha jaha number likha hai bhale hee dusre method ke argument me woh iss
        //method ka number hai......dusre methods ka nahi

        if ( number < 0){//this cond is use if numbers is -ve
            System.out.println("Invalid Value");
        }
        if ( number == 0){
            System.out.println("Zero");
        }
        int lastDigit = 0;

        int leadingZeros = getDigitCount(number) - getDigitCount(reverse(number));

        int stored = reverse(number);
        while ( stored > 0) {
            lastDigit = stored % 10;
            switch (lastDigit) {
                case 0: System.out.println("Zero"); break;
                case 1: System.out.println("One"); break;
                case 2: System.out.println("Two"); break;
                case 3: System.out.println("Three"); break;
                case 4: System.out.println("Four"); break;
                case 5: System.out.println("Five"); break;
                case 6: System.out.println("Six"); break;
                case 7: System.out.println("Seven"); break;
                case 8: System.out.println("Eight"); break;
                case 9: System.out.println("Nine"); break;
                }
                 stored /= 10; //now / 10; esa kuch nahi hota.....2 operators ke beech me space nahi hona mangta
            }
        if ( leadingZeros > 0){
            for (int i = 1; i <= leadingZeros; i++){
                System.out.println("Zero");
            }
        }
    }

    public static int reverse (int number) {

        int lastDigit = 0;
        int reverse = 0;
        while ( number > 0) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        while ( number < 0) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        return reverse ;
    }
    public static int getDigitCount (int number ) {

        if ( number < 0) {
            return -1;
        }
        if ( number==0 ){
            return 1;
        }
        int count = 0;
        while ( number > 0) {
            int lastDigit = number % 10;
            count++;
            number /= 10;
        }
        return count;
    }
}




