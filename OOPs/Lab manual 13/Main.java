public class Main {
    public static void main(String[] args) {
        
        FuelTank t1 = new FuelTank();
        FuelTank t2 = new FuelTank(12, 33.5);
       
        t1.setLitresFuel(30);
        t1.setMaxFuelCapacity(33.5);
        
        System.out.println("_____FuelTank State_____");
        t1.currentFuelLevel();
        System.out.println(t1.isFull() +"\n"+ t1.isEmpty());

        System.out.println("After adding or removing fuel");
        t1.addFuel(10);
        t1.removeFuel(2);
        t1.currentFuelLevel();

        Engine e1 = new Engine();
        Engine e2 = new Engine(12, "Sizuki", true, 120);
 
        e1.setEngineSize(212);
        e1.setEngineType("Honda");
        e1.setEngineRunning(false);
        e1.setTopSpeed(220);

        System.out.println("_____Engine State_____");

        e1.currentEngineState();

        System.out.println(e1.engineStart());
        System.out.println(e1.engineStop());

        Car c1 = new Car();
        Car c2 = new Car(e2, t2, "Honda", 2020, 12000);

        c1.setENGINE(e1);
        c1.setTANK(t1);
        c1.setMake("Toyota");
        c1.setModel(2025);
        c1.setPrice(324650);
    
        System.out.println("______Car State_____");
    
        c1.currentCarState();

        System.out.println("___Fueling___");
    
        System.out.println(c1.reFuel());
        System.out.println(c1.startCar());
        System.out.println(c1.stopCar());

        c1.currentCarState();

    }
}

