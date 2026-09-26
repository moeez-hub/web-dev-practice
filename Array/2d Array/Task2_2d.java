import java.util.Scanner;
public class Task2_2d
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows");
        int rows = sc.nextInt();
        System.out.println("Enter columns");
        int cols = sc.nextInt();
        System.out.println("Enter Array");
        int[][] array = new int[rows][cols];
        for(int i = 0;i < rows;i++)
        {
            for(int j = 0;j < cols;j++)
            {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int count = 0;
        System.out.println("your number");
        for(int i = 0;i < rows;i++)
        {
            for(int j = 0;j < cols;j++)
            {
                if(array[i][j] == num)
                {
                    System.out.println(" Row "+(i+1) + " Colmn " + (j+1));
                    count++;
                }
             }
                 
        }
                  System.out.println("Your number is repeated "+count+" times");       
    }
}