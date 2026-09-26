package task;

public class Employee {
    private String name;
    private int Id;
    private String department;
    private String position;

    Employee() {

    }

    Employee(String name, int Id, String department, String position) {
        this.name = name;
        this.Id = Id;
        this.department = department;
        this.position = position;
    }

    void display() {
        System.out.println(name + "\n" + Id + "\n" + department + "\n" + position);
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

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    void copy(Employee e) {
        this.name = e.name;
        this.Id = e.Id;
        this.department = e.department;
        this.position = e.position;
    }

    public String toString() {
        return "Name : " + getName() + "\nID : " + getId() + "\nDepartment : " + getDepartment() + "\nPosition : "
                + getPosition();
    }

    public boolean compare(Employee e) {
        return this.getName() == e.getName() && this.getId() == e.getId() && this.getDepartment() == e.getDepartment()
                && this.getPosition() == e.getPosition();
    }

    
}
