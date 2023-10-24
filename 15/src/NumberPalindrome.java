public class NumberPalindrome {

    public static boolean isPalindrome(int number) {//method ke andar declared sabhi variables sirf ussi method ke andar hee hote hai usee dusre method se access nahi kar sakte

        if (number < 0) {
            number *= -1; //rem this way as this converts -ve no. to +ve no.
        }
        int stored = number;
        int reverse = 0;

//*declared outside of code block so it able to processed inside of code block i.e. adding,subtracting or other arithmetic operations  etc and be accessable outside of code block.
//*Jo var code block ke bahar declare hue hai, woh chahe code block ya cond me use ho, woh jaise code block ke bahar kam karte hai waise hee andar
//kaam karte hai......


        while (stored > 0) { //while means jab or jab tak and while is loop.
            int digit = stored % 10;
            reverse = reverse * 10 + digit;
            stored /= 10;
        }
        if (reverse == number) {
            return true;
        } else {
            return false;
        }

    }
}

//Jis point pe variable declare hua hai kisi method me uss point se pahle usse access nahi kar sakte...
//*Hum variable ko ek baar declare karke and uski value assign karke wapas bina declare kare sirf name se usse new value assign kar sakte hai kisi point par
//or uss point se and uss point ke neeche se us var ki value wohi hee rahegi....par uss point ke upar uski purani value rahegi uski value..



