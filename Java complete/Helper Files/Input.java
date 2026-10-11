import java.util.Scanner;
public class Input
{
     public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value < 100");
    Float value = sc.nextFloat();
    while (value >=100;)
 {
        System.out.println("Enter valid value");
       value = sc.nextFloat(); 
    }
 }   
}