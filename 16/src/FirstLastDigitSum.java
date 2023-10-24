//In while loop, (stored > 0) cond me jab stored 0 hoga kuch loop baad, as it is int toh yeh cond false ho jaegi as 0 is not greater than 0, then loop stops and we get sum in return.
//Agar cond(stored >= 0) hoti,toh iss case me, jab stored 0 hoga kuch loop ke baad, toh uss loop ke baad loop me se stored baar baar 0 ban kar he aayega as 0/10 is 0 toh cond hamesha true hee rahegi, thats why loop chalta rahega or hume kabhi sum ka return nahi milega.
public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }
        int lastDigit = 0;
        int sum = number % 10;
        int stored = number;
        while (stored > 0) { //condition hamesha asking type hoti hai...
            lastDigit = stored % 10;
            stored = stored / 10;
        }
        sum += lastDigit;
        return sum;
    }
}

//*Variable ex- lastDigit, when declared inside of code block then it process inside only(i.e arithmatic operations) but cannot accessed outside of code block and also not print, not able to add to
//other variable outsie of code block ...matlab manle code block ke bahar waisa kuch exist hee nahi karta hai woh variable jo andar declare hua hai code block ke vanish ho jata hai uske bahar aate hee...