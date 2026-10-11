public class Car {
    private Engine ENGINE;
    private FuelTank TANK;
    private String make;
    private int model;
    private double price;

    public Car() {
        this.ENGINE = new Engine();

        this.TANK = new FuelTank();
    }

    public Car(Engine engine, FuelTank fuelTank, String make, int model, double price) {
        this.ENGINE = new Engine(engine);
        this.TANK = new FuelTank(fuelTank);
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public void setENGINE(Engine eNGINE) {
        ENGINE = eNGINE;
    }

    public Engine getENGINE() {
        return ENGINE;
    }

    public void setTANK(FuelTank tANK) {
        TANK = tANK;
    }

    public FuelTank getTANK() {
        return TANK;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getModel() {
        return model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public double getMaxFuelCapacity() {
        return this.TANK.getMaxFuelCapacity();
    }

    public int getTopSpeed() {
        return this.ENGINE.getTopSpeed();

    }

    public double reFuel() {
        double need = this.TANK.getMaxFuelCapacity() - this.TANK.getLitresFuel();
        this.TANK.addFuel(need);
        System.out.println("Tank need" + need + "Fuel");
        return need;
    }

    public boolean startCar() {
        if (this.ENGINE.getEngineRunning()) {
            System.out.println("Car failed to start");
            return false;
        }

        else {
            this.ENGINE.engineStart();
            this.TANK.removeFuel(10);
            return true;
        }
    }

    public boolean stopCar() {
        if (!this.ENGINE.getEngineRunning()) {

            System.out.println("Car fails to stop");
            return false;
        } else {
            this.ENGINE.engineStop();
            return true;
        }
    }

    public void currentCarState() {
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("_____Engine_____");
        this.ENGINE.currentEngineState();
        System.out.println("_____Fuel Tank____");
        TANK.currentFuelLevel();
    }
}