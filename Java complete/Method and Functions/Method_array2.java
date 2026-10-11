import java.util.Scanner;
public class Method_array2
{
     public static int getSecondIndex(int[] array, int value) {
         int counter = 0;
        for(int i= 0; i < array.length; i++) {
           if(array[i] == value) {
               counter++; 
                  if (counter == 2) {
            return i;
              }  
           }
        } 
       
                return -1;
                
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter value");
      int value = sc.nextInt();
      System.out.println("Enter size"); 
       int size = sc.nextInt(); 
      int[] array = new int[size];
      System.out.println("Enter array element");
     for(int i = 0; i < size; i++) {
        array[i] = sc.nextInt();
     }          
      
      int index = getSecondIndex(array, value);
        if (index == -1) {
            System.out.println("-1");
        }
          else {
            System.out.println(value + " at index" + index);
          }  
    
    }        


}