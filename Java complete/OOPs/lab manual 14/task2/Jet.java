package task2;

class Jet extends PoweredVehicle {
    private int engineCount;

    Jet(){

    }

    Jet(int engineCount){
        this.engineCount = engineCount;
    }

    Jet(String brand, String model, String fuelType, int engineCount){
        super(brand, model, fuelType);
        this.engineCount = engineCount;
    }

    public void setEngineCount(int engineCount) {
        this.engineCount = engineCount;
    }

    public int getEngineCount() {
        return engineCount;
    }

    public void display(){
        
        super.display();
        System.out.println("Fuel Type : "+ getFuelType());
    }
}
