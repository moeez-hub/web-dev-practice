public class Student_Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Moeez";
        s.rollNum = 54;
        s.marks = 45;

        Student s2 = new Student("Eman", 45, 54);

        System.out.println(s+"\n"+s2);
    }    
}
