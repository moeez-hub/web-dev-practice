public class Student implements Comparable {
int id;
String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayState(){
        System.out.println(getId()+ "\n"+ getName());
    }

    public int compareTo(Object otherObject){
        Student other = (Student) otherObject;

        return this.name.compareTo(other.name);
    }
}
