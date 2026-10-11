public class Main_Bank {
    public static void main(String[] args) {
        Bank acc1 = new Bank();
        acc1.setPassword("Moeez@12321");
        acc1.name = "Moeez";
        System.out.println(acc1.name +"\n"+ acc1.getPassword());

    }
}