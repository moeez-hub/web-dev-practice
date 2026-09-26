
public class Task5_Car {
    private String yearModel;
    private String make;
    private int speed;

    Task5_Car() {

    }

    Task5_Car(String yearmodel, String make, int speed) {
        this.yearModel = yearmodel;
        this.make = make;
        this.speed = speed;
    }

    void display() {
        System.out.println(getYearModel() + "\n" + getMake() + "\n" + getSpeed());
    }

    void setYearModel(String y) {
        this.yearModel = y;
    }

    void setMake(String m) {
        this.make = m;
    }

    void setSpeed(int s) {
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

    boolean compare(Task5_Car c){
        return this.getYearModel().equals(c.getYearModel()) && this.getMake().equals(c.getMake()) && this.getSpeed() == c.getSpeed();
    }
    void accelerate() {
        this.speed += 5;
    }

    void brake() {
        this.speed -= 5;
    }

    void copy(Task5_Car c) {
        c.yearModel = this.yearModel;
        c.make = this.make;
        c.speed = this.speed;
    }

    public String toString() {
        return getYearModel() + " " + getMake() + " " + getSpeed();
    }
}
