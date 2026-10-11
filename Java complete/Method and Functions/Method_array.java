import java.util.Scanner;
public class Method_array
{
     public static void GreaterArray(int[] array, int number) {
       for(int i = 0; i < array.length; i++) { 
        if(array[i] > number) {
            System.out.println(array[i]);
        }
      }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
           System.out.println("Enter n value");
           int n = sc.nextInt();
           System.out.println("Enter Size");
           int size = sc.nextInt();
          System.out.println("Enter Array number"); 
           int[] array = new int[size];
           for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
           }        
          System.out.println("Your array");   
             GreaterArray(array, n);   
        
        
        }









}