public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = { 324, 45, 78, 34, 12 };

        for (int i = 0; i < arr.length; i++) {
            int mini = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}