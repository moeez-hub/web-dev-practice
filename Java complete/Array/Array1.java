import java.util.Scanner;
import java.util.Arrays;

public class Array1 {
  public static void main(String[] args) {
    // int[] num = new int[3];
    // num[0] = 4;
    // num[1] = 4;
    // num[2] = 5;
    // System.out.println(num[0]);
    // System.out.println(num[1]);
    // System.out.println(num[2]);

    // Sorted arrays
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Size");
    int size = sc.nextInt();
    System.out.println("Eter Numbers");
    int numbers[] = new int[size];
    for (int i = 0; i < size; i++) {
      numbers[i] = sc.nextInt();
    }
    System.out.println("Sorted");
    Arrays.sort(numbers);
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
      // add comment
  }
}