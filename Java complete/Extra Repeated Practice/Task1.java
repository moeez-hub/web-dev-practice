import java.util.Scanner;
public class Task1 {
      public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int size = 10;
        int[] arr = new int[size];
       for(int i=0; i<size; i++) {
        arr[i] = sc.nextInt();
        }     
      
        for(int i = 0; i < size; i++) {
            sum+=arr[i];
            
        }
            System.out.println(sum);

           int even_counter = 0;
           int odd_counter = 0;

          for(int i = 0; i < size; i++) {
            if(arr[i]%2 == 0) {
                even_counter++;
            }
                else{
                    odd_counter++;
                }
          } 
               System.out.println("Even"+ even_counter +"\n"+ "Odd"+ odd_counter); 


      }

}