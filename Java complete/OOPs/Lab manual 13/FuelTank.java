public class FuelTank {
private double litresFuel;
private double maxFuelCapacity;

    FuelTank() {

    }

    FuelTank(double litresFuel, double maxFuelCapacity) {
        this.litresFuel = litresFuel;
        this.maxFuelCapacity = maxFuelCapacity;
    }

    FuelTank(FuelTank f) {
        this.litresFuel = f.litresFuel;
        this.maxFuelCapacity = f.maxFuelCapacity;
    }

    public void setLitresFuel(double litresFuel) {
        this.litresFuel = litresFuel;
    }

    public double getLitresFuel() {
        return litresFuel;
    }

    public void setMaxFuelCapacity(double maxFuelCapacity) {
        this.maxFuelCapacity = maxFuelCapacity;
    }

    public double getMaxFuelCapacity() {
        return maxFuelCapacity;
    }

    public void addFuel(double litres) {
        if (litresFuel + litres <= maxFuelCapacity) {
            litresFuel += litres;
            System.out.println(litres + "Litres fuel added");
        } else {
            System.out.println("Fuel capacity is full");
        }
    }

    public void removeFuel(double litres) {
        if (litresFuel - litres >= 0) {
            litresFuel -= litres;
            System.out.println(litres + "litres fuel removed ");
        }
    }

    public boolean isEmpty() {
        return litresFuel == 0;
    }

    public boolean isFull() {
        return litresFuel == maxFuelCapacity;
    }

    public void currentFuelLevel() {
        System.out.println("fuel in tank" + litresFuel + "\n" + "Fuel capacity" + maxFuelCapacity);
    }
}
