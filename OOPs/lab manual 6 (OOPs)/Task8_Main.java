import java.util.Scanner;

public class Task8_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String n = sc.nextLine();
        
        System.out.print("Enter Id Number: ");
        int id = sc.nextInt();

        System.out.print("Enter Hourly Pay Rate: ");
        double hourPay = sc.nextDouble();

        System.out.print("Enter Number of hours worked: ");
        double hours = sc.nextDouble();

        Task8_Payroll employ = new Task8_Payroll();

        employ.setName(n);
        employ.setIdNumber(id);
        employ.setHourlyPayRate(hourPay);
        employ.setNumberOfHoursWorked(hours);
    
        double grPay = employ.grossPay();
        System.out.print("Employ Gross Pay: "+"\n"+grPay);
    }    
}
