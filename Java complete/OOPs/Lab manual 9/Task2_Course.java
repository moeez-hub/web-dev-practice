public class Task2_Course {
    private String code;
    private String name;
    private int credits;

    Task2_Course() {

    }

    Task2_Course(String code, String name, int credits) {
        this.code = code;
        this.name = name;
        this.credits = credits;
    }

    Task2_Course(Task2_Course c) {
        this.code = c.code;
        this.name = c.name;
        this.credits = c.credits;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    void print() {
        System.out.println("Code : " + getCode() + "\n" + "Name : " + getName() + "\n" + "Credits : " + getCredits());
    }

    static void print(Task2_Course[] c) {
        for (int i = 0; i < c.length; i++) {
            c[i].print();
        }
    }

    boolean isEqual(Task2_Course c) {
        return this.getCode().equals(c.getCode()) && this.getName().equals(c.getName())
                && this.getCredits() == c.getCredits();
    }

    static void sort(Task2_Course[] s) {
        for (int i = 0; i < s.length; i++) {
            int mini = i;
            for (int j = i + 1; j < s.length; j++) {
                if (s[j].name.compareTo(s[mini].name) < 0) {
                    mini = j;
                }

            }
            Task2_Course temp = s[i];
            s[i] = s[mini];
            s[mini] = temp;
        }
        // Task2_Course.print(s);
    }

    static int linearSearch(Task2_Course[] c, String key) {
        for (int i = 0; i < c.length; i++) {
            if (c[i].code.equals(key)) {
                return i;
            }
        }
        return -1;
    }

    static int search(Task2_Course[] s, String key) {
        int l = 0;
        int r = s.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (s[mid].name.equals(key)) {
                return mid;
            } else if (s[mid].name.compareTo(key) < 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}