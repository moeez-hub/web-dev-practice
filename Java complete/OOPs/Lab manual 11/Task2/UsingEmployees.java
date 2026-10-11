public class UsingEmployees {
    public static void main(String[] args) {
       

        System.out.println("_____Hourly Employ_____");
        HourlyEmployee h = new HourlyEmployee();
        HourlyEmployee h2 = new HourlyEmployee("Ali", 54654, 4.0, 12);

        h.setName("Ali");
        h.setId(101);
        h.setHourlyWage(500);
        h.setHoursWorkedPerWeek(45);

        h.display();
        System.out.println(h.weeklyPay());

        h2.display();
        System.out.println(h2.weeklyPay());
        
        System.out.println("_____Salaried Employe_____");
        SalariedEmployee s = new SalariedEmployee();
        SalariedEmployee s2 = new SalariedEmployee("Ahmad", 32422, 45000.0);
        
        s.setName("Ahmed");
        s.setId(102);
        s.setAnnualSalary(520000);
        s.display();
        System.out.println(s.weeklyPay());

        s2.display();
        System.out.println(s2.weeklyPay());

        System.out.println("_____Manager_____ ");
        Manager m = new Manager();
        Manager m2 = new Manager("Moeez", 23432, 67000, 500);

        m.setName("Usman");
        m.setId(103);
        m.setAnnualSalary(1040000);
        m.setWeeklyBonus(5000);
        
        m.display();
        System.out.println(m.weeklyPay());

        m2.display();
        System.out.println(m2.weeklyPay());

        Employee[] employees = new Employee[3];

        employees[0] = h;
        employees[1] = s;
        employees[2] = m;

        Employee.display(employees);
    }
}
