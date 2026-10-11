public class Bank {
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;

    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
        System.out.println(balance);
    }

    public double withdraw(double amount) {
        return this.balance - amount;

    }
}