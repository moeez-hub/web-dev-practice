public class Person{
    private String name;
    private int age;

    public void setName(String n) {
        this.name = n;
    }

    public String getName(){
        return name;
    }
}

class Student extends Person {
    private int rollNo;

    public void setRollNo(int r) {
        this.rollNo = r; 
    }

    public int getRollNo() {
        return rollNo;
    }
} 