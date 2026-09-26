public class Task7_Main {
    public static void main(String[] args) {
        Task7_Payroll p1 = new Task7_Payroll();
        Task7_Payroll p2 = new Task7_Payroll("Ahmed", 32112, 40.10, 5.5);

        p1.setName("Moeez");
        p1.setIdNumber(23512);
        p1.setHourlyPayRate(30.10);
        p1.setNumberOfHoursWorked(4.5);
    
        p1.display();
        p2.display();

        System.out.println(p1.compare(p2));

        System.out.println(p1 +"\n"+ p2);

        p1.copy(p2);
    }
}
