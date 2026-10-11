public class Task8_Main {
    public static void main(String[] args) {
        Task8_Temperature t1 = new Task8_Temperature();
        Task8_Temperature t2 = new Task8_Temperature(23.10);
        
        t1.setFahrenheit(56.45);

        t1.display();
        t2.display();

        System.out.println(t1.compare(t2));

        System.out.println(t1 +"\n"+ t2);

        t1.copy(t2);
    }
}
