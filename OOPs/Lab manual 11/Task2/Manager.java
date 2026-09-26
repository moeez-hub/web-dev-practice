public class Manager extends SalariedEmployee{
    private double weeklyBonus;

    Manager(){
        super();
    }

    Manager(double weeklyBonus){
        this.weeklyBonus = weeklyBonus;
    }

    Manager(String name, int id, double annualSalary, double weeklyBonus){
        super(name, id, annualSalary);
        this.weeklyBonus = weeklyBonus;
    }

    public void setWeeklyBonus(double weeklyBonus) {
        this.weeklyBonus = weeklyBonus;
    }
 
    public double getWeeklyBonus() {
        return weeklyBonus;
    }

    public double weeklyPay(){
        return super.weeklyPay() + weeklyBonus;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        super.display();
        System.out.println("Bonus : "+ getWeeklyBonus());
    }
}
