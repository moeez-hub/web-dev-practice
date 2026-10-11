import java.util.*;
public class Task9_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter FTemperature: ");
        double fTemper = sc.nextDouble();

        Task9_Temperature temp = new Task9_Temperature(); 
    
        temp.setFahrenheit(fTemper);

        System.out.println(temp.getFahrenheit() +"\n"+ "Into Celsius: "+ temp.getCelsius() +"\n"+ "Into Kelvin: " + temp.getKelvin());
    }
}
