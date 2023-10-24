import java.util.Scanner;

public class Main1 {

    static Scanner scanner  = new Scanner(System.in); //-Static var.(rem. the way of declaration of static reading user input)

        public static void main(String[] args) {
        //-Static method access only static var. directly with no problem, so it easily accesses scanner var., so execution is done and result is same.

            System.out.print("Enter your year of birth:" );
            int yearOfBirth = scanner.nextInt();
            int age = 2022 - yearOfBirth;
            System.out.println("Your age is " + age);


            System.out.print("Enter your name: " );
            scanner.nextLine();
            String name  = scanner.nextLine();


            System.out.println("Your name is " + name);

            System.out.println("So you are " + name + " and you are " + age + "years old");

            scanner.close();

        }
}
