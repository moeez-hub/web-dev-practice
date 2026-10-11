public class SalariedEmployee extends Employee{
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
        return annualSalary/52;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Name : "+getName()+"\n"+ "ID  : "+getId()+"\n"+ getAnnualSalary());
    }
}
