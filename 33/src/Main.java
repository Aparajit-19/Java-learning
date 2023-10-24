//All classes object declared in main class


public class Main {
    public static void main(String[] args) {

    Floor obj1 = new Floor(2.75d,4.00d);
        System.out.println(obj1.getArea());
        
    Carpet obj = new Carpet(3.5d);
        System.out.println(obj.getCost());

    Calculator obj2 = new Calculator(obj1, obj); // yaha par humne floor object ki value ko obj1 ke barabar and carpet ke value ko obj ke barabar kar diya
        System.out.println(obj2.getTotalCost());



    }
}
