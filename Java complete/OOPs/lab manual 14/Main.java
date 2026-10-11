public class Main {
    public static void main(String[] args) {
    
        Employee[] e = new Employee[4];
        
        e[0] = new Employee("moeez", 32);
        e[1] = new HourlyEmployee("Ahmad", 9098, 10.0, 70);
        e[2] = new SalariedEmployee("Usman", 5676,  55000.0);
        e[3] = new Manager(65000.0,"Ali", 4041, 500.0);

        Employee.display(e);


    }
}
