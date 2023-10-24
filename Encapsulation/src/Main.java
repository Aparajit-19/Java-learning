public class Main {
    public static void main(String[] args) {

        Player player = new Player();
        //Object 'player' declared using class Player.
        //There is no constructor declared in the Player class so default constructor [Player()] with
        // no arguments automatically used by the intellij.

         player.name = "Aparajit"; //rem
         //-Here we access fields because it is public
         player.health = 20; //rem
         player.weapon = "Sword"; //rem
         //-Objects created from a class can use all fields and methods of that class.
         //-Every object created has its own unique values(i.e. of fields and methods) which (may or may not) be different from other objects values.

        int damage = 10; //var. declared
        player.loseHealth(damage);
        //-We easily put loseHealth method par. value 10 in line 17 but this is another way.
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

                                            //-Till here, our code fulfill all our needs as the way we want.


        //THE REASON OF USING ENCAPSULATION ARE AS FOLLOWS:
        //1.ENCAPSULATION MAKES OUR CODE EASY TO UNDERSTAND.
        //2.HERE, WHAT WE WANT, WE WANT FOR ONE PARTICULAR PERSON OUR HEALTH FIELD VALUE REMAINS CONSTANT AND FROM THIS DAMAGE MINUS AND WE GET OUR
        //  REMAINING HEALTH RIGHT. BUT USING THIS AFTER LINE 23-
                                       /*    damage = 11;
                                        player.health = 200;
                                        player.loseHealth(damage);
                                        System.out.println("Remaining health = " + player.healthRemaining());
                                       */
        //  OUR HEALTH FIELD VALUE GOT CHANGED BY THE USER AND THIS WE DON'T WANT. SO TO OVERCOME THIS ENCAPSULATION USED.
        //3.ON WRITING CODE TILL LINE 23 AND THEN CHANGING FIELD NAME CAN DISTURB WHOLE CODE.SO TO OVERCOME THIS ENCAPSULATION USED.
        //4.EVEN WITHOUT INITIALIZING THE FIELD, OUR CODE WORKS WHICH IN RESULT GIVES WRONG OUTPUT. SO TO OVERCOME THIS ENCAPSULATION USED.

        //NOTE: THE ABOVE MENTION 4 POINTS SOLVED BY USING ENCAPSULATION, HOW ? - UNDERSTAND IT FROM PROJECT ENCAPSULATIONPART2.
    }
}
