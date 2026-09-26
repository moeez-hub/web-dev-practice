import java.util.Scanner;

public class Student_System {
    String name;
    int marks;

    void setData(String n, int m){
        this.name = n;
        this.marks = m; 
    }

    void addMarks(int extraMarks) {
        this.marks = this.marks + extraMarks;
    }

    void showData() {
        System.out.println("Name: " + name + "\n" + "Marks: " + marks);
    }
}