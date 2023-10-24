public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4= new Wall("North");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("Modern", 4,3,2,1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Aparajit", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

                                                        //Line 15 ke liye me yeh baate yaad rakhna-

        //-Here, wall1, wall2, wall3 wall4, ceiling, bed and lamp are the objects declared in main class.
        //-Fields we declared in class Bedroom (which we treat as object) with the name same as that of objects we declared in main class. Actually
        // these are not same objects.
        //-Here, in line 15 we use objects(declared in main class) in constructor of class Bedroom as value of the field(which we treat as object).
        // We do so to equalise the field(which we treat as object) to objects(declared in main class).
        //-To use wall1, wall2, wall3 wall4, ceiling, bed and lamp as the value of the fields, we have to first declare all these objects in main class.
        //-If you dont want to declare than you write the line 15 like this, which also serves the same.

                       /* Bedroom bedroom = new Bedroom("Aparajit", new Wall("West"), new Wall("East"),
                                new Wall("South"), new Wall("North"), new Ceiling(12,55),
                                new Bed("Modern", 4,3,2,1), new Lamp("Classic", false, 75));*/

        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }
}
