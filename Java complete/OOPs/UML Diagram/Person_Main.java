public class Person_Main{
    public static void main(String[] agrs) {
        Person p = new Person();
        Student s = new Student();
        s.setRollNo(54);
        p.setName("Moeez");
        System.out.println(p.getName() +"\n"+ s.getRollNo());
    
    }
}