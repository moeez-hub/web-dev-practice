import java.util.Scanner;
import java.util.Arrays;
public class Method_array9
{
     public static void Sortarray(String[] array) {
       System.out.println("Sorted words");
        Arrays.sort(array);
     for(int i = 0; i < array.length; i++) {
       System.out.println(array[i]);    
     }   

     }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
      System.out.println("Enter size"); 
       int size = sc.nextInt(); 
       sc.nextLine();
      String[] array = new String[size];
      System.out.println("Enter array word");
     for(int i = 0; i < size; i++) {
        array[i] = sc.nextLine();
    }    
        Sortarray(array);


    }
}