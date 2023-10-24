public class Car{

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true; //This line means iss Car class se jitne bhi object create honge unn sabke pass engine hai.
        this.wheels = 4; //This line means iss Car class se jitne bhi object create honge unn sabke pass 4 wheels hai.
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
