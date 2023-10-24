public class Main {

    public static void main(String[] args) {

        VipCustomer object1 = new VipCustomer();
        System.out.println(object1.getName());
        System.out.println(object1.getCreditLimit());
        System.out.println(object1.getEmailAddress());
        System.out.println("***********");

        VipCustomer object2 = new VipCustomer("Anubhav", "900");
        System.out.println(object2.getName());
        System.out.println(object2.getCreditLimit());
        System.out.println(object2.getEmailAddress());
        System.out.println("***********");

        VipCustomer object3 = new VipCustomer("Aparajit", "1500", "sharanaparajit19gmail.com");
        System.out.println(object3.getName());
        System.out.println(object3.getCreditLimit());
        System.out.println(object3.getEmailAddress());
        System.out.println("***********");
    }
}
