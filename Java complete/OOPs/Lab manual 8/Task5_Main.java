public class Task5_Main {
    public static void main(String[] args) {
        Task5_Car c1 = new Task5_Car();
        Task5_Car c2 = new Task5_Car("2020", "Toyota", 10);
        Task5_Car c3 = c1.create(c2);

        c1.setYearModel("2028");
        c1.setMake("BMW");
        c1.setSpeed(32);

        c1.display();
        c2.display();
        c3.display();

        System.out.println(c1.compare(c2) +"\n"+ c1.isNotEqual(c2));
        System.out.println(c1.toString() +"\n"+ c2.toString() +"\n"+ c3.toString());

        c1.copy(c2);
    }
}
