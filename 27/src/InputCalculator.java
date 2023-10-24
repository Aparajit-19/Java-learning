import java.util.Scanner;

public class InputCalculator {//InputCalculator is class name

//method not return anything so void is used and if method return something it depends upon the value. Jis data type ka value hoga uss data type ko void ke jagah likhenge.

    public static void inputThenPrintSumAndAverage () { //method

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double counter = 0;


        while (true) {
            boolean hasNextIt = scanner.hasNextInt();
            if (hasNextIt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
                
            } else {
                break;
            }
        }
        double value = sum / counter;
        long average = Math.round(value);
        System.out.println("SUM = " + sum + " AVG = " + average);

        scanner.close();
    }
}

