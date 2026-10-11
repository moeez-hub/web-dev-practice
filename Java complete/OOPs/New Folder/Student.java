public class Student{
    String name;
    int rollNum;
    int marks;

    Student(){
        // this.name = name;
        // this.rollNum = rollNum;
        // this.marks = 0;
    }

    Student(String name, int rollNum, int marks){
        this.name = name;
        this.rollNum = rollNum;
        this.marks = marks;
    }

    public String toString(){
        return name +"   "+ rollNum +"   "+ marks; 
    }
}