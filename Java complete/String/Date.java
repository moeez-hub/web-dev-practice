import java.util.Scanner;
public class Date
{
    public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
       System.out.println("Enter value for a day");
      int day = sc.nextInt();
        System.out.println("Enter value for a month");
      int month = sc.nextInt();
        System.out.println("Enter value for a year");
      int year = sc.nextInt();      
   if(day <= 0 || month <= 0 || year <= 0) {
         System.out.println("The entered date : " + day +"-"+ month +"-"+ year + " is invalid");
    }
      else if(year < 1980 || year > 2018) {
         System.out.println("The entered date : " + day +"-"+ month +"-"+ year + " is invalid");
      }    
        else if(month < 1 || month > 12) {
             System.out.println("The entered date : " + day +"-"+ month +"-"+ year + " is invalid");
        }
        else if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day <= 31) {
            System.out.println("The entered date : " + day +"-"+ month +"-"+ year + " is valid");
        }
          else if((month == 4 || month == 6 || month == 9 || month == 11) && day <= 30) {
             System.out.println("The entered date : " + day +"-"+ month +"-"+ year + " is valid");
          }   
            else if((month == 2) && day <= 29) {
                 System.out.println("The entered date : " + day +"-"+ month +"-"+ year + " is valid");
            }
              else {
                System.out.println("the entered date " + day +"-"+ month +"-"+ year + " is invalid");
              }  







  }  

}