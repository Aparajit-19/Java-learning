public class LargestPrime {

public static int getLargestPrime(int number) {//2 is first prime number...from all numbers
         if (number < 2) {
            return -1;
        }
        for (int i = 2; i < number; i++) {//i++ means when first loop ends or first iteration ends, then i current value is increment with +1.
            if ((number % i) == 0) {
                number /= i;
                i--;
            }
        }
        return number;
    }
}
//From defination of prime-----Any whole number greater than 1 that is divisible only by 1 and itself, is defined as a prime number.
