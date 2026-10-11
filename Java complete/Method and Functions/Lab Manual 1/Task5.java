import java.util.Scanner;
public class Task5
{
    static int compare(int firstNumber, int secondNumber)
    {
        if(firstNumber == secondNumber)
        {
            return 0;
        }
        else if(firstNumber > secondNumber)
        {
            return 1;
        }

        else 
        {
            return -1;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int secondNumber = sc.nextInt();

        int result = compare(firstNumber, secondNumber);
        System.out.print(result);
    }
}