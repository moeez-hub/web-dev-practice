public class CheckingAccount extends BankAccount {
    private double insuficientFundsFee;

    CheckingAccount() {

    }

    CheckingAccount(double insuficientFundsFee) {
        this.insuficientFundsFee = insuficientFundsFee;
    }

    CheckingAccount(int accountNumber, String accountOwner, double accountBalance, double insuficientFundsFee) {
        super(accountNumber, accountOwner, accountBalance);
        this.insuficientFundsFee = insuficientFundsFee;
    }

    public void setInsuficientFundsFee(double insuficientFundsFee) {
        this.insuficientFundsFee = insuficientFundsFee;
    }

    public double getInsuficientFundsFee() {
        return insuficientFundsFee;
    }

    @Override
    public void withdrawal(double amount) {
        if (amount < getAccountBalance()) {
            super.withdrawal(amount);
        } else {
            System.out.println("Insuficient Funds Fee : " + insuficientFundsFee);
        }
    }

    @Override
    public void accountStatement() {
        // TODO Auto-generated method stub
        super.accountStatement();
        System.out.println("Insuficient Funds Fee : " + insuficientFundsFee);
    }
}
