public class Person
{
    private String name;

    Person(String name)
    {
        this.name = name;
    }
    public void setName(String n)
    {
        this.name = n;
    }

    public String getName()
    {
        return name;
    }

}

class Student extends Person
{
    private int rollnum;
    Student(String name, int rollnum)
    {
        super(name);
        this.rollnum = rollnum;
    }
    public void setRollnum(int r)
    {
        this.rollnum = r;
    }

    public int getRollnum()
    {
        return rollnum;
    }

    public void Info()
    {
        System.out.println(getName());
        System.out.println(getRollnum());
    }
}

