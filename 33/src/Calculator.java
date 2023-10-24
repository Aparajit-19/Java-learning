                                //REMEMBER THE CONCEPT DISCUSS IN LAST IN POINT CLASS IN CE 32 AS IT USE HERE
public class Calculator {

    //(2 FIELD DECLARED FROM 6-7)

    private Floor floor; //(Floor floor)type of object declaration with no constructor and no new keyword
    private Carpet carpet; //(Carpet carpet)type of object declaration with no constructor and no new keyword

    // Ist field is of type Floor and name floor and second field is of type Carpet and name carpet

    public Calculator (Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost (){
        double totalCost = floor.getArea() * carpet.getCost();
        return totalCost;
    }
}
//Floor floor; & Carpet carpet; is actually 2 objects but these 2 objects have diff class so we cant access these 2 object private
                              //field in this class but these 2 objects have public methods so we access them in this class
