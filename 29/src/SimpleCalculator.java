public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return this.firstNumber;//return firstNumber; return nahi hoga as it is private and it cant access outside this class but this method does and show error if put this statement
    }

    public double getSecondNumber() {
        return this.secondNumber;//this.secondNumber(treat this as variable whose assigned value is second)
    }

    public void setFirstNumber(double first) {
        this.firstNumber = first;//rem (.) after this
    }

    public void setSecondNumber(double second) {
        this.secondNumber = second;//second is assigned value and we cant return assigned values from method because we return variables from method
    }

    public double getAdditionResult() {
        double addition = (this.firstNumber + this.secondNumber);
        return addition;
    }

    public double getSubtractionResult() {
        double subtraction = (this.firstNumber - this.secondNumber);
        return subtraction;
    }

    public double getMultiplicationResult() {
        double mul = (this.firstNumber * this.secondNumber);
        return mul;
    }

    public double getDivisionResult() {
        double div = (this.firstNumber / this.secondNumber);
        if (secondNumber == 0) {
            return 0.0;
        } else {
            return div;
        }
    }
}
