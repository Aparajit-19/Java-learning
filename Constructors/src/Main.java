public class Main {//iske bina bhi code not run

    public static void main(String[] args) { //iske bina bhi code not run

        Account person= new Account();

        person.setAccountNumber("41411010000006");
        person.setBalance(0.00d);
        person.setCustomerName("aparajitSharan");//string hai so double quotes me input dalna padega
        person.setEmail("@gmail.com");
        person.setPhoneNumber("8085409346");


        String check = person.getAccountNumber();
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
        person.depositFund(50.00d);//double aisee use hota hai.......
        person.withdrawFund(100.00d);
        person.depositFund(51.00d);
        person.withdrawFund(100.00d);



    }
}
