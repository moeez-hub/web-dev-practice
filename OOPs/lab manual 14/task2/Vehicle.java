package task2;
public class Vehicle {
private String brand;
private String model;

    Vehicle(){

    }

    Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void display(){
       
        System.out.println(getBrand()+"\n"+ getModel());
    }

    public static void display(Vehicle[] vehicles){
        for(int i=0; i<vehicles.length; i++){
            // Vehicle v = vehicles[i];

            vehicles[i].display();
        }
    }
}
