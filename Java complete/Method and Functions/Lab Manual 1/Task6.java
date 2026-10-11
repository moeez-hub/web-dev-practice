import java.util.Scanner;
public class Task6
{
    static double getLength()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        double length = sc.nextDouble();

        return length;
    }

    static double getWidth()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Width: ");
        double width = sc.nextDouble();
    
        return width;

    }

    static double getArea(double length, double width)
    {
        double area = length * width;

        return area;
    }

    static void display(double length, double width, double area)
    {
        System.out.println("Length: "+length +"\n"+ "Width: "+width +"\n"+ "Area: " + area);
    }

    public static void main(String[] args) {
       double method1 = getLength();
       double method2 = getWidth();
       double method3 = getArea(method1, method2);

       
       display(method1, method2, method3);
    }
}