package task2;

public class Main {
    public static void main(String[] args) {

        System.out.println("_____Vehicle State_____");
        Vehicle v = new Vehicle();

        v.setBrand("Honda");
        v.setModel("2020");

        v.display();

        System.out.println(".....Venhicle 2.....");

        Vehicle v2 = new Vehicle("Sizuki", "2022");

        v2.display();

        System.out.println("_____SkateBoard State_____");

        SkateBoard s = new SkateBoard();

        s.setBrand("American");
        s.setModel("2021");
        s.setBoardLength(12.0);
        s.setNumberOfWheel(2);

        s.display();

        System.out.println(".....Skate Board 2.....");

        SkateBoard s2 = new SkateBoard("Germany", "2025", 13.0, 2);

        s2.display();

        System.out.println("_____Bicycle State_____");

        Bicycle b = new Bicycle();
        
        b.setBrand("huawie");
        b.setModel("2024");
        b.setGearCount(2);

        b.display();

        System.out.println(".....Bicycle 2.....");

        Bicycle b2 = new Bicycle("Japanese", "2022", 2);
        
        b2.display();

        System.out.println("_____Powered Vehicle State_____");
        PoweredVehicle p = new PoweredVehicle();

        p.setBrand("Samsung");
        p.setModel("2019");
        p.setFuelType("Petrol");
    
        p.display();

        System.out.println(".....Powered Vehicle 2.....");

        PoweredVehicle p2 = new PoweredVehicle("kawasaki", "2026", "Dliesel");

        p2.display();

        System.out.println("_____Car State_____");

        Car c = new Car();
        
        c.setBrand("Toyota");
        c.setModel("2023");
        c.setFuelType("Petrol");
        c.setEngineSize(3000);

        c.display();

        System.out.println(".....Car 2.....");

        Car c2 = new Car("Honda", "2020", "Petrol", 1600);

        c2.display();
    
        System.out.println("_____Jet State_____");

        Jet j = new Jet();

        j.setBrand("Chinese");
        j.setModel("2010");
        j.setFuelType("Petro;");
        j.setEngineCount(6);

        j.display();

        System.out.println(".....Jet 2.....");

        Jet j2 = new Jet("Russian", "2015", "diesel", 4);

        j2.display();

        System.out.println("\n_____Now Using Array for Display_____");
        Vehicle[] array = new Vehicle[6];
        
        array[0] = v;
        array[1] = s;
        array[2] = b;
        array[3] = p;
        array[4] = c;
        array[5] = j;
    
        Vehicle.display(array);
    }
}
