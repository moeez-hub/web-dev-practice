package task2;

public class PoweredVehicle extends Vehicle {
    private String fuelType;

    PoweredVehicle() {

    }

    PoweredVehicle(String fuelType){
        this.fuelType = fuelType;
    }

    PoweredVehicle(String brand, String model, String fuelType){
        super(brand, model);
        this.fuelType = fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void display(){
        
        super.display();
        System.out.println("Fuel Type : "+ getFuelType());
    }

}
