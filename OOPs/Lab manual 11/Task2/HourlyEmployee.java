public class HourlyEmployee extends Employee{
    private double hourlyWage;
    private int hoursWorkedPerWeek;

    HourlyEmployee(){
        super();
    }

    HourlyEmployee(double hourlyWage, int hoursWorkedPerWeek){
        this.hourlyWage = hourlyWage;
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }

    HourlyEmployee(String name, int id, double hourlyWage, int hoursWorkedPerWeek){
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHoursWorkedPerWeek(int hoursWorkedPerWeek) {
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }

    public int getHoursWorkedPerWeek() {
        return hoursWorkedPerWeek;
    }

    public double weeklyPay(){
        if(hoursWorkedPerWeek <= 40){
            return hoursWorkedPerWeek * hourlyWage;
        }
           else{
            double overtime = hoursWorkedPerWeek - 40;
            return (40*hourlyWage) + (overtime * hourlyWage * 1.5);
           } 
    }

    public void display(){
        System.out.println("Name : "+getName()+"\n"+ "ID  : "+getId()+"\n"+ "Hourly wage : "+getHourlyWage()+"\n"+ "Hours per week : "+getHoursWorkedPerWeek());
    }
}
