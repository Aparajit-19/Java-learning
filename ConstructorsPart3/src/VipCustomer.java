public class VipCustomer {

    private String name;
    private String creditLimit;
    private String emailAddress;

   public VipCustomer () {
       this("default name", "default creditLimit", "default email address"); //CALLING 3RD CONSTRUCTOR BY TAKING 3 DEFAULT VALUES
   }

   public VipCustomer (String name, String  creditLimit){
       this(name, creditLimit, "default email address"); //CALLING 3RD CONSTRUCTOR WITH 1 DEFAULT VALUE......rem the way how i call
   }

    public VipCustomer (String name, String creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return this.name;
    }

    public String getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }
}
