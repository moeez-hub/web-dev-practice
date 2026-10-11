import java.util.Scanner;
public class Login
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter New Password");
        String pass = sc.nextLine();

        System.out.println("Comfirm Password");
        String pass2 = sc.nextLine();

        if(pass.equals(pass2))
        {

            System.out.println("Enter Your Password");
            String pass3 = sc.nextLine();

            if(pass3.equals(pass))
            {
                System.out.println("Next Page");
            }
            else
            {
                System.out.println("Invalid Password");
            }

        }
        else
        {
            System.out.println("Password are not same");
        }


    }
}