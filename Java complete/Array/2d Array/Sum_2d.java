import java.util.Scanner;
public class Sum_2d
{
      public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter Rows and Columns ");
   int rows = sc.nextInt();
   int cols = sc.nextInt();
   int[][] array1 = new int[rows][cols];
    System.out.println("Enter 1st array");
  for(int i = 0; i < rows; i++) {
    for(int j = 0; j < cols; j++) {
        array1[i][j] = sc.nextInt();
    }
    //    System.out.print(array1[i][j]+" ");
  }       
System.out.println("Enter 2nd array");
int[][] array2 = new int[rows][cols];
  for(int i = 0; i < rows; i++) {
    for(int j = 0; j < cols; j++) {
        array2[i][j] = sc.nextInt();
    }
    //    System.out.print(array2[i][j]+" "); 
  }          
      System.out.println("Sum of two arrays");
        int sum[][] = new int [rows][cols];
   for(int i = 0; i < rows; i++) {
    for(int j = 0; j < cols; j++)  { 
     sum[i][j] = array1[i][j] + array2[i][j];
   System.out.print(sum[i][j]+" "); 
   }
      System.out.println();    

}



   }

}