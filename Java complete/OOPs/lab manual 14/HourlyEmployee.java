public class HourlyEmployee extends Employee {
    private double hourlyWage;
    private int hourlyWorkedPerWeek;

    HourlyEmployee(){

    }

    HourlyEmployee(double hourlyWage, int hourlyWorkedPerWeek) {
        this.hourlyWage = hourlyWage;
        this.hourlyWorkedPerWeek = hourlyWorkedPerWeek;
    }

    HourlyEmployee(String name, int id, double hourlyWage, int hourlyWorkedPerWeek) {
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.hourlyWorkedPerWeek = hourlyWorkedPerWeek;

    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWorkedPerWeek(int hourlyWorkedPerWeek) {
        this.hourlyWorkedPerWeek = hourlyWorkedPerWeek;
    }

    public int getHourlyWorkedPerWeek() {
        return hourlyWorkedPerWeek;
    }

    public double weeklyPay() {
        if (hourlyWorkedPerWeek <= 40) {
            return hourlyWorkedPerWeek * hourlyWage;    
        }

        else {
            double overtime = hourlyWorkedPerWeek - 40;
            return (40 * hourlyWage) + (overtime + hourlyWage * 1.5);
        }
    }

    public void display(){
        super.display();
        System.out.println("Hourly Wage : "+getHourlyWage()+"\n Hourly Worked Per Week : "+ getHourlyWorkedPerWeek());
    }
}
