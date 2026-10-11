import java.util.Scanner;

public class Task1_DayOfYear {
    private int day;
    private int month;

    void input() {
        Scanner read = new Scanner(System.in); 
    Task1_DayOfYear obj = new Task1_DayOfYear(); 

    System.out.println("Enter the month as a number: "); 
    int m = read.nextInt(); 
   
    System.out.println("Enter the day of the month: "); 
    int d = read.nextInt();
    
        set(m, d);
    }

    void output() {
        System.out.println("Month = "+ month +", Day = "+ day);
        System.out.println("Ali's Birthday is Month = "+ month +", Day = "+ day +"\n"+ "Happy Birthday Ali!");
    }

    void set(int m, int d){
        this.month = m;
        this.day = d;
    }

    int getDay() {
        return this.day;
    }

    int getMonth() {
        return this.month;
    }
}
