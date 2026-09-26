class SalariedEmployee extends Employee {
private double annualSalary;

SalariedEmployee(){
    
}

SalariedEmployee(double annualSalary){
    this.annualSalary = annualSalary;
    }

    SalariedEmployee(String name, int id, double annualSalary){
        super(name, id);
        this.annualSalary = annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public double weeklyPay(){
        return annualSalary / 52;
    }

    public void display(){
        super.display();
        System.out.println("Annual Salary : "+getAnnualSalary());
    }
}
