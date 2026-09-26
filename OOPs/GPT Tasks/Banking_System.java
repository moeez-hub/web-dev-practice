import java.util.*;

public class Banking_System {
    private String name;
    private double balance;

    Banking_System(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    public void showBalance() {
        System.out.print("Balance: " + this.balance);
    }

    // public void setName(String n) {
    //     this.name = n;
    // }

    // public setBalance(double b){
    //     this.balance = b;
    // }

    public String getName() {
        return this.name;
    }

    public double getBalance(){
        return this.balance;
    }


class SavingAccount extends Banking_System {
    SavingAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount <= 500) {
            System.out.print("Balance may be less then 500");
        } else {
            super.withdraw(amount);
            System.out.print("Withdraw Successful");
        }
    }
}

  
}