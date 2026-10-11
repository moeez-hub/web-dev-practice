public  class Repeat_Student {
private String name;
private int age;

    // Repeat_Student(String name, int age){
    //     this.name = name;
    //     this.age = age;
    // }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Repeat_Student s = new Repeat_Student();

        s.setName("Moeez");
        s.setAge(16);
        System.out.println(s.getName() +"\n"+ s.getAge());
    }
}
