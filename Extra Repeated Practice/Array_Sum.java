import java.util.Scanner;
public class Array_Sum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }

        int sum = 0;
        for(int j=0;j<array.length;j++)
        {
            sum = sum + array[j];
        }
        System.out.println(sum);

    }
}