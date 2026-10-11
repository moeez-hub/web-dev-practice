import java.util.Scanner;
public class Bubblr_sort2_2d {
                                                                                                                   
    public static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ "");

            }
                System.out.println();
        }

    }
    	     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        
        System.out.print("Enter columns ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
            arr[i][j] = sc.nextInt();        

        }
    }
        // Is ma sirf array k columns sort hon gay
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                for(int k=0; k<rows-1-i; k++){
                   if(arr[k][j] > arr[k+1][j]){
                    int temp = arr[k][j];
                    arr[k][j] = arr[k+1][j];
                    arr[k+1][j] = temp;
                   } 
                }
            }
        }
           System.out.print(" Sorted array ") 
            printArray(arr);
    
    
    
    }
}