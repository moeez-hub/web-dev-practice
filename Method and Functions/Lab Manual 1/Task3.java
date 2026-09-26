import java.util.Scanner;
public class Task3
{
    static void printTable(int number, int start, int end)
    {
        // int table;
    //   while(start > 0 && end > start){
    //     start = sc.nextInt(); 
    //     end = sc.nextInt();
    //   }  
        for(int i = start;i <= end;i++)
        {
            System.out.println(number*i);
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number");
        int number = sc.nextInt();

        while(number <= 0)
        {
            System.out.print("Enter Number Should be greater then 0");
            number = sc.nextInt();
        }

        System.out.print("Enter Start Number");
        int start = sc.nextInt();
       
        System.out.print("Enter End Number");
        int end = sc.nextInt();
       
        while(start >= end)
        {
            System.out.print("Enter Start Number Should be less then End number");
            start = sc.nextInt();
        }


        printTable(number, start, end);
    }
}