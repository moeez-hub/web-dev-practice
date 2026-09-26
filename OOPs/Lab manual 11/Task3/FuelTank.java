public class FuelTank {
    private double litresFuel;
    private double maxFuelCapacity;

    FuelTank() {

    }

    FuelTank(double litresFuel, double maxFuelCapacity){
        this.litresFuel = litresFuel;
        this.maxFuelCapacity = maxFuelCapacity;
    }

    FuelTank(FuelTank f){
        this.litresFuel  = f.litresFuel;
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

    public void addFuel(double litres){
        if(litres + litresFuel < maxFuelCapacity){
            litresFuel += litres;
            System.out.println(litres +"Litres added");
        }
    
        else{
            System.out.println("\n"+"Fuel Capacity is full");
        }
    }

    public void removeFuel(double litres){
        if(litresFuel - litres >= 0){
        litresFuel -= litres;
            System.out.println(litres + "Litres removed");
    }
    }

    public boolean isEmpty(){
        return litresFuel == 0;
    }

    public boolean isFull(){
        return litresFuel == maxFuelCapacity;
    }

    public void currentFuelLevel(){
        System.out.println("Fuel in tank" +litresFuel +"\n"+ "Fuel capacity"+ maxFuelCapacity);
    }
}
