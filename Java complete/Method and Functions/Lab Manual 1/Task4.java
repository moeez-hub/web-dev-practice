import java.util.Scanner;
public class Task4
{
    static char charAtPosition(String word, int position)
    {
        char character = ' ';
        for(int i = 0;i <= word.length();i++)
        {
            if(position == i)
            {
                character = word.charAt(i);
                return character;
            }
        }
            return character;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Word");
        String word = sc.nextLine();
        System.out.println("Enter Position");
        int position = sc.nextInt();
        while(position < 0)
        {
            System.out.print("Position should be greater then or equal to 0");
            position = sc.nextInt();
        }
        char ch = charAtPosition(word, position);
        System.out.println(ch);
    }

}