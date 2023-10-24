class Movie{
    private String name;

    public Movie(String name){
        this.name = name;
    }
    public String plot(){
        return "No plot here"; //String "No plot here" is return from this method
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{ //extends mean inherits from
    public Jaws(){
        super("Jaws"); //setting default value("Jaws") to inherited field(name) for all objects of Jaws class
    }
    @Override
    public String plot(){ //-it is overriden method(as same method name of parent class is used in child class after uisng extends keyword)
                          // so override annotation likhe ya na likhe farak nahi padta
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot(){
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot(){
        return "Kids try and escape a maze.";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgettable extends Movie{
    public Forgettable(){
        super("Forgettable");
    }
    //In this class we not override plot method of parent class.
}


public class Main {
    public static void main(String[] args) {
        for (int i=1; i<11; i++){
            Movie movie = randomMovie(); //105-110 concept used.
            System.out.println(("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n"));
            //-"\n" starts the output from next line.
            //-movie.plot() : this is polymorphism.
        }
    }
         //Below method is a part of main class not of any other class(like Movie/StarWars/Forgettable) so it declared static.

    public static Movie randomMovie(){ //[Movie randomMovie()] - treat it like object declared
        int randomNumber = (int) ((Math.random() * 5 ) + 1);
        //1. Math.methodName is a way of calling all diff. mathematical methods.
        //2. Math.random() method returns a random double type number greater than or equal to 0.0 and less than 1.0.
        //3. ((Math.random() * 5 ) + 1) - this expression give value in double so int is used before this exp. to convert it into int as we want
        //   our var. (randomNumber) in int.
        //4. Range of Math.random() is [0.0 <= Math.random() range < 1.0] so range of ((Math.random() * 5 ) + 1) is [1.0 <= ((Math.random() * 5 ) + 1)
        //  < 6.0] and therefore range of (int) ((Math.random() * 5 ) + 1) is [1 <= (int) ((Math.random() * 5 ) + 1) < 6 or <= 5]
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
        //1. Returning a new object.
        //2. It is same as:
                       /*   Jaws jaws = new Jaws();
                            return jaws;
                       */
            case 2:
                return new IndependenceDay(); //returning a new object
            case 3:
                return new MazeRunner(); //returning a new object
            case 4:
                return new StarWars(); //returning a new object
            case 5:
                return new Forgettable(); //returning a new object
        }
        return null; //if no above cases then return null.
    }
//-In randomMovie() method, what happened is jaise hee new object from switch statements returns, it equalises to Movie randomMovie() as:
                                   /* Movie randomMovie() = new Jaws(); //for ex.*/
                                   /* Movie randomMovie() = new IndependenceDay(); //for ex.*/ //and so on.....
         //now,
         //-it is acceptable because all these objects classes inherits from class Movie (i.e. inheritance). Hence, we say that Jaws IS A Movie,
         // IndependenceDay IS A Movie and soon..... as inheritance is used so IS A relationship is applicable.




}

//-The way of code written in this project is just another way of writing of what we do previously.
//-Yellow highlight means warning (i.e it might be incorrect).
//-Green underline means typo error.
//-Red underline means technical error.
