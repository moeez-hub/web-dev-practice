public class Inher
{
    private String name;

    // Setter
     void setName(String n)
    {
        name = n;
    }

    // Getter
     String getName()
    {
        return name;
    }
}

 class Student extends Inher
{
    public void showName()
    {
        System.out.println("Name: " + getName());
    }
}

