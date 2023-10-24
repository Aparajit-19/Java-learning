public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius); //rem
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        double volume = super.getArea() * this.height;
        return volume;
    }
}

//IMP:
//-The keyword "extends" means inherit from's.
