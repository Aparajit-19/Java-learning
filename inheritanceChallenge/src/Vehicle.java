public class Vehicle { //Sab kuch matlab sab kuch class me hee ata hai....

    private String name; //Field (instance var.)
    private String size; //Field (instance var.)
    private int currentVelocity; //Field (instance var.)
    private int currentDirection; //Field (instance var.)

    public Vehicle (String name, String size) { //Constructor
        this.name = name;
        this.size = size;
        this.currentVelocity = 0; //rem.
        this.currentDirection = 0; //rem.
    }
                                                          //FOR UNDERSTANDING PURPOSE
    /*public Vehicle (String name, String size, int a, int b) {
        this.name = name;
        this.size = size;
        this.currentVelocity = a;
        this.currentDirection = b;
    }*/

    //Vehicle object1 = new Vehicle(name, size, 0, 0); //From 15-22 do same thing that 8-13 do.

    public void steer (int direction) { //instance method
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + this.currentDirection + " degrees.");
    }

    public void move(int velocity, int direction) { //instance method
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at  " + this.currentVelocity + " in direction " + this.currentDirection);
    }

    public String getName() { //get method
        return this.name;
    }

   /* public String getName() {
        return name; //get method me bina this ke bhi field name likh sakte hai
    }*/

    public String getSize() { //get method
        return this.size;
    }

    public int getCurrentVelocity() { //get method
        return this.currentVelocity;
    }

    public int getCurrentDirection() { //get method
        return this.currentDirection;
    }

    public void stop() { //instance method
        this.currentVelocity = 0;
    }
}

//-What is the reason of using instance var. and not static var (in these 3 classes i.e. Vehicle, Car and Audi) ??
//-The reason of using instance var. and not static var (in these 3 classes i.e. Vehicle, Car and Audi) is that static fields belongs to the class,
//not instances of the class. Thus, all instances of any class will access the same static field variable. A non-static field value can be
//different for every object (instance) of a class.