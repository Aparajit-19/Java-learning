public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String fur;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String fur) {
        super(name, 22, 22, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.fur = fur;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override//THIS IS HOW I OVERRIDE METHOD(23-27) OF METHOD OF PARENT CLASS IN CHILD CLASS.........AND THIS OVERRIDE METHOD IS APP. ONLY ON CHILD CLASS
    public void eat() {
        System.out.println("dog.eat() called");
        chew();
        super.eat();//CALLING SUPERCLASS EAT METHOD HERE
    }

    public void walk(){//METHOD WITHOUT STATIC KEYWORD
        System.out.println("Dog.walk() called");
        super.move(5);//1 ........////CALLING SUPERCLASS MOVE METHOD HERE
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);//2.......//CALLING THIS CLASS MOVE METHOD HERE
    }

    private void moveLegs (int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);//CALLING SUPERCLASS MOVE METHOD HERE
    }
}
//REM. THE DIFF. BETWEEN 1 AND 2
            //super.move(5); : It call or use the method(i.e. of this name) of superclass.
            //move(10); : It call or use the method(i.e. of this name) of superclass when there is no override of this method in child class. But
                          //it call or use the method(i.e. of this name) of child class when there is override of this method present in child class.
            //RUN THE PROJECT AND SEE THE DIFF.
