public class Task9_Temperature {
double fTemp;

    public void setFahrenheit(double ftemp) {
        this.fTemp = ftemp;
    }

    public double getFahrenheit() {
        return this.fTemp;
    }

    double getCelsius(){
        return (5.0/9.0) * (fTemp - 32.0);
    }

    double getKelvin(){
        return  ((5.0/9.0) * (fTemp - 32.0)) + 273.0; 
    }


}
