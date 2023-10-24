                                              // SAME CODE BUT HERE CONSTRUCTORS USED

public class Account {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account (){ //THIS CONSTRUCTOR HAVE NO PAR AND THIS IS USED FOR EXTRA UNDERSTANDING
        this("56789", 2.50d, "default name", "default address",
                "default phone number"); //if you want to call another constructor from this constructor, then rem this part would be first statement of this constructor otherwise its shows error
        System.out.println("Empty constructor called");//SAMAJHNE KE LIYE GENERATE KIYA HAI
    }

    public Account (String accountNumber, double balance, String customerName, String email, String phoneNumber){ //CONSTRUCTOR 2
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        //THIS CON TAKE PLACE OF ALL SET METHODS AND HAVE 99% SIMILARITY WITH SET METHODS LIKE ASSIGNING VALUES TO FIELDS IN SAME WAY AS SET METHODS DO, PARAMETERS PART IS ALSO WAY IN BOTH
        System.out.println("Account constructor with parameter called"); //to understand we write this
    }

//    public Account(String customerName, String email, String phoneNumber) {
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//    }

//MATCH 27-31 WITH 37-39 WHICH IS SAME(HERE, WHAT HAPPENED IS WHEN YOU CALL THIS CONSTRUCTOR WHICH HAVE 3 PAR THEN THIS CONSTRUCTOR CALLED ANOTHER CONSTRUCTOR
    //WHICH HAVE 5 PAR BY PUTTING ACC. NO. & BALANCE AS DEFAULT VALUE.......HERE, WE NOT SET THIS CONSTRUCTOR PAR TO FIELDS AS USING LINE 38
    //WE ALREADY USE THIS CONSTRUCTOR PAR IN CONSTRUCTOR 2 BY TAKING ACC. NO. & BALANCE AS DEFAULT

    public Account(String customerName, String email, String phoneNumber) {
        this("default account number", 0.00d, customerName, email, phoneNumber); //NO (.) USED IN THIS STATEMENT.....
    }
    //AGAR CONSTRUCTOR DECLARE KARNE KE BAAD BHI SABHI SETTER KO AGAR LIKHA HUA BHI CHODD DIYA TABBHI CODE WAISA HEE EXECUTE HOGA AND AGAR NAHI LIKHA
                                                    //TABBHI KOI FARAK NAHI PADEGA

//    public void setAccountNumber (String accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public void setBalance (double balance) {
//        this.balance = balance;
//    }
//
//    public void setCustomerName (String customerName) {
//        this.customerName = customerName;
//    }
//
//    public void setEmail (String email) {
//        this.email = email;
//    }
//
//    public void setPhoneNumber (String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String  getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFund ( double add) {
        this.balance += add;
        System.out.println("Deposit of " + add + " made. Total amount : " + this.balance );
    }

    public void withdrawFund (double sub) {
        if (this.balance - sub >= 0) {
            this.balance -= sub;
            System.out.println("Withdraw of " + sub + " made. Total amount : " + this.balance);
        }
        else {
            System.out.println("Insufficient funds");
        }
    }
}

