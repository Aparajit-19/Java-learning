public class Floor {

    private double width;
    private double length;

    public Floor(double width, double length) { //If we have more than 1 par used commas
        if (width < 0) { //these parameters are only accessed in this constructor only
            this.width = 0;
        } else {
            this.width = width;
        }

        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public double getArea() {//double type value return from this method so double used or samajhja dusre type hue toh if nothing return void used
        double area = this.width * this.length;
        return area; //this method gives value of area
    }
}


