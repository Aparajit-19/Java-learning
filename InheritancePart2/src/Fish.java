//I CREATE NEW CLASS FISH WHICH WANT TO USE ALL FIELDS & METHODS(BODY) OF CLASS ANIMAL SO ANIMAL CLASS BECOME MY PARENT CLASS AND FISH
                               // CLASS BECOME MY CHILD CLASS AND THEN SAME THING REPEATS(I.E WHAT I DO IN DOG CLASS)

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish (String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);//CALLING ALL FIELDS OF SUPERCLASS HERE AND SETTING PAR AS VALUE AND SOME DEFAULT VALUE IN THIS WAY
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    private void moveMuscles(){

    }

    private void moveBackFin(){

    }

    private void swim(int speed){
        moveMuscles();//CALLING THIS METHOD HERE
        moveBackFin();//CALLING THIS METHOD HERE
        super.move(speed);//CALLING SUPERCLASS MOVE METHOD HERE
    }

    
}






