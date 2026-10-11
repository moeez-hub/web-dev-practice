public class UsingStudent {
    public static void main(String[] args) {
        Student s1 = new Student(55, "Moeez");
        Student s2 = new Student(59, "Ali");
        Student s3 = new Student(58, "Ahmad");
        Student s4 = new Student(55, "Moeez");
        Student s5 = new Student(90, "Aman");

        System.out.println("Display all studends state");

        s1.displayState();
        s2.displayState();
        s3.displayState();
        s4.displayState();
        s5.displayState();

        System.out.println("Comparison of each pair......");

        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(s4.compareTo(s5));
    }
}
