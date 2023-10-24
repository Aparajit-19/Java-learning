            //THIS CLASS IS BASE CLASS / SUPERCLASS /BIG CLASS / PARENT CLASS FOR ALL OTHER CLASSES(WHICH IS SUBCLASS OR CHILD CLASS OF THIS PARENT CLASS)
public class Animal {

                               //ALL FIELDS ARE STATE OF OBJECTS WHICH ARE CREATED FROM THIS CLASS IN MAIN CLASS
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

                                                // CONSTRUCTOR IS USED TO INITIALIZE ALL FIELDS
    public Animal(String name, int brain, int body, int size, int weight) {
    //public ki jagah private bhi likh sakte hai .......depends upon us
    //public ho ya private ho..... agar dono ki jagah, kuch bhi nahi likhenge toh bhi chalega.....this concept applicable in all places
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

                                //ALL METHODS ARE BEHAVIOUR OF OBJECTS WHICH ARE CREATED FROM THIS CLASS IN MAIN CLASS

    public void eat(){//METHOD WITHOUT STATIC KEYWORD
        System.out.println("Animal.eat() called");
    }

    public void move(){
        System.out.println("Animal.move() called");
    }
    
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;//we also use this.weight in place of weight(app. only in get method)....SAME THING ALSO APPLIED IN ALL GET METHODS
    }
}
//-All methods declared in both classes is not static (get to know more about methods later in the course).
//-Methods called whether it is of parent class or child class only inside method only(app. in all places).