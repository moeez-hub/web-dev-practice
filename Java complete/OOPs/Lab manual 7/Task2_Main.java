public class Task2_Main {
    public static void main(String[] args) {
        Task2_Pet p1 = new Task2_Pet();
        Task2_Pet p2 = new Task2_Pet("tommy");
        Task2_Pet p3 = new Task2_Pet("dog", 5);
        Task2_Pet p4 = new Task2_Pet("asto", "goat", 7);

        p1.setName("tedu");
        p1.setAnimal("parrot");
        p1.setAge(12);

        p2.setAnimal("dog");
        p2.setAge(4);

        p3.setName("Tommy2");

        p1.display();
        p2.display();
        p3.display();
        p4.display();

       System.out.println(p1 +"\n"+ p2 +"\n"+ p3 +"\n"+ p4);
        System.out.println(p1.compare(p2));
    
        p1.copy(p2);
    }
}
