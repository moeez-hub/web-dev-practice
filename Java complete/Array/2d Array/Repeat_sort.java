import java.util.Arrays;
public class Repeat_sort {
    public static void main(String[] args) {
        int[] array = { 3, 21, 432, 123, 2, 5 };

        Arrays.sort(array);
        // int temp = 0;
        

        //     for(int j =0; j< array.length-1; j++){
        //     for (int i = 0; i < array.length-1-j; i++) {
        //         if (array[i] > array[i + 1]) {
        //             temp = array[i];
        //             array[i] = array[i + 1];
        //             array[i + 1] = temp;

        //         }
        //     }
        //     }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}