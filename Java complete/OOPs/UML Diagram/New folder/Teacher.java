public class Subject {
    private String title;
    private int code;

    public String getTitle() {
        return title;
    }

    public int getCode() {
        return code;
    }
}

class Teacher {
    private String name;
    private int salary;
    Subject english;

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}