import java.util.Scanner;
import java.util.Arrays;
public class Method_array8
{
     public static void arraySort(int[] array) {
       System.out.println("Sorted array");
        Arrays.sort(array);
     for(int i = 0; i < array.length; i++) {
       System.out.println(array[i]);    
     }   

     }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
      System.out.println("Enter size"); 
       int size = sc.nextInt(); 
      int[] array = new int[size];
      System.out.println("Enter array element");
     for(int i = 0; i < size; i++) {
        array[i] = sc.nextInt();
    }    
        arraySort(array);


    }
}