import java.util.*;

public class Repeart {

       
    public static void printArray(int arr[]){
        for(int i=0; i < arr.length; i++){
           System.out.print(arr[i] + " "); 
        }
           System.out.println(); 
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }

        printArray(array);
    }
}