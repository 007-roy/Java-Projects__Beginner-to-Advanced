

public class Account {


    private final String name;
    private final String password;
    private double amount;




    public Account(String name, String password, double amount) {
        this.name = name;
        this.password = password;
        this.amount = amount;
    }



    public String getName() {
        return name;
    }


    public String getPassword() {
        return password;
    }


    public double getAmount() {
        return amount;
    }

    public void depositAmount(double amount) {
        this.amount += amount;
        System.out.print("\nAmount $"+amount +" has been deposited successfully...\n");
    }

    public void withdrawAmount(double amount) {
        if (this.amount > amount || this.amount == amount){
            this.amount -= amount;
            System.out.print("\nAmount $"+ amount +" has been withdrawn successfully...\n");
        }else {
            System.out.print("\n" +
                    "Your Amount is Low!!!!" +
                    "\n" +
                    "Please Deposit more money Or Withdraw less Money to continue." +
                    "\n");
        }
    }


}


