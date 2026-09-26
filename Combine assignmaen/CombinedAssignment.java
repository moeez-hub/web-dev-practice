import java.util.Scanner;
public class CombinedAssignment
{
        public static void main (String[] args)
    {
                Scanner scanner = new Scanner (System.in);
                
                System.out.println(" value of x ? ");
                
            int x = scanner.nextInt();

            x = x - 4;
            x = x % 7;

    
                System.out.println("value of x is :" + x);
                
                 System.out.println(" value of y ? ");
   
                double y = scanner.nextDouble();
                y = y * 4;
   
                            System.out.println(" value of y is : " + y);
   
               y = y/27;
                            System.out.println(" then y divide by 27 : " + y);  

                            

                                
                   
    }


    


}