public class Operations implements ATM_Machine{

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    private double amount;


    @Override
    public void check_Balance() {
        System.out.print("Current Balance: ");
        System.out.print(getAmount() + "\n\n");
    }


    @Override
    public void withdraw_Money(double amount) {
        if (amount > getAmount() ){
            System.out.print("Insufficient Amount!!!\n");
            System.out.print("Please Check Balance to Withdraw Your Amount.\n\n");
        }else {
            this.amount = this.amount - amount;
            setAmount(this.amount);
            System.out.print("Withdrawal Successful!\n");
            System.out.println("Current Balance: " + getAmount());
        }
    }

    @Override
    public void deposit_Money(double amount) {
        this.amount = this.amount + amount;
        setAmount(this.amount);
        System.out.print("Deposit Successful!\n");
        System.out.println("Current Balance: " + getAmount());
    }


}
