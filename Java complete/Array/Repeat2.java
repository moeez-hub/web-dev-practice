import java.util.Scanner;

public class Repeat2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = { 5, 7, 3, 3, 9, 2, 6, 8, 7, 3, 2 };

        char charac = sc.next().charAt(0);

        int max = num[0];
        if (charac == 'l') {
            for (int i = 0; i < num.length; i++) {
                if (num[i] > max) {
                    max = num[i];
                }
            }

            for (int i = 0; i < num.length; i++) {
                if (num[i] == max) {
                    System.out.println(max + " at index " + i);
                }
            }
        }
    }
}
