                                                //REM THIS ALL CALCULATIONS
public class Main {

    public static void main(String[] args) {

        ComplexNumber obj = new ComplexNumber(1.00d, 1.00d);
        ComplexNumber obj1 = new ComplexNumber(2.50d, -1.50d);

        obj.add(1.00d, 1.00d);
        System.out.println(obj.getReal());
        System.out.println(obj.getImaginary());

        obj.subtract(obj1);
        System.out.println(obj.getReal());
        System.out.println(obj.getImaginary());

        obj1.subtract(obj);
        System.out.println(obj1.getReal());
        System.out.println(obj1.getImaginary());


    }
}
