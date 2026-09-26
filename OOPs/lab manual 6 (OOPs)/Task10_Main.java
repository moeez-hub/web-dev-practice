import java.util.Scanner;

public class Task10_Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        int temp = input.nextInt();

        Task10_Substance s = new Task10_Substance();
        s.temperature = temp; // direct assign

        System.out.println(s.isEthylFreezing() + " " + s.isEthylBoiling());
        System.out.println(s.isOxygenFreezing() + " " + s.isOxygenBoiling());
        System.out.println(s.isWaterFreezing() + " " + s.isWaterBoiling());

    }
}