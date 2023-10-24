public class EvenDigitSum {

    public static int getEvenDigitSum (int number) {

        if ( number < 0){
            return -1;//denotes Invalid value
        }
        int sum = 0;
        int stored = number;
        while (stored > 0) {
            int lastDigit = stored % 10;
            if ( lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            stored = stored / 10;
        }
        return sum;//var declared outside of code block is able to process inside of code block(as this defined inside the scope of method not the scope of code block)
        // and accessable outside of code block.
        //var which is declared inside of code block is able to do arithmetic operation with var declared outside of code block.......
        //for ex- here lastDigit which is declared inside of code block is add with sum which declared outside of code block and see here
        //...................we access the full value of sum which we get after adding of lastDigit outside of code block.........rem this
    }
}


