public class Task1_Main {
    public static void main(String[] args) {
        Task1_DayOfYear today = new Task1_DayOfYear();
        Task1_DayOfYear birthday = new Task1_DayOfYear();
   
        System.out.println("Enter Todays Date : ");
        today.input();
    
        System.out.print("Todays Date is : ");
        today.output();
    }
}
