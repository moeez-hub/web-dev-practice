import java.util.Scanner;

public class Task10 {
    static int[] reverseArray(int[] array) {
         int[] temp = new int[array.length];
       int index = 0;
      
         for (int i = array.length-1; i >= 0; i--) {
            temp[index] = array[i];
            index++;
        }
        return temp;
    }

    static void printArray(int[] array) {
        
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i]);
        }
         System.out.println("After Reverse: ");     
        // reverseArray(array);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

        int[] arrray2 = reverseArray(array);
     System.out.println("Before Reverse: ");
        printArray(array2);
    }

}