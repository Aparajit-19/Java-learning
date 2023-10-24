public class PC {

    private Case theCase;
    private Monitor monitor; //treat it like object declaration
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {//public instance method declared
        //getTheCase().pressPowerButton();
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() { //private instance method declared
        //Fancy graphics
        //getMonitor().drawPixelAt(1200,50,"yellow");//1
        monitor.drawPixelAt(1200,50,"yellow");//2
        //1 and 2 are the two ways to do a same thing but 2 is much better than 1.
    }

    /*private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() { //treat it like object declaration
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }*/
}
