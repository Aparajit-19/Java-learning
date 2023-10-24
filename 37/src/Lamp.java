public class Lamp {

    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() { //get method name in boolean is written like this
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
