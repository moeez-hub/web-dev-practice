import java.util.Scanner;
public class Task7
{
    static void fillArray(int[] array)
    {
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        System.out.println("Enter Array: ");
        for(int i=0;i<array.length;i++)
        {
            array[i] = sc.nextInt();
        }

    }

    static void printSumAverage(int[] array)
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0;i < array.length;i++)
        {
            sum = sum + array[i];
        }

        double average = sum/array.length;

        System.out.println("Sum of Array: " +sum+ "\n" +"Average of Array: " +average);

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        while(size <= 0)
        {
            System.out.print("Enter size greater then 0: ");
            size = sc.nextInt();
        }

        int[] array = new int[size];

        fillArray(array);
        printSumAverage(array);
    }
}