import java.util.Scanner;
public class Repeat1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Your array");
            for(int i=0; i<array.length; i++){
                System.out.println(array[i]);
            }
    }
}