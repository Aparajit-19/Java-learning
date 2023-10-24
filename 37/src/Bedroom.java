public class Bedroom {

    private String name; //var. name of type String
    private Wall wall1; //var. wall1 of type Wall (treat it like object declaration)
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling; //var. ceiling of type Ceiling (treat it like object declaration)
    private Bed bed; //var. bed of type Bed (treat it like object declaration)
    private Lamp lamp; //var. lamp of type Lamp (treat it like object declaration)

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed(){
        System.out.println("Bedroom -> Making bed |");
        bed.make();//rem
    }
}
