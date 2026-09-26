public class Bank2 {
    public static void main(String[] args) {
        Bank acc1 = new Bank();
       
       acc1.setBalance(500);
  
      System.out.println(acc1.getBalance());
      
      System.out.println("After Deposite");
        acc1.deposit(180.0);

      System.out.println("After withdrawl");
      if(acc1.withdraw(100.0)<0){
        System.out.println("Balance less then 0");
      }
    }
}