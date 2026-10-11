public class RunStudent {
    public static void main(String[] args) {
        final int size = 6;
        Task1_Student[] s = new Task1_Student[size];

        Task1_Student s1 = new Task1_Student();
        Task1_Student s2 = new Task1_Student(101, "Ali", "Akbar", 2.50);
        Task1_Student s3 = new Task1_Student(102, "Sara", "Khan", 2.80);
        Task1_Student s4 = new Task1_Student(103, "Ahmed", "Raza", 3.10);
        Task1_Student s5 = new Task1_Student(104, "Ayesha", "Iqbal", 3.40);
        Task1_Student s6 = new Task1_Student(s3);

        s1.setId(100);
        s1.setFirstName("Moeez");
        s1.setLastName("Nawaz");
        s1.setGpa(4.52);

        s[0] = s1;
        s[1] = s2;
        s[2] = s3;
        s[3] = s4;
        s[4] = s5;
        s[5] = s6;

        System.out.println("Student Data");
        Task1_Student.print(s);

        if (s[5].isEqual(s[2])) {
            System.out.println("Student 6 and Student 3 IDs are equal");
        } else {
            System.out.println("IDs are NOT equal");
        }

        System.out.println(Task1_Student.linearSearch(s, 102));

        Task1_Student.sort(s);
        System.out.println("After Sorting");
        Task1_Student.print(s);
      
        System.out.println(Task1_Student.searchByGpa(s, 3));
      
        Task1_Student.search(s, 3.10);
    }
}