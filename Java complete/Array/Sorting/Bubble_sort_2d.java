
import java.util.Scanner;               
public class Bubble_sort_2d {
                                                            // Is ma 2d array ki rows sort honi hein bs
    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {             
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Rows: ");
        int rows = sc.nextInt();
        System.out.print("Columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Array ke elements do:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < rows; i++) {         
            for (int j = 0; j < cols - 1; j++) { 
                for (int k = 0; k < cols - 1 - j; k++) {
                    if (arr[i][k] > arr[i][k + 1]){
                        int temp = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Row-wise sorted 2D array:");
        print2DArray(arr); 
    }
}