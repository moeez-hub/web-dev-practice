import java.util.Scanner;
public class Task2
{
    static void wordsInfo(String word)
    {

        int counter = 1;
        int counter2 = 0;
        counter = word.length();
        for(int i = 0;i < word.length();i++)
        {
            char a = word.charAt(i);
            if(a == 'A' || a == 'a' || a == 'e' || a == 'E' || a == 'i' || a == 'I' || a == 'o' || a == 'O' || a == 'U' || a == 'u')
            {
                counter2++;
            }

        }
        System.out.println(counter +"\n"+ counter2);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        wordsInfo(word);
    }

}