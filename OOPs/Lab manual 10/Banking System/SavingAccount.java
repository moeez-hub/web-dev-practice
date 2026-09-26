public class SavingAccount extends BankAccount {
    private double annualInterest;

    SavingAccount() {

    }

    SavingAccount(double annualInterest) {
        this.annualInterest = annualInterest;
    }

    SavingAccount(int accountNumber, String accountOwner, double accountBalance, double annualInterest) {
        super(accountNumber, accountOwner, accountBalance);
        this.annualInterest = annualInterest;
    }

    public void setAnnualInterest(double annualInterest) {
        this.annualInterest = annualInterest;
    }

    public double getAnnualInterest() {
        return annualInterest;
    }

    @Override
    public void withdrawal(double amount) {
        // TODO Auto-generated method stub
        if (amount < getAccountBalance()) {
            super.withdrawal(amount);
        }
    
        else{
            System.out.println("Insuficient Balance");
        }
    }

    public void depositMonthlyInterest() {
        double monthlyRate = getAccountBalance()/12;
        deposit(getAccountBalance() * monthlyRate);
    }

    @Override
    public void accountStatement() {
        // TODO Auto-generated method stub
        super.accountStatement();
        System.out.println("Annual interest : " + getAnnualInterest());
    }
}