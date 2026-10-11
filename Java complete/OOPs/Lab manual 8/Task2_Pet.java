public class Task2_Pet {
    private String name;
    private String animal;
    private int age;

    Task2_Pet() {

    }

    // Task2_Pet(String name) {
    // this.name = name;
    // }

    // Task2_Pet(String animal, int age) {
    // this.animal = animal;
    // this.age = age;
    // }

    Task2_Pet(String name, String animal, int age) {
        this.name = name;
        this.animal = animal;
        this.age = age;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public void setAnimal(String m) {
        this.animal = m;
    }

    public String getAnimal() {
        return this.animal;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public int getAge() {
        return this.age;
    }

    void display() {
        System.out.println(getName() + "\n" + getAnimal() + "\n" + getAge());
    }

    void copy(Task2_Pet p) {
        p.name = this.name;
        p.animal = this.animal;
        p.age = this.age;
    }

    public String toString() {
        return this.name + " " + this.animal + " " + this.age;
    }

    boolean compare(Task2_Pet p){
        return this.name.equals(p.name) && this.animal.equals(p.animal) && this.age == p.age;
    }

    boolean isNotEqual(Task2_Pet p){
        return !this.getName().equals(p.getName()) && !this.getAnimal().equals(p.getAnimal()) && this.getAge() != p.getAge();
     }
     
     public Task2_Pet create(Task2_Pet p){
        String newName = this.getName() + p.getName();
        String newAnimal = this.getAnimal() + p.getAnimal();
        int newPrice = this.getAge() + p.getAge();

        return new Task2_Pet(newName, newAnimal, newPrice);
    }
}
