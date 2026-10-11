public class UsingBankAccount {
    public static void main(String[] args) {
        
        BankAccount[] array = new BankAccount[4];

        BankAccount b = new BankAccount(100.0);
        BankAccount b2 = new BankAccount(200.42);
        BankAccount b3 = new BankAccount(600.3);
        BankAccount b4 = new BankAccount(100.0);


        array[0] = b;
        array[1] = b2;
        array[2] = b3;
        array[3] = b4;
    
        System.out.println(array[0].compareTo(array[1]));
        
        System.out.println(array[2].compareTo(array[3]));
    
        System.out.println(array[0].compareTo(array[3]));
    }
}
