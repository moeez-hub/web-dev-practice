package task2;

public class Bicycle extends Vehicle{
private int gearCount;    

    Bicycle(){

    }

    Bicycle(int gearCount){
        this.gearCount = gearCount;
    }

    Bicycle(String brand, String model, int gearCount){
        super(brand, model);
        this.gearCount = gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public int getGearCount() {
        return gearCount;
    }

    public void display(){
        
        super.display();
        System.out.println("Gear : "+getGearCount());
    }
}
