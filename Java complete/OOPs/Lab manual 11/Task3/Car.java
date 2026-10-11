public class Car {

    private  Engine ENGINE;
    private FuelTank TANK;
    private String make;
    private int model;
    private double price;

    public Car() {
        this.ENGINE = new Engine(); 
        this.TANK = new FuelTank(); 
        this.make = "Suzuki";
        this.model = 2019;
        this.price = 0.0;
    }

    public Car(Engine engine, FuelTank tank, String make, int model, double price) {
        this.ENGINE = new Engine(engine); 
        this.TANK = new FuelTank(tank); 
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public int getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public double getMaxFuelCapacity() {
        return this.TANK.getMaxFuelCapacity();
    }

    public int getTopSpeed() {
        return this.ENGINE.getTopSpeed();
    }

    public double reFuel() {
        double need = TANK.getMaxFuelCapacity() - TANK.getLitresFuel();
        this.TANK.addFuel(need);
        System.out.println("Tank is full " + need + " litres added.");
        return need;
    }

    public boolean startCar() {
        if (ENGINE.isEngineRunning()) {
            System.out.println("Car  running!");
            return false;
        }

        else{
            this.ENGINE.startEngine();
            this.TANK.removeFuel(10);

            return true;
        }
    }

    public boolean stopCar() {
        if (!ENGINE.isEngineRunning()) {
            System.out.println("Car already stopped!");
            return false;
        }
       
        else{this.ENGINE.stopEngine();
        return true;
        }
    }

    public void currentCarState() {
        System.out.println("_____Car State_____");
        System.out.println("Make:  " + make);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("_____Engine_____");
        this.ENGINE.currentEngine();
        System.out.println("_____Fuel Tank____");
        TANK.currentFuelLevel();
    }
}