import java.util.Scanner;
public class Reverse 
{
     public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in); 
     System.out.println("Enter word");   
       String word = sc.nextLine(); 
        String rev = new StringBuilder(word).reverse().toString();
            System.out.println(rev);
 
 
  }  
}