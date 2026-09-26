abstract class Vehicle {
    abstract void move();
}

class Car extends Vehicle{
    
    public void move(){
        System.out.println("car is moving");
    }
}

class Bike extends Vehicle{
    public void move(){
        System.out.println("Bike is moving");
    }
}