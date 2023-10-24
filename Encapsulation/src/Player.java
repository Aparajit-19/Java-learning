                                   //-THIS EXAMPLE HELPS US TO UNDERSTAND WHY WE NEED ENCAPSULATION.
public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth (int damage){
        this.health = this.health - damage;
        if (this.health <= 0){
            System.out.println("Player knocked out"); //Number of lives remaining for the player is either -ve or 0.
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
