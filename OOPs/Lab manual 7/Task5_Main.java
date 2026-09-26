public class Task5_Main {
    public static void main(String[] args) {
        Task5_Car c1 = new Task5_Car();
        Task5_Car c2 = new Task5_Car("2025", "Toyota", 34);
    
        c1.setYearModel("2020");
        c1.setMake("Honda");
        c1.setSpeed(67);
    
        c1.display();
        c2.display();

        System.out.println(c1 +"\n"+ c2);
        System.out.println(c1.compare(c2));
        c1.copy(c2);
        
    }
}
