import java.util.Scanner;

public class Task11 {
    static int smallest(int[] array) {
        int small = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
            }
        }
        System.out.println("Smallest: "+small);
    
        return small;
    }


    static int largest(int[] array) {
        int large = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > large) {
                large = array[i];
            }
        }
        System.out.println("Largest: "+large);
    
        return large;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = { 7, 8, 9, 8, 6, 65, 3, 4, 5, 45, 65, 34 };

        smallest(array);
       
        largest(array);
    }
}
