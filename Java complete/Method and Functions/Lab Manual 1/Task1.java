import java.util.Scanner;
public class Task1 {
    static void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
       System.out.println("Enter Your Age");
        int age = sc.nextInt();

        while(age <= 10 || age >= 70){
            age = sc.nextInt();
        }
            printInput(name, age);
    }

    static void printInput(String name, int age) {
            System.out.println(name +"\n"+ age);
    }        
        
    public static void main(String[] args) {
        getInput();
    }
}