public class EnhancedPlayer {

    private String name; //instance var.(field) declared using encapsulation
    private int hitPoints = 100; //rem (setting default value 100 to health field)

                                                   //HOW TO RENAME FIELD NAME-
    //1.PLACE CURSOR ON FIELD NAME YOU WANT TO RENAME.
    //2.RIGHT CLICK MOUSE > REFACTOR > RENAME > ENTER.

    //NOTE: 1. THAT FIELD NAME CHANGE EVERYWHERE AUTOMATICALLY.
    //      2. AS FIELD NAME WHAT CHANGE IN CODE, NOTE IT AND REM. IT.
    //      3. FIELD NAME CHANGES BUT SOME PART OF CODE REMAINS IN THE STATE AS PREVIOUS (1 & 2) BUT OUTPUT REMAINS SAME. THIS IS COOL FEATURE
    //         OF ENCAPSULATION.

    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {//1 (int health)
        this.name = name;
        if (health > 0 && health <= 100){
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth (int damage){
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0){
            System.out.println("Player knocked out"); //Number of lives remaining for the player is either -ve or 0.
        }
    }

    public int getHealth() {//2
        return hitPoints;
    }
}
