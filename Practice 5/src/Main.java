                                                //CODE IS SAME IN ALL 3 PARTS
                                //Par local, static and instance var. lekar samajh raha hu
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner scanner  = new Scanner(System.in);
            //-'Scanner' is itself a class with name Scanner in java.
            //-This (Scanner scanner  = new Scanner(System.in);) is like a local variable. So there was no problem in execution,

            System.out.print("Enter your year of birth:" );
            int yearOfBirth = scanner.nextInt();
            int age = 2022 - yearOfBirth;
            System.out.println("Your age is " + age);


            System.out.print("Enter your name: " );
            scanner.nextLine();
            String name  = scanner.nextLine();


            System.out.println("Your name is " + name);

            System.out.println("So you are " + name + " and you are " + age + " years old");

            scanner.close();

    }
}


