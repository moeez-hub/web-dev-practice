import java.util.Scanner;
public class Strings 
{
    public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in); 
          System.out.println("Give me your CNIC number");
        String num = sc.nextLine();   
          String num1 = num.substring(0, 2);
          String num2 = num.substring(0, 1);
           if(num1.equals("34")) {
            System.out.println("The card holder is from province : Punjab");
                    System.out.println("The card holder is belong to division Gujranwala");
           } 
           else if (num2.equals("3")) {
               System.out.println("The card holder is from province : Punjab");
                 System.out.println("This person does not belong to Gujranwala");
           }
           else if(num2.equals("1")) {
               System.out.println("This person belong to province : Khyber Pakhtunkhawa");
          } 
          else if(num2.equals("2")) {
              System.out.println("This person belong to FATA");
           }  
            else if(num2.equals("4")) {
              System.out.println("This person is belong to province : Sindh");                     
            }     
               else if(num2.equals("5")) {
                System.out.println("They belong to provice : Balochistan");;   
              }
               else if(num2.equals("6")) {
                System.out.println("They belong to Provice : Punjab");
                   System.out.println("This person belong to Islamabad capital");    
              }
                else {
                    System.out.println("This person is not belong to Pakistan pharo anu");   
                 }     
  
                   char lastchar = num.charAt(12);
                  int lastdigit = lastchar - '0';
                if(lastdigit % 2 == 0) {   
                  System.out.println("Gender of card holder : female");
                }
                    else {
                        System.out.println("Gender of card holder : Male");
                    }    
  
  
  
  
  }  
}