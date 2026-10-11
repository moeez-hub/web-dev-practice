public class Task9 {

    static int[] arraySwapValues(int[] array) {

        int temp = array[0];

        for (int i = 0; i < array.length - 1; i++) {

            array[i] = array[i + 1];
        }

        array[array.length - 1] = temp;

        return array;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Array before swap:");
        printArray(array);

        arraySwapValues(array);

        System.out.println("Array after swap:");
        printArray(array);
    }

}