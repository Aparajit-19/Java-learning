public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Dog", 1,1,5,5 ); //NAME IS OF TYPE STRING SO ITS VALUE HERE WRITTEN IN DOUBLE QUOTES

        animal.eat();//YAHA PAR OBJECT animal, CLASS Animal se create hua hai toh yeh iss class ke exact methods and fields use karega
        animal.move();
        System.out.println(animal.getName());
        System.out.println(animal.getBrain());
        System.out.println(animal.getBody());
        System.out.println(animal.getSize());
        System.out.println(animal.getWeight());

        System.out.println("**************");

        Dog dog = new Dog("Tommy", 8, 20,2,4,1,20,"Long silky");

        dog.eat();//HERE WE CREATE OBJECT "dog" WITH Dog CLASS SO THIS OBJECT USE FIELDS & METHODS OF Dog CLASS ONLY BUT INHERITANCE MAKES POSSIBLE TO USE OTHER CLASS(PARENT) FIELDS & METHODS.........
        // OVERRIDE METHOD JO MAINE KIYA HAI WO APPLICABLE HOGA BECAUSE OBJECT dog CLASS Dog SE CREATE HUA HAI AND OVERRIDE Dog class me hua hai toh islye

        System.out.println("**************");

        dog.move();
        System.out.println(dog.getName());
        System.out.println(dog.getBrain());
        System.out.println(dog.getBody());
        System.out.println(dog.getSize());
        System.out.println(dog.getWeight());
        //15-24, ALL DONE WITH dog OBJECT SO ALL CALCULATION FROM 15-21 WILL DONE USING VALUES OF PARAMETER WE FILL DURING CREATING OBJECT dog









    }
}
