public class Rectangle {

    private double width; //instance var. (it can be call/access anywhere in class)
    private double length;

    public Rectangle (double width, double length) {
        if (width < 0) {
            this.width =0;
        }
        else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        }
        else {
            this.length = length;
        }
    }

        //IMP:
        //-In constr. Rectangle, the parameter's width and length are local var.
        //-In constr. and set method, field and parameter have same name then to call with name who be access in constr. and set method ? field
        // or parameter ? so to differentiate field with parameter, we use this keyword to call field and name to call parameter in constr. and
        // set method.
        //-In constr. and set method, parameter not necessarily to have same name as of field but to assign field a value of parameter, using
        // same name of par. as field make things simple and clear.


    public double getWidth() {
        return this.width;
   }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        double area = this.width * this.length;
        return area;
    }

        //IMP:
        //-Unlike constructor and set method, in get method we not have any parameter with same name as of field so there is no problem of
        // distinguishing between field and parameter, and thats why using this.(name) or (name) in get method give same result as both calls
        // field .
}