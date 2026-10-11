import java.util.Scanner;
public class Method_array6
{
     public static void copyReverseArray(int[] array1, int[] array2) {
        for (int i = array1.length-1; i >= 0; i--) {
            array2[i] = array1[array1.length - 1 - i];
        }
          System.out.println("Your Reverse"); 
           for (int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);
         }     
            
     }

   public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
      System.out.println("Enter size"); 
       int size = sc.nextInt(); 
      int[] array1 = new int[size];
       int [] array2 = new int[size];      
      System.out.println("Enter array element");
     for(int i = 0; i < size; i++) {
        array1[i] = sc.nextInt();
     }          
        copyReverseArray(array1, array2);
   
   
   
   }     



}