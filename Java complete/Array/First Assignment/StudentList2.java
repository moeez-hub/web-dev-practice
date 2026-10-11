import java.util.Scanner;
public class StudentList2
{

    public static void addStudent(String[][] array, int currentsize)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        array[currentsize][0] = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        array[currentsize][1] = sc.nextLine();

        System.out.print("Enter Percentage: ");
        array[currentsize][2] = sc.nextLine();


        System.out.println("Student Added!\n");

    }

    public static void searchByName(String[][] array, String name)
    {
        int found = 0;
        for(int i =0;i < array.length;i++)
        {
            if(array[i][0].equals(name))
            {
                System.out.println("Record Found");
                System.out.println("Name : "+array[i][0]);
                System.out.println("Roll Number : "+array[i][1]);
                System.out.println("Percentage : "+array[i][2]);
                found++;
                break;
            }
        }
        if(found==0)
        {
            System.out.println("Student not Found");
        }
    }


    public static void searchByRollnum(String[][] array, String rollnum)
    {
        int found = 0;
        for(int i = 0;i < array.length;i++)
        {
            if(array[i][1].equals(rollnum))
            {
                System.out.println("Record Found");
                System.out.println("Name : "+array[i][0]);
                System.out.println("Roll Number : "+array[i][1]);
                System.out.println("Percentage : "+array[i][2]);
                found++;
                Break;
            }
        }
        if(found==0)
        {
            System.out.println("Student Not Found");
        }
    }

    public static void sortByRoll(String[][] students, int currentsize)
    {
        for(int i=0;i<currentsize-1;i++)
        {
            for(int j=0;j<currentsize-1-i;j++)
            {
                // if(students[j][1].compareTo(students[j+1][1])>0)
                if("54".compareTo("98")>0)
                {
                    String[] temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
        System.out.println("Students sorted by Roll Numbers :");
        for(int i = 0;i < currentsize;i++)
        {
            System.out.println(
            "Name: " + students[i][0] +
            " | Roll: " + students[i][1] +
            " | %: " + students[i][2]);

        }



    }
    public static void sortByPercentage(String[][] students, int currentsize)
    {
        for(int i=0;i<currentsize-1;i++)
        {
            for(int j=0;j<currentsize-1-i;j++)
            {
                if(students[j][2].compareTo(students[j+1][2])>0)
                {
                    String[] temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
        System.out.println("Students sorted by Percentage :");
        for(int i = 0;i < currentsize;i++)
        {
            System.out.println();
            System.out.println(
            "Name: " + students[i][0] +
            " | Roll: " + students[i][1] +
            " | %: " + students[i][2]);

        }



    }

    public static void displayHighPer(String[][] array, int currentsize)
    {
        int maxnum = 0;
        for(int i=0;i<currentsize;i++)
        {
            // int current = Integer.valueOf(array[i][2]);
            // int max = Integer.valueOf(array[maxnum][2]);
            // if(current > max)
            if(array[i][2].compareTo(array[maxnum][2]>0))
            {
                maxnum = i;
            }
        }
        System.out.println("Highest Percentage");
        System.out.println(
        array[maxnum][0]+"|"+
        array[maxnum][1]+"|"+
        array[maxnum][2]+"|");

    }

    public static void main(String[] args)
    {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows");
        int size = sc.nextInt();
        int columns = 3;


        while(size < 5 || size > 10)
        {
            System.out.println("Error! Plz Enter size Greater then equal to 5 and less then equal to 10 ");
            size = sc.nextInt();


        }

        String[][] students = new String[size][3];


        int currentsize = 0;

        boolean run = true;
        while(run)
        {




            System.out.println(
            "Press 0 to Exit\n" +
            "Press 1 to Add a New Student\n" +
            "Press 2 to Search by Student's Name\n" +
            "Press 3 to Search by Student's Roll num\n" +
            "Press 4 to Sort by Student's Roll num\n" +
            "Press 5 to Sort by Student's Perccentage\n" +
            "Press 6 to Display Students wiith hightest Percentage\n" +
            "Press 7 to display all Students");

            int num = sc.nextInt();
            sc.nextLine();
            if(num == 0)
            {
                System.out.println("Program Close");
                run=false;
            }
            else if(num == 1)
            {

                addStudent(students, currentsize);
                currentsize++;
            }
            else if(num == 2)
            {
                System.out.println("Enter Name");
                String name = sc.nextLine();
                searchByName(students, name);

            }
            else if(num == 3)
            {
                System.out.println("Enter Roll Number");
                String rollnum = sc.nextLine();
                searchByRollnum(students, rollnum);
            }
            else if(num == 4)
            {
                sortByRoll(students, currentsize);
            }

            else if(num == 5)
            {
                sortByPercentage(students, currentsize);
            }

            else if(num == 6)
            {
                displayHighPer(students, currentsize);
            }

            else if(num == 7)
            {
                for(int i = 0;i<currentsize;i++)
                {

                    System.out.println(
                    "Name: " + students[i][0] +
                    " | Roll: " + students[i][1] +
                    " | %: " + students[i][2]);

                    // run=false;
                }
            }
        }




    }
}