public class BankAccount {

    private String accountHolderName;
    private double accountBalance;

    public BankAccount(String accountHolderName, double accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    public void deposit(double amount) {
        this.accountBalance += amount;
    }

    public void withdrawl(double amount) {
        this.accountBalance -= amount;
    }

    public String toString() {
        return "Holders name: " + this.accountHolderName + " balance: " + this.accountBalance;
    }

}
