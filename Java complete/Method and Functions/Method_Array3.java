import java.util.Scanner;

public class Method_Array3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value : ");
        int value = sc.nextInt();

        System.out.print("Enter occurenece : ");
        
        int occurenece =sc.nextInt();
        while(occurenece < 1){
            System.out.println("Enter valid value greater than or = to 1");
            occurenece = sc.nextInt();
        }

        System.out.println("Enter size");
        int size = sc.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println(getNthIndex(array, occurenece, value));
    }

    public static int getNthIndex(int[] array, int occurrence,int value){

        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                count++;
                if (count == occurrence) {
                    return i;
                }
            }

        }

        return -1;

    }
}
