import java.util.Scanner;
public class Array_sort {
    public static void Print(int arr[]) {
       for(int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
       } 
          System.out.println();  
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
    
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
                Print(arr);
    }
}