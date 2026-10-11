import java.util.Scanner;
public class LoopPractice
{
    public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);
       System.out.println("Num ?");     
        int num = sc.nextInt();
        // for(int i = 1; i <= 1; i++) {
        //     if(num % 2 == 0) {
        //         System.out.println(num + " is even"); }
        //     else {
        //         System.out.println(num + " is odd");
        //     }    
            
        // }

           
               int p = 1; 
            while(p <= 1) {
                p++;
            }
            if(num % 2 == 0) {
                System.out.println(num + " is Even");
            }
           else {
            System.out.println(num + " is odd");
           } 



  }  
}