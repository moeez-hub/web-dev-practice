import java.util.*;

public class Student_System_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student_System s1 = new Student_System();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        s1.setData(name, marks);

        System.out.print("Enter Extra MArks: ");
        int extraMarks = sc.nextInt();

        s1.addMarks(extraMarks);
        s1.showData();

    }
}