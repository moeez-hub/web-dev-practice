public class Task8_Temperature {
    private double fTemp;

    Task8_Temperature() {

    }

    Task8_Temperature(double ftemp) {
        this.fTemp = ftemp;
    }

    void display() {
        System.out.println(fTemp + "\n" + getCelsius() + "\n" + getKelvin());
    }

    boolean compare(Task8_Temperature t) {
        return this.fTemp == t.fTemp;
    }

    public void setFahrenheit(double ftemp) {
        this.fTemp = ftemp;
    }

    public double getFahrenheit() {
        return this.fTemp;
    }

    double getCelsius() {
        return (5.0 / 9.0) * (fTemp - 32.0);
    }

    double getKelvin() {
        return ((5.0 / 9.0) * (fTemp - 32.0)) + 273.0;
    }

    void copy(Task8_Temperature t) {
        t.fTemp = this.fTemp;
    }

    public String toString() {
        return fTemp + "  " + getCelsius() + "  " + getKelvin();

    }

    boolean isEqual(Task8_Temperature t){
        return this.fTemp == t.fTemp;
    }

    Task8_Temperature create(Task8_Temperature t){
        double newT = this.fTemp + t.fTemp;

        return new Task8_Temperature(newT);
    }
}
