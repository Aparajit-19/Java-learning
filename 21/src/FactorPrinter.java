public class FactorPrinter {

    public static void printFactors (int number) {

        if ( number < 1) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= number; i++){ //yaha par i declare hua hai cond me code block ke liye toh yeh sirf code block me access hoga uske bahar i naam ka kuch exist hee nahi karega
            if ( number % i == 0){
                System.out.println(i);
            }
            if ( number % i != 0){
                continue;
            }
        }
    }
}
