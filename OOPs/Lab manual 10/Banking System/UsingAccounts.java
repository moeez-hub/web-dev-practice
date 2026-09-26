public class UsingAccounts {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount(2311, "Moeez", 500.4);

        b1.setAccountBalance(400.23);
        b1.setAccountNumber(21312);
        b1.setAccountOwner("Ahmad");

        System.out.println("_____Balance Account Session_____");
        b1.accountStatement();

        b1.deposit(100);
        b1.withdrawal(300);

        b2.accountStatement();

        b2.deposit(3213);
        b2.withdrawal(566);

        SavingAccount s1 = new SavingAccount();
        SavingAccount s2 = new SavingAccount(21335, "Umer", 7000.34, 480.0);

        s1.setAccountBalance(23132);
        s1.setAccountNumber(213132);
        s1.setAccountOwner("Zeeshan");
        s1.setAnnualInterest(20.3);

        System.out.println("_____Saving Account Session_____");
        s1.accountStatement();
        // s2.accountStatement();

        s1.deposit(200);
        s1.withdrawal(100);
        s1.depositMonthlyInterest();
        s1.depositMonthlyInterest();
        s1.depositMonthlyInterest();
        s1.depositMonthlyInterest();

        s2.accountStatement();
        
        s2.deposit(400);
        s2.withdrawal(600);
        s2.depositMonthlyInterest();
        s2.depositMonthlyInterest();

        CheckingAccount c1 = new CheckingAccount();
        CheckingAccount c2 = new CheckingAccount(213565, "Ali", 600.0, 5600.90);

        c1.setAccountNumber(213456);
        c1.setAccountOwner("Usman");
        c1.setAccountBalance(8000.0);
        c1.setInsuficientFundsFee(324.0);

        System.out.println("_____Cheking Account Session_____");
        c1.accountStatement();

        c1.deposit(5050);
        c1.withdrawal(400);

        c2.accountStatement();

        c2.deposit(4352);
        c2.withdrawal(4522);
    }
}
