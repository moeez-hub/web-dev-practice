package task2;

class Car extends PoweredVehicle {
private int engineSize;

    Car(){

    }

    Car(int engineSize){
        this.engineSize = engineSize;
    }

    Car(String brand, String model, String fuelType, int engineSize){
        super(brand, model, fuelType);
        this.engineSize = engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void display(){
       
        super.display();
        System.out.println("Engine Size : "+ getEngineSize() +"cc");
    }
}
