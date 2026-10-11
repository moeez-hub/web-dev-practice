public class Task1_Student {
    private int id;
    private String firstName;
    private String lastName;
    private double gpa;

    Task1_Student() {

    }

    Task1_Student(int id, String firstName, String lastName, double gpa) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    Task1_Student(Task1_Student s) {

        this.id = s.id;
        this.firstName = s.firstName;
        this.lastName = s.lastName;
        this.gpa = s.gpa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void print() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("GPA: " + getGpa());
    }

    // Print array
    public static void print(Task1_Student[] s) {
        for (int i = 0; i < s.length; i++) {
            s[i].print();
        }
    }

    public String toString() {
        return getId() + " " + getFirstName() + " " + getLastName() + " " + getGpa();
    }

    public boolean isEqual(Task1_Student s) {
        return this.id == s.id;
               
    }

    public boolean isGPALesser(Task1_Student s) {
        return this.gpa < s.gpa;
    }

    // Selection Sort
    static void sort(Task1_Student[] s) {
        for (int i = 0; i < s.length; i++) {
            int min = i;
            for (int j = i + 1; j < s.length; j++) {
                if (s[j].isGPALesser(s[min])) {
                    min = j;
                }
            }
            Task1_Student temp = s[i];
            s[i] = s[min];
            s[min] = temp;
        }
    }

    static int linearSearch(Task1_Student[] s, int key) {
        // Linear Search
        for (int i = 0; i < s.length; i++) {
            if (s[i].id == key) {
                return i;
            }

        }
        return -1;

    }

    static int searchByGpa(Task1_Student[] s, int key) {
        int search = key;
        int left = 0;
        int right = s.length - 1;
       

        while (left <= right) {
         int mid = (left + right) / 2;
             if (s[mid].gpa == key) {
                return mid;
            } else if (s[mid].gpa <= key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    static void search(Task1_Student[] s, double key) {
        boolean found = false;
        for (int i = 0; i < s.length; i++) {
            if (s[i].gpa == key) {
                s[i].print();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }
}
