import java.util.Scanner;

public class Banking_System_Main {
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter Deposit Balance: ");
        Double deposit_balance = sc.nextDouble();

        System.out.print("Enter Withdraw Amount: ");
        Double withdraw_balance = sc.nextDouble();
        
        SavingAccount account1 = new SavingAccount(name, balance);
        account1.deposit(deposit_balance);
        account1.withdraw(withdraw_balance);
        account1.showBalance();
    }
}
