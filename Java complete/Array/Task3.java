import java.util.Scanner;
public class Task3
 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
     System.out.println("Enter Word"); 
        String str = sc.nextLine();  
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);  

            if (ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U') {
                count++;
            }
        }

        System.out.println("String: " + str);
        System.out.println("Total vowels: " + count);
    }
}