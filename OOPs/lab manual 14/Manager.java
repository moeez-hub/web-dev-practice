class Manager extends SalariedEmployee {
    private double weeklyBonus;

   Manager(){
    
   }
  
    Manager(double weeklyBonus){
    this.weeklyBonus = weeklyBonus;
  }

     Manager(double annualSalary, String name, int id, double weeklyBonus){
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
        return super.weeklyPay() + getWeeklyBonus();
    }

    public void display(){
        super.display();
        System.out.println("Weekly bonus : "+ getWeeklyBonus());
    }
}
