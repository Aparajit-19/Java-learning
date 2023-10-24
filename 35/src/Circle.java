public class Circle {

    private double radius;

    public Circle(double radius) { //Constructor : it is used to initialize field like set method.
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return this.radius; //For get method only, this.radius is same as radius.
    }

    public double getArea() {
        double area = this.radius * this.radius * Math.PI; //Var. area is local var. so it can't be access or called outside this code block
                                                           //but its value can be return through this method when we call this method .
        return area ;//We return local var. "area" value.
    }
}

//IMP:
//-For using pi(i.e 22/7) use Math.PI
//-The keyword 'this' is used only with instance variables and instance methods not with local variables and parameters.
