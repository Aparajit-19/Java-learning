public class Main {

    public static void main(String[] args) {

//        Account person= new Account(); //IT USES FIRST CONSTRUCTOR

        //HERE CONSTRUCTOR Account() IS AUTOMATICALLY GENERATED........
        //AFTER DECLARING CONSTRUCTOR WITH NO PARAMETER IN THAT PART AND THEN RUNNING CODE,LINE 5 EXECUTE THE STATEMENT FALL UNDER THAT CONSTRUCTOR AS HERE CONSTRUCTOR WITH NO PARAMETER IS USED

        Account person = new Account("006", 0.00d, "Aparajit Sharan", "@gmail.com", "8085409346");

//        person.setAccountNumber("41411010000006");
//        person.setBalance(0.00d);
//        person.setCustomerName("Aparajit Sharan");
//        person.setEmail("@gmail.com");
//        person.setPhoneNumber("8085409346");

        //LINE 10 AND LINE 12-16 WORKS IN SAME WAY SO USED LINE 10 OR LINE 12-16 NO PROB

        String check = person.getAccountNumber();          //OR        System.out.println(person.getAccountNumber());      is same
        System.out.println(check);

        double check1 = person.getBalance();
        System.out.println(check1);

        String  name = person.getCustomerName();
        System.out.println(name);

        String  email = person.getEmail();
        System.out.println(email);

        String num = person.getPhoneNumber();
        System.out.println(num);


        person.withdrawFund(100.00d);
        person.depositFund(50.00d);
        person.withdrawFund(100.00d);
        person.depositFund(51.00d);
        person.withdrawFund(100.00d);
        person.withdrawFund(1.00d);

        System.out.println("*********************");

        //CALLLING 3 CONSTRUCTOR:
        Account CON3 = new Account("Sonu", "@yahoo.com", "9669092047");
        //HERE, I USE ANOTHER CONSTRUCTOR AFTER USING ONE THERFORE I DECLARE NEW OBJECT AND THEN USE CONSTRUCTOR WITH IT

        System.out.println(CON3.getAccountNumber());
        System.out.println(CON3.getBalance());
        System.out.println(CON3.getCustomerName());
        System.out.println(CON3.getEmail());
        System.out.println(CON3.getPhoneNumber());

    }
}
// IF YOU WANT TO USE ANOTHER CONSTRUCTOR AFTER USING ONE THEN YOU HAVE TO DECLARE NEW OBJECT AND THEN USE THAT CONSTRUCTOR WITH IT
// COMMENT 5 AND SEE RESULT WITH 10 THEN DO VICE VERSA

