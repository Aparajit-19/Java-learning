public class Main {

    public static void main(String[] args) {//necessary for code to run

        SimpleCalculator check = new SimpleCalculator();//object created which is imp for all calculations which is below

                                            // LEARN THIS WHAT I DO BELOW
        check.setFirstNumber(2.00d);
        check.setSecondNumber(3.00d);


        System.out.println(check.getAdditionResult());
        System.out.println(check.getSubtractionResult());
        System.out.println(check.getDivisionResult());
        System.out.println(check.getMultiplicationResult());
        System.out.println(check.getFirstNumber());
        System.out.println(check.getSecondNumber());




    }
}
