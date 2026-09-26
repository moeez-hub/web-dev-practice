public class Task8_Payroll {
    String name;
    int idNumber;
    double hourlyPayRate;
    double numberOfHoursWorked;

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
    
    double grossPay(){
        return this.hourlyPayRate * this.numberOfHoursWorked;
        
    }
}
