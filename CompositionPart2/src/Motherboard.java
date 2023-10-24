                    //-This project is same as project composition but some lines/parts of codes are change.

                    //-Compare this project with project composition and mark the difference and rem. this diff.

//-In this project what we do is to create another scenario whereby we can actually hide the functionality (here functionality means abhi iss
        //project me jaisa program function karega woh composition project me jaisa function kar raha tha program usse alag karega)
                    //further so that we don't allow the calling program to access those objects directly.
public class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard (String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram (String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
