import java.util.Scanner;
public class Extra
// {
//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//            int counter = 0; 
//          System.out.println("Enter size");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//          System.out.println("Enter array elements");
//       for(int i = 0; i < size; i++) {
//         arr[i] = sc.nextInt();
//       }  
//         for(int i = 0; i < size; i++){
//          if(arr[i] % 2 == 0) {
//             counter++;
//          }   
//       }    
//           System.out.println(counter);  
    
    
      
//     }
// }


{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter rows then columns");
    int rows = sc.nextInt();
    int cols = sc.nextInt();
   int[][] array = new int[rows][cols];
    System.out.println("Enter Array");
   for(int i = 0; i < rows; i++) {
    for(int j = 0; j < cols; j++) {
      array[i][j] = sc.nextInt();
    }
   }   

   int sum = 1;
   for(int i = 0; i < rows; i++) {
    for(int j = 0; j < cols; j++) {
    array[i][j] = array[i][j] + sum;
    }
   }   
   
    System.out.println("Your Array");

   for(int i = 0; i < rows; i++) {
    for(int j = 0; j < cols; j++) {
     System.out.print(array[i][j] + " ");
    }
      System.out.println();
   }   
   
   
   
   
   
   }
}