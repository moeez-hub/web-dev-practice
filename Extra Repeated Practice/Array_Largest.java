import java.util.Scanner;
public class Array_Largest
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

        int largest = array[0];
        for(int i = 0;i<array.length;i++)
        {
            if(array[i] > largest)
            {
                largest = array[i];
            }

        }
        System.out.println(largest);
    }
}