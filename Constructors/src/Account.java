public class Account {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setAccountNumber (String accountNumber) {//int is used in parameter because field accountNumber is of type int
        this.accountNumber = accountNumber; //par var name should be same as that of field.
    }//set method used in only setting hence nothing returned thus void is used

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

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

//computer works step by step...........i.e read code line by line and finish it all and then again start with value that it got at the end.
