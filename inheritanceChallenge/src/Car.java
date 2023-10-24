//-3rd line ke aage jo sign hai uska matab yeh hai ki iss class ko parent class banaya gaya hai

public class Car extends Vehicle { //inheritance

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

      public Car (String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size); //Parent class ke andar jo constructor hai usne jis fields ko values assign ki hai with help of parameters sirf unhe
          // fields ko wapas values assign kar sakte hai child class me. Jo fields ko constant value de hai construcor me unn fields ki value child
          // class me bhi wo hee rahegi..............Iss line ka matab yeh hai
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
        move(speed, direction); //rem.
    }
}





