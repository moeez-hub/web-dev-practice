public class Task3_Main {
    public static void main(String[] args) {
        Task3_pet cat = new Task3_pet();
        Task3_pet dog = new Task3_pet();
        Task3_pet bird = new Task3_pet();

        dog.setName("kuta");
        dog.setAnimal("dog");
        dog.setAge(2);

        cat.setName("bili");
        cat.setAnimal("cat");
        cat.setAge(12);

        bird.setName("chiri");
        bird.setAnimal("sparrow");
        bird.setAge(3);
       
        System.out.println(dog.getName() + "\n" + dog.getAnimal() + "\n" + dog.getAge());
        System.out.println(cat.getName() + "\n" + cat.getAnimal() + "\n" + cat.getAge());
        System.out.println(bird.getName() + "\n" + bird.getAnimal() + "\n" + bird.getAge());
    }
}
