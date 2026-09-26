public class Main {
    public static void main(String[] args) {
        FuelTank f = new FuelTank(0, 33.5);

        Engine e = new Engine(800, "petrol", true, 150);

        Car c = new Car(e, f,  "Suzuki", 2020, 150000);

        c.currentCarState();

       System.out.print("_____Fueling_____");
        c.reFuel();

        System.out.println("_____Starting_____");
        System.out.println(
            c.startCar());

        System.out.println("_____Stop_____");
       System.out.println(c.stopCar());

        c.currentCarState();

    }
}
