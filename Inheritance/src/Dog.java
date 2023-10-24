                            //THIS CLASS IS DERIVED CLASS OR SUBCLASS OR CHILD CLASS OF ANIMAL CLASS(WHICH IS PARENT CLASS)

import javax.swing.*;


//HERE I USE BODY OF FIELDS & METHODS OF PARENT CLASS
public class Dog extends Animal {//USE ANIMAL CLASS(PARENT) IN DOG CLASS(CHILD)

    //EXTRA FIELDS OF DOG CLASS(PERSONAL) BESIDE FIELDS OF PARENT CLASS(ANIMAL)
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String fur;

    //INITIALIZING PARENT CLASS FIELDS WITH THESE PARAMETERS BY USING SUPER KEYWORD
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String fur) {
        super(name, 22, 22, size, weight);//HERE WE CALL ALL FIELDS OF PARENT CLASS AND SETTING PAR AS VALUE FOR FIELDS AND DEFAULT VALUES TO REMAINING FIELDS..........//CALLING SUPERCLASS FIELDS HERE
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.fur = fur;
    }

    public void check(){
    }

    private void chew(){//PRIVATE METHOD
        System.out.println("Dog.chew() called");
    }

    @Override //ISKO LIKHE YA NAHI LIKHE CHALEGA YEH BAS BATA RAHA HAI OVERRIDE KIYA HAI HUMNE
    public void eat() {
        chew();//CALLING THIS METHOD AT THIS LINE......REM. THIS METHOD IS PRIVATE AND IT EXECUTE HERE FOR eat() method...
        System.out.println("dog.eat() called");
        super.eat(); //CALLING SUPERCLASS EAT METHOD HERE
        //LINE 32 & 33 IS EXTRA FUNCTIONALITY I ADD....
    }
}
