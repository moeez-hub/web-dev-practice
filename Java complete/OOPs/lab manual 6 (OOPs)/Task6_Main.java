public class Task6_Main {
    public static void main(String[] args) {
        Task6_Car car = new Task6_Car();

        car.setYearModel("2020");
        car.setMake("loya");
        car.setSpeed(100);
        
        System.out.println("Car model: " + car.getYearModel() +"\n"+ "Make: " + car.getMake());
       
        System.out.println("Speed after accelerater");
        for(int i = 0; i < 5; i++){
            // System.out.println(car.getSpeed());
            car.accelerate();
             System.out.println(car.getSpeed());
        }
    
        System.out.println("Car after brake");
        for(int i = 0; i < 5; i++){
            car.brake();
           System.out.println(car.getSpeed()); 
        }
   
    }
}
