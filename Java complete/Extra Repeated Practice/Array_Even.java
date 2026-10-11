import java.util.Scanner;
public class Array_Even
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
        int[] new_arr = new int[size];
        int index = 0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]%2 == 0)
            {
                new_arr[index] = array[i];
                index++;
            }
        }

        for(int i=0; i<index; i++) {
            System.out.print(new_arr[i]);
        }
    }
}