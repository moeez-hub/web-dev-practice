import java.util.Scanner;
public class Task8 {
    static void fillArray(int[] array) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array Elements: ");
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
    }
    
    static void absoluteArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = Math.abs(array[i]);
        }
    }
    
    static void printArray(int[] array) {
         System.out.print("Array elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter size: ");
        int size = sc.nextInt();
        while(size < 0){
            System.out.print("Enter size greater then 0: ");
            size = sc.nextInt();
        }
        
        int[] array = new int[size];

        fillArray(array);
        absoluteArray(array);
        printArray(array);
    }
}