public class Employee{
private String name;
private int Id;

    Employee(){

    }

    Employee(String name, int id){
        this.name = name;
        this.Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getId() {
        return Id;
    }

    public double weeklyPay(){
        return 0;
    }

    public void display(){
        System.out.println("Name : "+ this.getName() +"\n Id : "+ this.getId());
    }

    public static void display(Employee[] employees){
        for(int i =0; i<employees.length; i++){
            
            Employee e = employees[i];

            employees[i].display();
            System.out.println(e.weeklyPay());
        }
    }
}