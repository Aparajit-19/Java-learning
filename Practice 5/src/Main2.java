import java.util.Scanner;

public class Main2 {

    Scanner scanner  = new Scanner(System.in); //-Instance var.

        public void main(String[] args) {
            //-Not a static method, so code runs and throws error.

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
