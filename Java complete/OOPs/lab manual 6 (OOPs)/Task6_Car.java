public class Task6_Car {
    String yearModel;
    String make;
    int speed;
    
    void setYearModel(String y){
        this.yearModel = y;
    }

    void setMake(String m){
        this.make = m;
    }

    void setSpeed(int s){
        this.speed = s;
    }
    
    String getYearModel() {
        return this.yearModel;
    }

    String getMake() {
        return this.make;
    }

    int getSpeed() {
        return this.speed;
    }

    void accelerate(){
        this.speed += 5;
    }

    void brake(){
        this.speed -= 5;
    }
}
