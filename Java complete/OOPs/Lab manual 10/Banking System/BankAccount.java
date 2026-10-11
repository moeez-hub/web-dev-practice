public class BankAccount {
    private int accountNumber;
    private String accountOwner;
    private double accountBalance;

    public BankAccount() {
        // accountNumber = 0;
        // accountOwner = "";
        // accountBalance = 0.0;
    }
    
    public BankAccount(int accountNumber, String accountOwner, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.accountBalance = accountBalance;
    }
    
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void accountStatement() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Owner: " + accountOwner);
        System.out.println("Account Balance: " + accountBalance);
    }

    public void deposit(double amount) {
        accountBalance += amount;
        System.out.println("Total amount : "+ amount);
    }

    public void withdrawal(double amount) {
        accountBalance -= amount;
        System.out.println("Remaining amount : "+amount);
    }
}
