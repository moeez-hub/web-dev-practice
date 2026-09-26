public class Task7_Main {
     public static void main(String[] args) {
        Task7_Payroll p1 = new Task7_Payroll();
        Task7_Payroll p2 = new Task7_Payroll("Ahmed", 32112, 40.10, 5.5);
        Task7_Payroll p3 = p1.create(p2);

        p1.setName("Moeez");
        p1.setIdNumber(23512);
        p1.setHourlyPayRate(30.10);
        p1.setNumberOfHoursWorked(4.5);
    
        p1.display();
        p2.display();
        p3.display();
        
        System.out.println(p1.compare(p2) +"\n"+ p1.isNotEqual(p2));

        System.out.println(p1.toString() +"\n"+ p2.toString() +"\n"+ p3.toString());

        p1.copy(p2);
}
