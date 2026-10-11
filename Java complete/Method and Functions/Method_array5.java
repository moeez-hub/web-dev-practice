import java.util.Scanner;
public class Method_array5
{
      public static void Even_Odd(int[] array) {
          int evencounter = 0;
          int oddcounter = 0;  
            for(int i = 0; i < array.length; i++) {
                  if(array[i] % 2 == 0) {
                        evencounter++;
                  }
                      else {
                            oddcounter++;                          
                      }  
            }
                        System.out.println(evencounter+" Even");
                        System.out.println(oddcounter+" Odd");  
      }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); 
      System.out.println("Enter size");
          int size = sc.nextInt();
      System.out.println("Enter array");
          int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }                
          System.out.println("Your answer");  
           Even_Odd(array); 
      
    
    }        









}