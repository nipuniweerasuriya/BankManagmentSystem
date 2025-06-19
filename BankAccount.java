public class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) balance -= amount;
    }

    public boolean transfer(BankAccount receiver, double amount) {
        if(amount > 0 && amount <= balance){
            this.withdraw(amount);
            receiver.deposit(amount);
            return true;
        }
        return false;
    }

    public String displayInfo() {
        return "Account: " + accountNumber + "\nName: " + holderName + "\nBalance: Rs. " + balance;
    }
}
