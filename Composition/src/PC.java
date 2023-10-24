public class PC {

    private Case theCase; //case is keyword or reserved word, that's why can't use it as name
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}

//IMP (INHERITANCE):
//-In inheritance, we only have option to inherits from one class (which is parent class) at a time and after this, in result we able to use
// fields & methods of this single class only (in child class) or (in main class by the object of child class ).

//IMP (COMPOSITION):
                                                          //IN PC CLASS
//-Here composition used i.e. PC has a Case, PC has a Monitor and PC has a Motherboard.
//-Objects create from class PC will able to use fields & methods of classes which class PC has i.e (Case,Monitor and Motherboard)

                                                          //IN CASE CLASS
//-Here composition used i.e. Case has a Dimensions.
//-Here objects create from class Case will able to use fields & methods of class which class Case has (i.e Dimensions)

                                                          //IN MONITOR CLASS
//-Here composition used i.e. Monitor has a Resolution.
//-Here objects create from class Monitor will able to use fields & methods of class which class Monitor has (i.e Resolution)
