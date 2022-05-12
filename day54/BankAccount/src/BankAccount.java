public class BankAccount {

    private String accountHolderName;
    private int accountNumber;
    private double accountBalance;

    public BankAccount(){}

    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }
    public BankAccount(String accountHolderName, int accountNumber ,double accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void deposit(double amount) {
        this.accountBalance += amount;
    }

    public void withdrawal(double amount) {
        this.accountBalance -= amount;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void transfer(BankAccount acc, double amount) {
        withdrawal(amount);
        acc.deposit(amount);
    }

    public String toString() {
        return "Holders name: " + this.accountHolderName + " balance: " + this.accountBalance;
    }

}

