public class Main {//MAIN CLASS AND MAIN METHOD IS IMP. FOR RUNNING OF PROJECT
public static void main(String[] args) {

Animal animal = new Animal("Animal", 1,1,5,5);//1ST OBJECT CREATE FROM ANIMAL CLASS WITH THESE PAR. VAL.

Dog dog = new Dog("Yorkie",8,20,2,4,1,20,"long silky");//1ST OBJECT CREATE FROM DOG CLASS  WITH THESE PAR. VAL.
//FOR THIS OBJ., WE USE THESE VALUES FOR Dog CLASS FIELDS AND PARENT CLASS FIELDS(WITH SOME DEFAULT VALUES FOR PARENT CLASS FIELDS)

        dog.eat();//dog OBJ. CREATE FROM Dog CLASS SO OVERRIDE OF eat() METHOD IS USED
        System.out.println("***************");
        dog.walk();
        System.out.println("***************");
        dog.run();


    }
}
