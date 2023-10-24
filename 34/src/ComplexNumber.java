                                                //REVISE IT AGAIN AND AGAIN
public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){//public / private likh bhi sakte hai or nahi bhi...
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return this.real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add (double real, double imaginary){
        double add = (this.real += real) + (this.imaginary += imaginary);  //rem this line
    }

    public void add(ComplexNumber another){
    double sub = (this.real += another.real) + (this.imaginary += another.imaginary);//rem this line
    }

    public void subtract (double real, double imaginary){
        double sub = (this.real -= real) + (this.imaginary -= imaginary);//rem this line
    }

    public void subtract (ComplexNumber another){ //concept used in last method in Point class used here
        double sub = (this.real -= another.real) + (this.imaginary -= another.imaginary);//rem this line
    }

}
