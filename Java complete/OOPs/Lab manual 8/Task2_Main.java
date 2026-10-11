public class Task2_Main {
    public static void main(String[] args) {
        Task2_Pet p1 = new Task2_Pet();
        Task2_Pet p2 = new Task2_Pet("horse", "herbiver", 11);
    
        p1.setName("Tomy");
        p1.setAnimal("Dog");
        p1.setAge(7);

        p1.display();
        p2.display();

        System.out.println(p1.compare(p2) +"\n"+ p1.isNotEqual(p2));

        System.out.println(p1.toString() +"\n"+ p2.toString());

        p1.copy(p2);

        Task2_Pet p3 = p1.create(p2);

        System.out.println(p3.toString());

    }
}
