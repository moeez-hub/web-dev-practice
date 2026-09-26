public class Car {
    private String brand;
    private String model;
    private int year;
    private Engine engine;

    Car(String brand, String model, int year, int horsPower, String type, int cylinder){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = new Engine(horsPower, type, cylinder);
    }

    void startCar(){
        engine.start();
    }

    void stopCar(){
        engine.stop();
    }

    Engine getEngine(){
        return engine;
    }

   void display(){
    System.out.println(brand +"\n"+ model +"\n"+ year +"\n"+ engine);
}
}
