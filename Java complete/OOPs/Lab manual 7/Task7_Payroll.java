public class Task7_Payroll {
    String name;
    int idNumber;
    double hourlyPayRate;
    double numberOfHoursWorked;

    Task7_Payroll() {

    }

    Task7_Payroll(String name, int idnumber, double hourlyPayRate, double numberOfHoursWorked) {
        this.name = name;
        this.idNumber = idnumber;
        this.hourlyPayRate = hourlyPayRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    void display() {
        System.out.println(
                getName() + "\n" + getIdNumber() + "\n" + getHourlyPayRate() + "\n" + getNumberOfHoursWorked());
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    int getIdNumber() {
        return this.idNumber;
    }

    void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    double getHourlyPayRate() {
        return this.hourlyPayRate;
    }

    void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    double getNumberOfHoursWorked() {
        return this.numberOfHoursWorked;
    }

    void copy(Task7_Payroll p) {
        p.idNumber = this.idNumber;
        p.name = this.name;
        p.hourlyPayRate = this.hourlyPayRate;
        p.numberOfHoursWorked = this.numberOfHoursWorked;
    }

    public String toString() {
        return getName() + " " + getIdNumber() + " " + getHourlyPayRate() + "" + getNumberOfHoursWorked();
    }

    double grossPay() {
        return this.hourlyPayRate * this.numberOfHoursWorked;

    }

    boolean compare(Task7_Payroll p) {
        return this.getName().equals(p.getName()) && this.getIdNumber() == p.getIdNumber()
                && this.getHourlyPayRate() == p.getHourlyPayRate()
                && this.getNumberOfHoursWorked() == p.getNumberOfHoursWorked();
    }
}
