public class Carpet {

    private double cost;

    public Carpet (double cost){
        if (cost < 0 ){
            this.cost = 0;
        } else {
            this.cost = cost; //value of field set i.e. value of this.field is field
        }
    }

    public double getCost() {
        return this.cost;//value of field returns i.e. value of this.field which is field
    }
}
